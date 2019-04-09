package com.maxsolutions.storytail.eventmanagement.dataaccess.api;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.maxsolutions.storytail.eventmanagement.common.api.Event;
import com.maxsolutions.storytail.general.dataaccess.api.ApplicationPersistenceEntity;
import com.maxsolutions.storytail.storymanagement.common.api.Story;
import com.maxsolutions.storytail.storymanagement.dataaccess.api.StoryEntity;

@Entity
@Table(name = "EVENT")
public class EventEntity extends ApplicationPersistenceEntity implements Event {

	private String content;

	private Set<StoryEntity> stories;

	private static final long serialVersionUID = 1L;

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}


	@ManyToMany(mappedBy = "events", fetch = FetchType.LAZY)
	@JsonIgnore
	public Set<StoryEntity> getStories() {
		return stories;
	}

	public void setStories(Set<StoryEntity> stories) {
		this.stories = stories;

	}

}
