package com.maxsolutions.storytail.eventmanagement.dataaccess.api.repo;

import static com.querydsl.core.alias.Alias.$;

import java.util.Iterator;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Order;

import com.devonfw.module.jpa.dataaccess.api.QueryUtil;
import com.devonfw.module.jpa.dataaccess.api.data.DefaultRepository;
import com.maxsolutions.storytail.eventmanagement.dataaccess.api.EventEntity;
import com.maxsolutions.storytail.eventmanagement.logic.api.to.EventSearchCriteriaTo;
import com.querydsl.jpa.impl.JPAQuery;

/**
 * {@link DefaultRepository} for {@link EventEntity}
 */
public interface EventRepository extends DefaultRepository<EventEntity> {

	/**
	 * @param criteria the {@link EventSearchCriteriaTo} with the criteria to
	 *                 search.
	 * @return the {@link Page} of the {@link EventEntity} objects that matched the
	 *         search. If no pageable is set, it will return a unique page with all
	 *         the objects that matched the search.
	 */
	default Page<EventEntity> findByCriteria(EventSearchCriteriaTo criteria) {

		EventEntity alias = newDslAlias();
		JPAQuery<EventEntity> query = newDslQuery(alias);

		String content = criteria.getContent();
		if (content != null && !content.isEmpty()) {
			QueryUtil.get().whereString(query, $(alias.getContent()), content, criteria.getContentOption());
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
	public default void addOrderBy(JPAQuery<EventEntity> query, EventEntity alias, Sort sort) {
		if (sort != null && sort.isSorted()) {
			Iterator<Order> it = sort.iterator();
			while (it.hasNext()) {
				Order next = it.next();
				switch (next.getProperty()) {
				case "content":
					if (next.isAscending()) {
						query.orderBy($(alias.getContent()).asc());
					} else {
						query.orderBy($(alias.getContent()).desc());
					}
					break;
				default:
					throw new IllegalArgumentException("Sorted by the unknown property '" + next.getProperty() + "'");
				}
			}
		}
	}

}