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
		<h1>The quote is :</h1>
		<p>${randomQuote}</p>

		<c:set var="userNameParam">${userName}</c:set>

		<c:if test="${userNameParam != null}">
			<h1>User Information :</h1>
			<p>User: ${userName}</p>
			<p>Role: ${userRole}</p>
		</c:if>
	</div>
</body>
</html>