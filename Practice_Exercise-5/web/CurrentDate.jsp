<%-- 
    Document   : CurrentDate
    Created on : Jul 7, 2020, 8:57:07 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Current Date</title>
    </head>
    <body>
        <h1> Include Page </h1>
        <br>
        <% out.println("Today is: "); %>
        <jsp:include page= "CurrentDateHandler.jsp">
            <jsp:param name="username" value="Mary"/>
        </jsp:include>
    </body>
</html>
