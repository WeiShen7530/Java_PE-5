<%-- 
    Document   : Search
    Created on : Jul 7, 2020, 8:54:29 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Search Page</title>
    </head>
    <body>
        <h1>Tìm số điện thoại</h1>
        <form action="SearchServlet" method="post">
        
            Số điện thoại: <input type="text" name="txtPhone"><br>
            <button type="submit">Tìm</button>
           
        </form>
    </body>
</html>
