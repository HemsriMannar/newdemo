<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>login</h1>
	<form method="get" action="concate.jsp">
		Enter uname:<input type="text" name="user" required><br />
		Enter age:<input type="text" name="age" required><br />
		<input type="submit" value="check">
	</form>

	<% String uname= request.getParameter("user");
	String age = request.getParameter("age");
	 String str = uname + age;
	 StringBuffer sbf = new StringBuffer(str);
	 sbf.reverse();
	 out.println("Password is"+sbf);
	%>
</body>
</html>

