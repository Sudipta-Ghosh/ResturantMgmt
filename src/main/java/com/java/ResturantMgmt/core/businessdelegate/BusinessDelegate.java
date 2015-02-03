package com.java.ResturantMgmt.core.businessdelegate;

import com.java.ResturantMgmt.core.service.GenericService;
import com.java.ResturantMgmt.dto.util.GenericDTO;
import com.java.ResturantMgmt.util.ServiceLocator;
import com.java.ResturantMgmt.valueObject.util.GenericVO;

public class BusinessDelegate {

	public GenericVO doProcess(GenericDTO transferObject) {
		GenericService applicationService = ServiceLocator
				.getService(transferObject.getAction());

		GenericVO valueObject = applicationService.doProcess(transferObject);
		return valueObject;

	}

}
