package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.bean.EmployeeBean;

public class ViewEmpDAO 
{
	ArrayList<EmployeeBean> al = new ArrayList<EmployeeBean>();
	
	public ArrayList<EmployeeBean> reterive_empdata()
	{
		try
		{
			Connection con = DBConnect.getCon();
			PreparedStatement  pstmt = con.prepareStatement("select * from employee");
			ResultSet rs = pstmt.executeQuery();
			
			while(rs.next())
			{
				EmployeeBean bean = new EmployeeBean();
				bean.setE_id(rs.getString(1));
				bean.setE_fname(rs.getString(2));
				bean.setElanme(rs.getString(3));
				bean.setE_sal(rs.getInt(4));
				bean.setE_addr(rs.getString(5));
				
				al.add(bean);
			}
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		return al;
	}
	
	
}
