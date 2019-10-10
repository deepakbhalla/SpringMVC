<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- spring framework tag library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Spring MVC Master Application</title>
<style type="text/css">
.border-1 {
	color: black;
	border-style: solid;
	border-width: thin;
}

.margin-left {
	margin-left: 10px;
}

.margin-all {
	margin: 10px;
}

table {
	border-collapse: separate;
	border-spacing: 40px 0;
}

td {
	padding: 5px 0;
}
</style>
</head>

<body>
	<h2 align="center">Spring MVC Learning Application</h2>

	<div id="examples" class="border-1 margin-all">
		<table>
			<tr>
				<td>
					<p class="margin-left">
						1. <a href="<c:url value="/getQuote" />">Basic MVC App</a>
					</p>
				</td>
				<td>
					<p class="margin-left">
						2. <a href="<c:url value="/createAccount" />">Spring MVC Form
							and Validations</a>
					</p>
				</td>
				<td>
					<p class="margin-left">
						3. <a href="<c:url value="/uploadFile" />">Upload File</a>
					</p>
				</td>
				<td>
					<p class="margin-left">
						4. <a href="<c:url value="/staticResource" />">Serve static resources</a>
					</p>
				</td>
				<td>
					<p class="margin-left">
						5. <a href="<c:url value="/createStudent" />">Redirects: Avoid Unwanted Form submits</a>
					</p>
				</td>
			</tr>
			<tr>
				<td>
					<p class="margin-left">
						6. <a href="<c:url value="/getQuotesForUser?userName=Dean" />">Enhanced Spring Model</a>
					</p>
				</td>
				<td>
					<p class="margin-left">
						7. <a href="<c:url value="/createEmployee" />">@SessionAttributes Example</a>
					</p>
				</td>
				<td>
					<p class="margin-left">
						8. <a href="<c:url value="/addCookie" />">Cookies Example</a>
					</p>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>
