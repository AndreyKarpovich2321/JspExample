<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Index page</title>
</head>
<body>
<h1><%= "Enter your login" %>
</h1>
<br/>
<form action="/login" method="post">
    <input type="text" name="login">
    <input type="password" name="password">
    <input type="submit" value="login">

</form>
</body>
</html>