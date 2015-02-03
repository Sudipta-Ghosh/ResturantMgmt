package com.java.ResturantMgmt.dao.tableinfo;

import java.util.List;

import com.java.ResturantMgmt.dto.TTableInfo;
import com.java.ResturantMgmt.dto.TUserGroup;
import com.java.ResturantMgmt.valueObject.usergroup.TableInfoVO;
import com.java.ResturantMgmt.valueObject.usergroup.UserGroupVO;

public interface ITableInfoDao {
	
	TableInfoVO save(TTableInfo tTableInfo);
	void update(TTableInfo tTableInfo);
	void delete(TTableInfo tTableInfo);
	List<TTableInfo> findByTableInfoId(Long tableId);

}
