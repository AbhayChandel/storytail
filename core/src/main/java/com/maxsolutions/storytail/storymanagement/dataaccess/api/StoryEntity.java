package com.maxsolutions.storytail.storymanagement.dataaccess.api;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinTable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.maxsolutions.storytail.eventmanagement.common.api.Event;
import com.maxsolutions.storytail.eventmanagement.dataaccess.api.EventEntity;
import com.maxsolutions.storytail.general.dataaccess.api.ApplicationPersistenceEntity;
import com.maxsolutions.storytail.storymanagement.common.api.Story;

@Entity
@Table(name = "STORY")
public class StoryEntity extends ApplicationPersistenceEntity implements Story {

	private String title;

	private String summary;

	private Set<EventEntity> events;

	private static final long serialVersionUID = 1L;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getSummary() {
		return summary;
	}

	public void setSummary(String summary) {
		this.summary = summary;
	}

	@ManyToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	@JoinTable(name = "STORY_EVENT", joinColumns = { @JoinColumn(name = "story_id") }, inverseJoinColumns = {
			@JoinColumn(name = "event_id") })
	public Set<EventEntity> getEvents() {
		return events;
	}

	public void setEvents(Set<EventEntity> events) {
		this.events =  events;

	}

	@Override
	public String toString() {
		return "StoryEntity [title=" + title + ", summary=" + summary + ", events=" + events + "]";
	}



}
