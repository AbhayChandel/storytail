package com.maxsolutions.storytail.storymanagement.service.api.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.springframework.data.domain.Page;

import com.maxsolutions.storytail.storymanagement.logic.api.Storymanagement;
import com.maxsolutions.storytail.storymanagement.logic.api.to.StoryEto;
import com.maxsolutions.storytail.storymanagement.logic.api.to.StorySearchCriteriaTo;

/**
 * The service interface for REST calls in order to execute the logic of
 * component {@link Storymanagement}.
 */
@Path("/storymanagement/v1")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public interface StorymanagementRestService {

	/**
	 * Delegates to {@link Storymanagement#findStory}.
	 *
	 * @param id the ID of the {@link StoryEto}
	 * @return the {@link StoryEto}
	 */
	@GET
	@Path("/story/{id}/")
	public StoryEto getStory(@PathParam("id") long id);

	/**
	 * Delegates to {@link Storymanagement#saveStory}.
	 *
	 * @param story the {@link StoryEto} to be saved
	 * @return the recently created {@link StoryEto}
	 */
	@POST
	@Path("/story/")
	public StoryEto saveStory(StoryEto story);

	/**
	 * Delegates to {@link Storymanagement#deleteStory}.
	 *
	 * @param id ID of the {@link StoryEto} to be deleted
	 */
	@DELETE
	@Path("/story/{id}/")
	public void deleteStory(@PathParam("id") long id);

	/**
	 * Delegates to {@link Storymanagement#findStoryEtos}.
	 *
	 * @param searchCriteriaTo the pagination and search criteria to be used for
	 *                         finding storys.
	 * @return the {@link Page list} of matching {@link StoryEto}s.
	 */
	@Path("/story/search")
	@POST
	public Page<StoryEto> findStorys(StorySearchCriteriaTo searchCriteriaTo);

}