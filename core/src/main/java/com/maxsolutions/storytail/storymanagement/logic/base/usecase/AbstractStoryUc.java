package com.maxsolutions.storytail.storymanagement.logic.base.usecase;

import javax.inject.Inject;

import com.maxsolutions.storytail.general.logic.base.AbstractUc;
import com.maxsolutions.storytail.storymanagement.dataaccess.api.repo.StoryRepository;

/**
 * Abstract use case for Storys, which provides access to the commonly necessary
 * data access objects.
 */
public class AbstractStoryUc extends AbstractUc {

	/** @see #getStoryRepository() */
	@Inject
	private StoryRepository storyRepository;

	/**
	 * Returns the field 'storyRepository'.
	 * 
	 * @return the {@link StoryRepository} instance.
	 */
	public StoryRepository getStoryRepository() {

		return this.storyRepository;
	}

}
