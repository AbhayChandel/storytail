package com.maxsolutions.storytail.storymanagement.logic.impl.usecase;

import java.util.Objects;

import javax.annotation.security.RolesAllowed;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.maxsolutions.storytail.storymanagement.dataaccess.api.StoryEntity;
import com.maxsolutions.storytail.storymanagement.logic.api.security.StorymanagementAccessControlConfig;
import com.maxsolutions.storytail.storymanagement.logic.api.to.StoryEto;
import com.maxsolutions.storytail.storymanagement.logic.api.usecase.UcManageStory;
import com.maxsolutions.storytail.storymanagement.logic.base.usecase.AbstractStoryUc;

/**
 * Use case implementation for modifying and deleting Storys
 */
@Named
@Validated
@Transactional
public class UcManageStoryImpl extends AbstractStoryUc implements UcManageStory {

	/** Logger instance. */
	private static final Logger LOG = LoggerFactory.getLogger(UcManageStoryImpl.class);

	@Override
	@RolesAllowed(StorymanagementAccessControlConfig.PERMISSION_DELETE_STORY)
	public boolean deleteStory(long storyId) {

		StoryEntity story = getStoryRepository().find(storyId);
		getStoryRepository().delete(story);
		LOG.debug("The story with id '{}' has been deleted.", storyId);
		return true;
	}

	@Override
	@RolesAllowed(StorymanagementAccessControlConfig.PERMISSION_SAVE_STORY)
	public StoryEto saveStory(StoryEto story) {

		Objects.requireNonNull(story, "story");

		StoryEntity storyEntity = getBeanMapper().map(story, StoryEntity.class);

		// initialize, validate storyEntity here if necessary
		StoryEntity resultEntity = getStoryRepository().save(storyEntity);
		LOG.debug("Story with id '{}' has been created.", resultEntity.getId());
		return getBeanMapper().map(resultEntity, StoryEto.class);
	}
}
