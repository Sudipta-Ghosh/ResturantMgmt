package com.java.ResturantMgmt.util;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.java.ResturantMgmt.core.service.GenericService;
import com.java.ResturantMgmt.core.service.usergroup.impl.UserGroupService;


public class ServiceLocator {
	private static Map<String, String> properties = null;
	static {
		properties = new HashMap<String, String>();
		properties.put("saveuserGroup", "userGroupService");
		properties.put("searchTableInformation", "TableInfoService");

	}

	public static GenericService getService(String action) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"beans.xml");
		GenericService genericService = (GenericService) context.getBean(properties.get(action));
		return genericService;
	}

}
