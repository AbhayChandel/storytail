package com.maxsolutions.storytail.storymanagement.logic.api.security;

import com.devonfw.module.security.common.api.accesscontrol.AccessControlGroup;
import com.devonfw.module.security.common.base.accesscontrol.AccessControlConfig;
import com.maxsolutions.storytail.general.common.api.security.ApplicationAccessControlConfig;

public class StorymanagementAccessControlConfig extends AccessControlConfig {

	private static final String COMPONENT = "storymanagement";

	private static final String PREFIX = ApplicationAccessControlConfig.APP_ID + "." + COMPONENT + ".";

	public static final String PERMISSION_FIND_STORY = PREFIX + "FindStory";

	public static final String PERMISSION_SAVE_STORY = PREFIX + "SaveStory";

	public static final String PERMISSION_DELETE_STORY = PREFIX + "DeleteStory";

	public static final String GROUP_ADMIN = PREFIX + "Admin";

	public StorymanagementAccessControlConfig() {

		super();
		AccessControlGroup readMasterData = group(PERMISSION_FIND_STORY);
		group(GROUP_ADMIN, readMasterData, PERMISSION_SAVE_STORY, PERMISSION_DELETE_STORY);
	}

}
