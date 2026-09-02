package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import com.bean.EmployeeBean;

public class AddEmpDAO 
{
   public int insert_empdata(EmployeeBean eb)
   {
	   int rowCount=0;
	   try
	   {
		  Connection con = DBConnect.getCon();
		  PreparedStatement pstmt =  con.prepareStatement("insert into employee values(?,?,?,?,?)");
		  pstmt.setString(1,eb.getE_id());
		  pstmt.setString(2,eb.getE_fname());
		  pstmt.setString(3,eb.getElanme());
		  pstmt.setInt(4,eb.getE_sal());
		  pstmt.setString(5,eb.getE_addr());
		  rowCount = pstmt.executeUpdate();  
	   }
	   catch(Exception e)
	   {
		   e.printStackTrace();
	   }
	   return rowCount;
   }
}
