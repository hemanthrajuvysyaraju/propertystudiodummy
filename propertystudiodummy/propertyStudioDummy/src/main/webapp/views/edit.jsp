<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Floor Plan Edit Form</title>
</head>
<body>
	<form:form action="updatefloor" method="post" enctype="multipart/form-data"
		modelAttribute="appartmentfloor">
		<h5>project id:</h5><form:input path="projid" readonly="true" /><br>
		<h5>appartment id:</h5><form:input path="aprtid" readonly="true" /><br>
		<h5>floor index:</h5><form:input path="aprtfloorindex" readonly="true" /><br>
		upload new floor plan?<input type="file" name="floorplan"><br>
		<input type='submit' value='save' class='save'/>
	</form:form>
</body>
</html>