package com.maxsolutions.storytail.storymanagement.logic.impl.usecase;

import java.util.Optional;

import javax.annotation.security.PermitAll;
import javax.annotation.security.RolesAllowed;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.maxsolutions.storytail.storymanagement.dataaccess.api.StoryEntity;
import com.maxsolutions.storytail.storymanagement.logic.api.to.StoryEto;
import com.maxsolutions.storytail.storymanagement.logic.api.to.StorySearchCriteriaTo;
import com.maxsolutions.storytail.storymanagement.logic.api.usecase.UcFindStory;
import com.maxsolutions.storytail.storymanagement.logic.base.usecase.AbstractStoryUc;

/**
 * Use case implementation for searching, filtering and getting Storys
 */
@Named
@Validated
@Transactional
public class UcFindStoryImpl extends AbstractStoryUc implements UcFindStory {

	/** Logger instance. */
	private static final Logger LOG = LoggerFactory.getLogger(UcFindStoryImpl.class);

	@Override
	@PermitAll
	public StoryEto findStory(long id) {
		LOG.debug("Get Story with id {} from database.", id);
		Optional<StoryEntity> foundEntity = getStoryRepository().findById(id);
		if (foundEntity.isPresent())
			return getBeanMapper().map(foundEntity.get(), StoryEto.class);
		else
			return null;
	}

	@Override
	@PermitAll
	public Page<StoryEto> findStorys(StorySearchCriteriaTo criteria) {
		Page<StoryEntity> storys = getStoryRepository().findByCriteria(criteria);
		return mapPaginatedEntityList(storys, StoryEto.class);
	}

}
