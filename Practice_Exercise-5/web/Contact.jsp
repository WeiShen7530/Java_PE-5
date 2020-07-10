<%-- 
    Document   : Contact
    Created on : Jul 7, 2020, 8:39:53 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Phone Book</title>
    </head>
    <body>
        <h1>Trang Web Demo việc tra danh bạ điện thoại</h1>
        <form action="ContactServlet" method="post">
            
            Nhập số điện thoại
            
            <input type="text" name="txtPhone">
            
            <button type="submit">Bắt đầu tra</button>
            
        </form>
    </body>
</html>
