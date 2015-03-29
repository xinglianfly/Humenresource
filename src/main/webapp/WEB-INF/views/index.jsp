<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="index.css">
</head>
<body>

<form action="" method="post">
	name:<input type="text" name="name">
	author:<input type="text" name="author">
	<input type="submit">
</form>
<ul>

<c:forEach var="xiner" items="${xiners}">
	<li>${xiner.name }</li>
</c:forEach>
</ul>
</body>
</html>