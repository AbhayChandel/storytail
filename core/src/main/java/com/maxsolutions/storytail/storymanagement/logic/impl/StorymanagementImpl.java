package com.maxsolutions.storytail.storymanagement.logic.impl;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.maxsolutions.storytail.general.logic.base.AbstractComponentFacade;
import com.maxsolutions.storytail.storymanagement.logic.api.Storymanagement;
import com.maxsolutions.storytail.storymanagement.logic.api.to.StoryEto;
import com.maxsolutions.storytail.storymanagement.logic.api.to.StorySearchCriteriaTo;
import com.maxsolutions.storytail.storymanagement.logic.api.usecase.UcFindStory;
import com.maxsolutions.storytail.storymanagement.logic.api.usecase.UcManageStory;

/**
 * Implementation of component interface of storymanagement
 */
@Named
public class StorymanagementImpl extends AbstractComponentFacade implements Storymanagement {

	@Inject
	private UcFindStory ucFindStory;

	@Inject
	private UcManageStory ucManageStory;

	@Override
	public StoryEto findStory(long id) {

		return this.ucFindStory.findStory(id);
	}

	@Override
	public Page<StoryEto> findStorys(StorySearchCriteriaTo criteria) {
		return this.ucFindStory.findStorys(criteria);
	}

	@Override
	public StoryEto saveStory(StoryEto story) {

		return this.ucManageStory.saveStory(story);
	}

	@Override
	public boolean deleteStory(long id) {

		return this.ucManageStory.deleteStory(id);
	}
}
