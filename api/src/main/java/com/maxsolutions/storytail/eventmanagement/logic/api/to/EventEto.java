package com.maxsolutions.storytail.eventmanagement.logic.api.to;

import java.util.Set;

import com.devonfw.module.basic.common.api.to.AbstractEto;
import com.maxsolutions.storytail.eventmanagement.common.api.Event;
import com.maxsolutions.storytail.storymanagement.common.api.Story;
import com.maxsolutions.storytail.storymanagement.logic.api.to.StoryEto;

/**
 * Entity transport object of Event
 */
public class EventEto extends AbstractEto implements Event {

	private static final long serialVersionUID = 1L;

	private String content;

	private Set<StoryEto> stories;

	@Override
	public String getContent() {
		return content;
	}

	@Override
	public void setContent(String content) {
		this.content = content;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((this.content == null) ? 0 : this.content.hashCode());

		return result;
	}

	@Override
	public boolean equals(Object obj) {

		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		// class check will be done by super type EntityTo!
		if (!super.equals(obj)) {
			return false;
		}
		EventEto other = (EventEto) obj;
		if (this.content == null) {
			if (other.content != null) {
				return false;
			}
		} else if (!this.content.equals(other.content)) {
			return false;
		}

		return true;
	}
}
