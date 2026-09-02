package com.servlets;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.EmployeeBean;
import com.dao.AddEmpDAO;

@SuppressWarnings("serial")
@WebServlet("/aes")
public class AddEmpServlet extends HttpServlet 
{
    
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		EmployeeBean eb = new EmployeeBean();
		eb.setE_id(req.getParameter("eid"));
		eb.setE_fname(req.getParameter("efname"));
		eb.setElanme(req.getParameter("elname"));
		eb.setE_sal(Integer.parseInt(req.getParameter("esal")));
		eb.setE_addr(req.getParameter("eaddr"));
		
		AddEmpDAO daoobj = new AddEmpDAO();
		int rowCount = daoobj.insert_empdata(eb);
		if(rowCount>0)
		{
			//System.out.println("Record Inserted!!!");
			req.setAttribute("msg","Employee Record Inserted Sucessfully");
			
			//RequestDispatcher cd=req.getRequestDispatcher("AddEmployee.jsp");
			//rd.forward(req, res);
			req.getRequestDispatcher("AddEmployee.jsp").forward(req,res);
		}
		else
		{
			//System.out.println("Insertation Failed!!!");
			
			req.setAttribute("msg","Employee Data NOT INSERTED!!!!");
			req.getRequestDispatcher("AddEmployee.jsp").forward(req,res);
		}
	}
}
