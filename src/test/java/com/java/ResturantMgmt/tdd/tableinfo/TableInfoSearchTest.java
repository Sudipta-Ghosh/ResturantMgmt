package com.java.ResturantMgmt.tdd.tableinfo;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.java.ResturantMgmt.core.businessdelegate.BusinessDelegate;
import com.java.ResturantMgmt.dto.TTableInfo;
import com.java.ResturantMgmt.valueObject.usergroup.TableInfoVO;



public class TableInfoSearchTest {
	
	BusinessDelegate objBusinessDelegate=new BusinessDelegate();

	TTableInfo tTableInfo =new TTableInfo();
	 @Test(groups = { "TableInfoSearchTest" })
	 public void testEvaluateRPNPositive() {
		// tTableInfo.setTABLE_ID((long) 300001);
		 tTableInfo.setAction("searchTableInformation");
		 tTableInfo.setEvent("Save");
		
		 TableInfoVO tableInfoVO = (TableInfoVO) objBusinessDelegate.doProcess(tTableInfo);
         System.out.print(tableInfoVO);
	 }

}
