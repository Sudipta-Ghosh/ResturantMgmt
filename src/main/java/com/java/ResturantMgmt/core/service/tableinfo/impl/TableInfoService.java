package com.java.ResturantMgmt.core.service.tableinfo.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import com.java.ResturantMgmt.core.service.GenericService;
import com.java.ResturantMgmt.dao.impl.tableinfo.TableInfoDao;
import com.java.ResturantMgmt.dto.TTableInfo;
import com.java.ResturantMgmt.dto.util.GenericDTO;
import com.java.ResturantMgmt.valueObject.usergroup.TableInfoVO;
import com.java.ResturantMgmt.valueObject.util.GenericVO;

@Transactional
public class TableInfoService extends GenericService {

	private TableInfoDao tableInfoDao ; 

	@Autowired
	public void setTableInfoDao(TableInfoDao tableInfoDao) {
		this.tableInfoDao = tableInfoDao;
	}

	@Override	
	public GenericVO doProcess(GenericDTO genericdto) {
		// TODO Auto-generated method stub
		TableInfoVO tableInfoVO =new TableInfoVO();
		List tTableInfo=searchTableInfo(genericdto);
		tableInfoVO.settTableInfo(tTableInfo);
		return tableInfoVO;
	}

	private List<TTableInfo> searchTableInfo(GenericDTO genericdto) {
		List<TTableInfo> lstTableInfo =new ArrayList();
		
		// TODO Auto-generated method stub
		lstTableInfo=tableInfoDao.findByTableInfoId(((TTableInfo)genericdto).getTABLE_ID());
		
		return lstTableInfo;
	}

}
