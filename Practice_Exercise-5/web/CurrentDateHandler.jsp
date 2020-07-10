<%-- 
    Document   : CurrentDateHandler
    Created on : Jul 7, 2020, 8:44:24 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Current Date Handler</title>
    </head>
    <body>
        <%@page import="java.util.Date"%>
        <%
            Date day = new Date();
            out.print(day);
            String username = request.getParameter("username");
            out.println("\nHello " + username);
        %>
    </body>
</html>
