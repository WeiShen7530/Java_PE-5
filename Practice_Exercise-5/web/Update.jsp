<%-- 
    Document   : Update
    Created on : Jul 7, 2020, 8:55:10 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Update Page</title>
    </head>
    <body>
        <h1>Sửa số điện thoại</h1>
        <form action="UpdateServlet" method="post">
            Số điện thoại thuê bao trước đó: <input type="text" name="txtOldPhone"><br>
            
            Tên thuê bao mới: <input type="text" name="txtNewName"><br>
            Số điện thoại mới: <input type="text" name="txtNewPhone"><br>
            Địa chỉ mới: <input type="text" name="txtNewAddress"><br>
            
            <button type="submit">Cập nhật</button>
        </form>
    </body>
</html>
