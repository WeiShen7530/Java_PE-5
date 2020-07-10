<%-- 
    Document   : Login
    Created on : Jul 7, 2020, 8:45:12 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Login</title>
    </head>
    <body>
        <form action="Check.jsp" method="post">
            Username: <input type="text" name="username">
            <p></p>
            Password: <input type="password" name="password">
            <p></p>
            <input type="submit" value="Login">
        </form>
    </body>
</html>
