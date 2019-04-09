package com.maxsolutions.storytail.eventmanagement.logic.impl.usecase;

import java.util.Objects;

import javax.annotation.security.RolesAllowed;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.maxsolutions.storytail.eventmanagement.dataaccess.api.EventEntity;
import com.maxsolutions.storytail.eventmanagement.logic.api.security.EventmanagementAccessControlConfig;
import com.maxsolutions.storytail.eventmanagement.logic.api.to.EventEto;
import com.maxsolutions.storytail.eventmanagement.logic.api.usecase.UcManageEvent;
import com.maxsolutions.storytail.eventmanagement.logic.base.usecase.AbstractEventUc;

/**
 * Use case implementation for modifying and deleting Events
 */
@Named
@Validated
@Transactional
public class UcManageEventImpl extends AbstractEventUc implements UcManageEvent {

	/** Logger instance. */
	private static final Logger LOG = LoggerFactory.getLogger(UcManageEventImpl.class);

	@Override
	@RolesAllowed(EventmanagementAccessControlConfig.PERMISSION_DELETE_EVENT)
	public boolean deleteEvent(long eventId) {

		EventEntity event = getEventRepository().find(eventId);
		getEventRepository().delete(event);
		LOG.debug("The event with id '{}' has been deleted.", eventId);
		return true;
	}

	@Override
	@RolesAllowed(EventmanagementAccessControlConfig.PERMISSION_SAVE_EVENT)
	public EventEto saveEvent(EventEto event) {

		Objects.requireNonNull(event, "event");

		EventEntity eventEntity = getBeanMapper().map(event, EventEntity.class);

		// initialize, validate eventEntity here if necessary
		EventEntity resultEntity = getEventRepository().save(eventEntity);
		LOG.debug("Event with id '{}' has been created.", resultEntity.getId());
		return getBeanMapper().map(resultEntity, EventEto.class);
	}
}
