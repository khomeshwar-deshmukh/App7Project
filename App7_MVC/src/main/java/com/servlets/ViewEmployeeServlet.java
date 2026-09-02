package com.servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.EmployeeBean;
import com.dao.ViewEmpDAO;

@SuppressWarnings("serial")
@WebServlet("/view")
public class ViewEmployeeServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		ArrayList<EmployeeBean> al = new ViewEmpDAO().reterive_empdata();
		req.setAttribute("list", al);
		req.getRequestDispatcher("ViewEmployee.jsp").forward(req, resp);
	}
}
