package com.maxsolutions.storytail.storymanagement.logic.api.to;

import com.devonfw.module.basic.common.api.query.StringSearchConfigTo;
import com.maxsolutions.storytail.general.common.api.to.AbstractSearchCriteriaTo;

/**
 * {@link SearchCriteriaTo} to find instances of
 * {@link com.maxsolutions.storytail.storymanagement.common.api.Story}s.
 */
public class StorySearchCriteriaTo extends AbstractSearchCriteriaTo {

	private static final long serialVersionUID = 1L;

	private String title;
	private String summary;

	private StringSearchConfigTo titleOption;
	private StringSearchConfigTo summaryOption;

	/**
	 * @return titleId
	 */

	public String getTitle() {
		return title;
	}

	/**
	 * @param title setter for title attribute
	 */

	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return summaryId
	 */

	public String getSummary() {
		return summary;
	}

	/**
	 * @param summary setter for summary attribute
	 */

	public void setSummary(String summary) {
		this.summary = summary;
	}

	/**
	 * @return the {@link StringSearchConfigTo} used to search for
	 *         {@link #getTitle() title}.
	 */
	public StringSearchConfigTo getTitleOption() {

		return this.titleOption;
	}

	/**
	 * @param titleOption new value of {@link #getTitleOption()}.
	 */
	public void setTitleOption(StringSearchConfigTo titleOption) {

		this.titleOption = titleOption;
	}

	/**
	 * @return the {@link StringSearchConfigTo} used to search for
	 *         {@link #getSummary() summary}.
	 */
	public StringSearchConfigTo getSummaryOption() {

		return this.summaryOption;
	}

	/**
	 * @param summaryOption new value of {@link #getSummaryOption()}.
	 */
	public void setSummaryOption(StringSearchConfigTo summaryOption) {

		this.summaryOption = summaryOption;
	}

}
