package com.maxsolutions.storytail.eventmanagement.logic.api.security;

import com.devonfw.module.security.common.api.accesscontrol.AccessControlGroup;
import com.devonfw.module.security.common.base.accesscontrol.AccessControlConfig;
import com.maxsolutions.storytail.general.common.api.security.ApplicationAccessControlConfig;

public class EventmanagementAccessControlConfig extends AccessControlConfig {

	private static final String COMPONENT = "eventmanagement";

	private static final String PREFIX = ApplicationAccessControlConfig.APP_ID + "." + COMPONENT + ".";

	public static final String PERMISSION_FIND_EVENT = PREFIX + "FindEvent";

	public static final String PERMISSION_SAVE_EVENT = PREFIX + "SaveEvent";

	public static final String PERMISSION_DELETE_EVENT = PREFIX + "DeleteEvent";

	public static final String GROUP_ADMIN = PREFIX + "Admin";

	public EventmanagementAccessControlConfig() {

		super();
		AccessControlGroup readMasterData = group(PERMISSION_FIND_EVENT);
		group(GROUP_ADMIN, readMasterData, PERMISSION_SAVE_EVENT, PERMISSION_DELETE_EVENT);
	}

}
