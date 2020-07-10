<%-- 
    Document   : Delete
    Created on : Jul 7, 2020, 8:49:06 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Page</title>
    </head>
    <body>
        <h1>Xóa số điện thoại</h1>
        <form action="DeleteServlet" method="post">
            Số điện thoại muốn xóa: <input type="text" name="txtPhone"><br>
            <button type="submit">Xóa</button>
        </form>
    </body>
</html>
