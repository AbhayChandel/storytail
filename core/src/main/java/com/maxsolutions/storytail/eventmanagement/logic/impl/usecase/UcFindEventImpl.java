package com.maxsolutions.storytail.eventmanagement.logic.impl.usecase;

import java.util.Optional;

import javax.annotation.security.RolesAllowed;
import javax.inject.Named;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.data.domain.Page;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.validation.annotation.Validated;

import com.maxsolutions.storytail.eventmanagement.dataaccess.api.EventEntity;
import com.maxsolutions.storytail.eventmanagement.logic.api.security.EventmanagementAccessControlConfig;
import com.maxsolutions.storytail.eventmanagement.logic.api.to.EventEto;
import com.maxsolutions.storytail.eventmanagement.logic.api.to.EventSearchCriteriaTo;
import com.maxsolutions.storytail.eventmanagement.logic.api.usecase.UcFindEvent;
import com.maxsolutions.storytail.eventmanagement.logic.base.usecase.AbstractEventUc;

/**
 * Use case implementation for searching, filtering and getting Events
 */
@Named
@Validated
@Transactional
public class UcFindEventImpl extends AbstractEventUc implements UcFindEvent {

	/** Logger instance. */
	private static final Logger LOG = LoggerFactory.getLogger(UcFindEventImpl.class);

	@Override
	@RolesAllowed(EventmanagementAccessControlConfig.PERMISSION_FIND_EVENT)
	public EventEto findEvent(long id) {
		LOG.debug("Get Event with id {} from database.", id);
		Optional<EventEntity> foundEntity = getEventRepository().findById(id);
		if (foundEntity.isPresent())
			return getBeanMapper().map(foundEntity.get(), EventEto.class);
		else
			return null;
	}

	@Override
	@RolesAllowed(EventmanagementAccessControlConfig.PERMISSION_FIND_EVENT)
	public Page<EventEto> findEvents(EventSearchCriteriaTo criteria) {
		Page<EventEntity> events = getEventRepository().findByCriteria(criteria);
		return mapPaginatedEntityList(events, EventEto.class);
	}

}
