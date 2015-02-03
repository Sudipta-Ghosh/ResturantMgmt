package com.java.ResturantMgmt.dwr.tableinfo;

import com.java.ResturantMgmt.businessprocess.TableInfoBP;

public class TableInfoDWR {
	
	public String displayTableInformation(){
		String tableString=new TableInfoBP().showTableInformation();
		return tableString;
		
	} 
	public String saveTableInformation(String tableno,String tabledescription,String noofitems,String tableStatus){
		String tableString=new TableInfoBP().showTableInformation();
		return tableString;
		
	}

}
