package com.bean;

import java.io.Serializable;

public class EmployeeBean implements Serializable
{

	private String e_id;
	private String e_fname;
	private String elanme;
	private int e_sal;
	private String e_addr;
	
	// Generate gatters and setters ====> alt+shift+s
	
	public EmployeeBean(){} //constructor  

	public String getE_id() 
	{
		return e_id;
	}
	public void setE_id(String e_id) 
	{
		this.e_id = e_id;
	}
	public String getE_fname() 
	{
		return e_fname;
	}
	public void setE_fname(String e_fname) 
	{
		this.e_fname = e_fname;
	}
	public String getElanme() 
	{
		return elanme;
	}
	public void setElanme(String elanme)
	{
		this.elanme = elanme;
	}
	public int getE_sal() 
	{
		return e_sal;
	}
	public void setE_sal(int e_sal) 
	{
		this.e_sal = e_sal;
	}
	public String getE_addr() 
	{
		return e_addr;
	}
	public void setE_addr(String e_add) 
	{
		this.e_addr = e_add;
	} 
}
