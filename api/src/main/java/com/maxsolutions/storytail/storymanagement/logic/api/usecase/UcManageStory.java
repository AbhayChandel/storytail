package com.maxsolutions.storytail.storymanagement.logic.api.usecase;

import com.maxsolutions.storytail.storymanagement.logic.api.to.StoryEto;

/**
 * Interface of UcManageStory to centralize documentation and signatures of
 * methods.
 */
public interface UcManageStory {

	/**
	 * Deletes a story from the database by its id 'storyId'.
	 *
	 * @param storyId Id of the story to delete
	 * @return boolean <code>true</code> if the story can be deleted,
	 *         <code>false</code> otherwise
	 */
	boolean deleteStory(long storyId);

	/**
	 * Saves a story and store it in the database.
	 *
	 * @param story the {@link StoryEto} to create.
	 * @return the new {@link StoryEto} that has been saved with ID and version.
	 */
	StoryEto saveStory(StoryEto story);

}
