<%@page import="java.util.Iterator"%>
<%@page import="com.bean.EmployeeBean"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		
  <center>
		<h3>

   			<%
				ArrayList<EmployeeBean> al = (ArrayList<EmployeeBean>) request.getAttribute("list");

				if (al == null || al.isEmpty()) 
				{
    				out.println("Employee Records NOT Found !!!!");
				}
 				else 
				{
    				Iterator<EmployeeBean> i = al.iterator();

    				while (i.hasNext()) 
					{
        				EmployeeBean eb = i.next();

        				out.println( eb.getE_id() + " " + eb.getE_fname() + " " + eb.getElanme() + " " + eb.getE_sal() + " " + eb.getE_addr() + "<br><br>");
    				}
				}
 			%>
	</h3>
	<%@ include file="index.html" %>
		
</body>
</html>