package com.java.ResturantMgmt.businessprocess;

import java.util.List;

import com.java.ResturantMgmt.core.businessdelegate.BusinessDelegate;
import com.java.ResturantMgmt.dto.TTableInfo;
import com.java.ResturantMgmt.valueObject.usergroup.TableInfoVO;

public class TableInfoBP {
	BusinessDelegate objBusinessDelegate=new BusinessDelegate();

	public  String showTableInformation(){
		TTableInfo tTableInfo =new TTableInfo();
		String result="";
		StringBuilder stringBuilder =new StringBuilder();

		 tTableInfo.setAction("searchTableInformation");
		 tTableInfo.setEvent("Save");

		  stringBuilder.append("<THEAD>");
		  stringBuilder.append("<TR>");
		  stringBuilder.append("<TH><input type=\"checkbox\"></TH>");
		  stringBuilder.append("<TH>Table No</TH>");
		  stringBuilder.append("<TH>Table Description</TH>");
		  stringBuilder.append("<TH>No Of Seat</TH>");
		  stringBuilder.append("<TH>Table Status</TH>");
		  stringBuilder.append("<TH>Table Type</TH>");
		  stringBuilder.append("<TH></TH>");
		  stringBuilder.append("<TH></TH>");
		  stringBuilder.append("</TR>");
		  stringBuilder.append("</THEAD>");
	      stringBuilder.append("<TBODY>");

		 TableInfoVO tableInfoVO = (TableInfoVO) objBusinessDelegate.doProcess(tTableInfo);
		 for ( TTableInfo tTableInfoOut:tableInfoVO.gettTableInfo()){
			 stringBuilder.append("<TR>");
			 stringBuilder.append("<TD>");
			 stringBuilder.append("<input type=\"checkbox\">");
			 stringBuilder.append("</TD>");
			 stringBuilder.append("<TD>");
			 stringBuilder.append(tTableInfoOut.getTABLE_NO());
			 stringBuilder.append("</TD>");
			 stringBuilder.append("<TD>");
			 stringBuilder.append(tTableInfoOut.getTABLE_DESCRIPTION());
			 stringBuilder.append("</TD>");
			 stringBuilder.append("<TD>");
			 stringBuilder.append(tTableInfoOut.getTABLE_NO_OF_SEAT());
			 stringBuilder.append("</TD>");
			 stringBuilder.append("<TD>");
			 stringBuilder.append(tTableInfoOut.getTABLE_STATUS());
			 stringBuilder.append("</TD>");
			 stringBuilder.append("<TD>");
			 stringBuilder.append(tTableInfoOut.getTABLE_TYPE());
			 stringBuilder.append("</TD>");
			 stringBuilder.append("<TD>");
			 stringBuilder.append("<img src=\"../../img/edit_property.png\" alt=\"edit property\" height=\"10\" width=\"10\">");
			 stringBuilder.append("</TD>");
			 stringBuilder.append("<TD>");
			 stringBuilder.append("<img src=\"../../img/delete_property.png\" alt=\"delete property\" height=\"10\" width=\"10\">");
			 stringBuilder.append("</TD>");
			 stringBuilder.append("</TR>");
		 }
		  stringBuilder.append("</TBODY>");
		 return stringBuilder.toString();

	}

}
