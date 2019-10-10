<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- jstl library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>My Demo App</title>
</head>
<body>
	<a href="<c:url value="/" />">Home</a>
	<div>
		<h1>/addCookie</h1>
		<p>Launch of this page as added a cookie named 'myRandomCookie'</p>

		<h1>/getCookie</h1>
		<p>This gets the cookie 'myRandomCookie' value and prints in console</p>
	</div>
</body>
</html>