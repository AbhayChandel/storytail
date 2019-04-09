package com.maxsolutions.storytail.storymanagement.common.api;

import java.util.Set;

import com.maxsolutions.storytail.eventmanagement.common.api.Event;
import com.maxsolutions.storytail.general.common.api.ApplicationEntity;

public interface Story extends ApplicationEntity {

	public String getTitle();

	public void setTitle(String title);

	public String getSummary();

	public void setSummary(String summary);

}
