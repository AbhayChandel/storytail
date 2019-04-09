package com.maxsolutions.storytail.storymanagement.logic.api.usecase;

import java.util.List;

import org.springframework.data.domain.Page;

import com.maxsolutions.storytail.storymanagement.logic.api.to.StoryEto;
import com.maxsolutions.storytail.storymanagement.logic.api.to.StorySearchCriteriaTo;

public interface UcFindStory {

	/**
	 * Returns a Story by its id 'id'.
	 *
	 * @param id The id 'id' of the Story.
	 * @return The {@link StoryEto} with id 'id'
	 */
	StoryEto findStory(long id);

	/**
	 * Returns a paginated list of Storys matching the search criteria.
	 *
	 * @param criteria the {@link StorySearchCriteriaTo}.
	 * @return the {@link List} of matching {@link StoryEto}s.
	 */
	Page<StoryEto> findStorys(StorySearchCriteriaTo criteria);

}
