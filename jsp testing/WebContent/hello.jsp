<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" errorPage="error.jsp"%>
    
    <%@ page import="java.util.Date" %>
    
<!--<%@ include file="welcome.jsp" %> -->
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>jsp testing</title>
</head>
<body bgcolor="green">
<% 
int a=Integer.parseInt(request.getParameter("t1"));
int b=Integer.parseInt(request.getParameter("t2"));
int c=a/b;

out.println(c);

%>
</body>
</html>