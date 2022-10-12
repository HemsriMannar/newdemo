<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="obj" class="productbeans.Product" scope="session" />
 <jsp:getProperty property="name" name="obj"/>
 <jsp:getProperty property="cost" name="obj"/>
</body>
</html>