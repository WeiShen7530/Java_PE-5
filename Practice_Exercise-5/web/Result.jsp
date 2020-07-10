<%-- 
    Document   : Result
    Created on : Jul 7, 2020, 8:53:49 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Result Page</title>
    </head>
    <body>
        Your username: <%=request.getParameter("username")%><br>
        Your password: <%=request.getParameter("password")%><br>
    </body>
</html>
