<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<header>
<div>
 SimpleDateFormat SDF = new SimpleDateFormat("YYYY/MM/DD");
 String formatDate= SDF.format(date);
out.print(formatDate); %>
</div>
 <div>
  <label for="login1">login</label>
  <input type="text" name="login" id="login1">
  <label for="login2">login</label>
  <input type="text" name="loginn" id="login2">
 </div>
</header>
</body>
</html>
