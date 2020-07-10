<%-- 
    Document   : Check
    Created on : Jul 7, 2020, 8:48:26 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Check Page</title>
    </head>
    <body>
        <%
            String strusername = request.getParameter("username");
            String strpassword = request.getParameter("password");
            if (strusername != "" && strpassword != "") {
        %>
        
        <jsp:forward page="Result.jsp"></jsp:forward>
        
        <% } else {
            out.println("Please input username and password!");
        }%>
    </body>
</html>
