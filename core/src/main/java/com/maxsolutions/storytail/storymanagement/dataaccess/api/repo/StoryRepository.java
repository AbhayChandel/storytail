package com.maxsolutions.storytail.storymanagement.dataaccess.api.repo;

import static com.querydsl.core.alias.Alias.$;

import java.util.Iterator;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import com.devonfw.module.jpa.dataaccess.api.QueryUtil;
import com.devonfw.module.jpa.dataaccess.api.data.DefaultRepository;
import com.maxsolutions.storytail.storymanagement.dataaccess.api.StoryEntity;
import com.maxsolutions.storytail.storymanagement.logic.api.to.StorySearchCriteriaTo;
import com.querydsl.jpa.impl.JPAQuery;

/**
 * {@link DefaultRepository} for {@link StoryEntity}
 */
public interface StoryRepository extends DefaultRepository<StoryEntity> {

	/**
	 * @param criteria the {@link StorySearchCriteriaTo} with the criteria to
	 *                 search.
	 * @return the {@link Page} of the {@link StoryEntity} objects that matched the
	 *         search. If no pageable is set, it will return a unique page with all
	 *         the objects that matched the search.
	 */
	default Page<StoryEntity> findByCriteria(StorySearchCriteriaTo criteria) {

		StoryEntity alias = newDslAlias();
		JPAQuery<StoryEntity> query = newDslQuery(alias);

		String title = criteria.getTitle();
		if (title != null && !title.isEmpty()) {
			QueryUtil.get().whereString(query, $(alias.getTitle()), title, criteria.getTitleOption());
		}
		String summary = criteria.getSummary();
		if (summary != null && !summary.isEmpty()) {
			QueryUtil.get().whereString(query, $(alias.getSummary()), summary, criteria.getSummaryOption());
		}
		if (criteria.getPageable() == null) {
			criteria.setPageable(PageRequest.of(0, Integer.MAX_VALUE));
		} else {
			addOrderBy(query, alias, criteria.getPageable().getSort());
		}

		return QueryUtil.get().findPaginated(criteria.getPageable(), query, true);
	}

	/**
	 * Add sorting to the given query on the given alias
	 * 
	 * @param query to add sorting to
	 * @param alias to retrieve columns from for sorting
	 * @param sort  specification of sorting
	 */
	public default void addOrderBy(JPAQuery<StoryEntity> query, StoryEntity alias, Sort sort) {
		if (sort != null && sort.isSorted()) {
			Iterator<Order> it = sort.iterator();
			while (it.hasNext()) {
				Order next = it.next();
				switch (next.getProperty()) {
				case "title":
					if (next.isAscending()) {
						query.orderBy($(alias.getTitle()).asc());
					} else {
						query.orderBy($(alias.getTitle()).desc());
					}
					break;
				case "summary":
					if (next.isAscending()) {
						query.orderBy($(alias.getSummary()).asc());
					} else {
						query.orderBy($(alias.getSummary()).desc());
					}
					break;
				default:
					throw new IllegalArgumentException("Sorted by the unknown property '" + next.getProperty() + "'");
				}
			}
		}
	}

}