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
 <jsp:setProperty property="*" name="obj"/>
 
 
 <a href="view.jsp">View Student Details</a>
</body>
</html>