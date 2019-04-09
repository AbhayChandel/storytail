package com.maxsolutions.storytail.storymanagement.logic.api.to;

import java.util.Set;

import com.devonfw.module.basic.common.api.to.AbstractEto;
import com.maxsolutions.storytail.eventmanagement.common.api.Event;
import com.maxsolutions.storytail.eventmanagement.logic.api.to.EventEto;
import com.maxsolutions.storytail.storymanagement.common.api.Story;

/**
 * Entity transport object of Story
 */
public class StoryEto extends AbstractEto implements Story {

	private static final long serialVersionUID = 1L;

	private String title;
	private String summary;
	private Set<EventEto> events;

	@Override
	public String getTitle() {
		return title;
	}

	@Override
	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String getSummary() {
		return summary;
	}

	@Override
	public void setSummary(String summary) {
		this.summary = summary;
	}



	public Set<EventEto> getEvents() {
		return events;
	}

	public void setEvents(Set<EventEto> events) {
		this.events = events;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((this.title == null) ? 0 : this.title.hashCode());
		result = prime * result + ((this.summary == null) ? 0 : this.summary.hashCode());

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
		StoryEto other = (StoryEto) obj;
		if (this.title == null) {
			if (other.title != null) {
				return false;
			}
		} else if (!this.title.equals(other.title)) {
			return false;
		}
		if (this.summary == null) {
			if (other.summary != null) {
				return false;
			}
		} else if (!this.summary.equals(other.summary)) {
			return false;
		}

		return true;
	}
}
