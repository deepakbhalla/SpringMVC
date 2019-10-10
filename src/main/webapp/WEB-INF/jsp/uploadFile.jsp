<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<!-- jstl library -->
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Upload documents</title>
</head>
<body>
	<a href="<c:url value="/" />">Home</a>
	<h1>Select a file to upload:</h1>
	<form method="post" action="handleUpload" enctype="multipart/form-data">
		<input type="file" name="file" /> <input type="submit" value="Upload" />
	</form>
</body>
</html>