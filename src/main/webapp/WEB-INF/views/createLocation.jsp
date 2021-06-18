<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>

<!DOCTYPE html>
<html>
<head>
<title>Create Location</title>
</head>

<body>
<form action = "saveLoc" method="post">
<pre>
Id: <input type="text" name="id"/>
Code: <input type="text" name="code"/>
Name: <input type="text" name="name"/>
Type: Urban <input type = "radio" name="type" value="URBAN"/>
    Rural <input type = "radio" name="type"value="RURAL"/>
<input type="submit" value="save"/>
</pre>
</form>
${msg}

<a href="display">View All</a>
</body>
</html>