<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.Calendar" %>
<%@ page import ="java.util.*,java.text.SimpleDateFormat" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet"type="text/css" href="webapp/css/header.css">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<div style="background-color:gray; display:flex;">
 <h1 style="color:white; display:inline-block;">login</h1>
 <h2 style="padding-top:30px; padding-left:20px; font-size:10px;">
  <%
     Date date = new Date();
     SimpleDateFormat sdf= new SimpleDateFormat("yyyy/mm/dd");
     String formatDate = sdf.format(date);
    out.print(formatDate);
  %>
 </h2>
</div>
</body>
</html>