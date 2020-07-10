<%-- 
    Document   : Process
    Created on : Jul 7, 2020, 8:53:08 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Process Page</title>
    </head>
    <body>
        <%         
            String strpage = request.getParameter("buttonName") + ".jsp";
            response.sendRedirect(strpage);
        %>
    </body>
</html>
