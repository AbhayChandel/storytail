package com.maxsolutions.storytail.eventmanagement.logic.api.to;

import com.devonfw.module.basic.common.api.query.StringSearchConfigTo;
import com.maxsolutions.storytail.general.common.api.to.AbstractSearchCriteriaTo;

/**
 * {@link SearchCriteriaTo} to find instances of
 * {@link com.maxsolutions.storytail.eventmanagement.common.api.Event}s.
 */
public class EventSearchCriteriaTo extends AbstractSearchCriteriaTo {

	private static final long serialVersionUID = 1L;

	private String content;

	private StringSearchConfigTo contentOption;

	/**
	 * @return contentId
	 */

	public String getContent() {
		return content;
	}

	/**
	 * @param content setter for content attribute
	 */

	public void setContent(String content) {
		this.content = content;
	}

	/**
	 * @return the {@link StringSearchConfigTo} used to search for
	 *         {@link #getContent() content}.
	 */
	public StringSearchConfigTo getContentOption() {

		return this.contentOption;
	}

	/**
	 * @param contentOption new value of {@link #getContentOption()}.
	 */
	public void setContentOption(StringSearchConfigTo contentOption) {

		this.contentOption = contentOption;
	}

}
