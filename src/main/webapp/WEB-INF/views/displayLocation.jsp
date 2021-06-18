<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<!DOCTYPE html>
<html>
<head>
<title>display Location</title>
</head>

<body>
<h2>Locations:</h2>

<table>
<tr>
<th>Id</th>
<th>Code</th>
<th>Name</th>
<th>Type</th>
</tr>
<c:forEach items="${locations}" var="location">
<tr>
<td>${location.id}</td>
<td>${location.code}</td>
<td>${location.name}</td>
<td>${location.type}</td>
<td><a href="delete?id=${location.id}">delete</a>
<td><a href="update?id=${location.id}">update</a>
</tr>
</c:forEach>

</table>
${locations}

<a href="create">Add Record</a>
</body>
</html>