<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- spring framework tag library -->
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!-- jstl library -->
<%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Create Employee</title>
<style type="text/css">
	.error {
		color: red;
		font-size: 15px;
	}
</style>
</head>
<body>
	<a href="<c:url value="/" />" >Home</a>
	<h1>Enter Employee Details :</h1>
	<form:form commandName="aNewEmployee" method="post" action="doCreateEmployee">
		<table>
			<tr>
				<td>First Name :</td>
				<td><form:input type="text" name="firstname" path="firstName" /></td>
				<td><form:errors path="firstName" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Last Name :</td>
				<td><form:input type="text" name="lastname" path="lastName" /></td>
				<td><form:errors path="lastName" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Age :</td>
				<td><form:input type="text" name="age" path="age" /></td>
				<td><form:errors path="age" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Address :</td>
				<td><form:input type="text" name="address" path="address" /></td>
				<td><form:errors path="address" cssClass="error" /></td>
			</tr>
			<tr>
				<td>Email Address:</td>
				<td><form:input type="text" name="email" path="email" /></td>
				<td><form:errors path="email" cssClass="error" /></td>
			</tr>
			<tr>
				<td colspan="3"><input type="submit" value="Create" /></td>
			</tr>
		</table>
	</form:form>
</body>
</html>