package com.maxsolutions.storytail.storymanagement.service.impl.rest;

import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.data.domain.Page;

import com.maxsolutions.storytail.storymanagement.logic.api.Storymanagement;
import com.maxsolutions.storytail.storymanagement.logic.api.to.StoryEto;
import com.maxsolutions.storytail.storymanagement.logic.api.to.StorySearchCriteriaTo;
import com.maxsolutions.storytail.storymanagement.service.api.rest.StorymanagementRestService;

/**
 * The service implementation for REST calls in order to execute the logic of
 * component {@link Storymanagement}.
 */
@Named("StorymanagementRestService")
public class StorymanagementRestServiceImpl implements StorymanagementRestService {

	@Inject
	private Storymanagement storymanagement;

	@Override
	public StoryEto getStory(long id) {
		return this.storymanagement.findStory(id);
	}

	@Override
	public StoryEto saveStory(StoryEto story) {
		return this.storymanagement.saveStory(story);
	}

	@Override
	public void deleteStory(long id) {
		this.storymanagement.deleteStory(id);
	}

	@Override
	public Page<StoryEto> findStorys(StorySearchCriteriaTo searchCriteriaTo) {
		return this.storymanagement.findStorys(searchCriteriaTo);
	}
}