<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!-- jstl library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Access static resources</title>

<style type="text/css">
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
	<a href="<c:url value="/" />">Home</a>
	<div>
		<table>
			<tr>
				<td>
					<p class="margin-left">
						<a href="<c:url value="/myResources/Testing.jpg" />">Access
							resource from resource folder</a>
					</p>
				</td>
				<td>
					<p class="margin-left">
						<a href="<c:url value="/myResources/images/Testing.jpg" />">Access
							resource from resource sub-folders </a>
					</p>
				</td>
			</tr>
		</table>
	</div>
</body>
</html>