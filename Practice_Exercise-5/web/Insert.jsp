<%-- 
    Document   : Insert
    Created on : Jul 7, 2020, 8:52:21 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Insert Page</title>
    </head>
    <body>
        <h1>Thêm số điện thoại</h1>
        <form action="InsertServlet" method="post">
            Tên thuê bao: <input type="text" name="txtName"><br>
            Số điện thoại: <input type="text" name="txtPhone"><br>
            Địa chỉ: <input type="text" name="txtAddress"><br>
            <button type="submit">Thêm</button>
        </form>
    </body>
</html>
