package com.maxsolutions.storytail.eventmanagement.common.api;

import com.maxsolutions.storytail.general.common.api.ApplicationEntity;

public interface Event extends ApplicationEntity {

	public String getContent();

	public void setContent(String content);

}
