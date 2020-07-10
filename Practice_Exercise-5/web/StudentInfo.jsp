<%-- 
    Document   : StudentInfo
    Created on : Jul 7, 2020, 8:45:37 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="vi">
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Thông tin sinh viên</title>
    </head>
    <body>
        <h1>Thông tin sinh viên</h1>
        <form action="StudentInfoHandler.jsp" method="post">
            Họ tên <input type="text" name="txtName">
            <p></p>
            
            Mã số <input type="text" name="txtID">
            <p></p>
            
            Ngày sinh <input type="text" name="txtDoB">
            <p></p>
            
            Giới tính <br>
            <input type="radio" name="Gender" value="1">Nam<br>
            <input type="radio" name="Gender" value="0">Nữ<br>
            <p></p>
            
            Khoa 
            <select name="Faculty">
                <option value="1">Công nghệ thông tin</option>
                <option value="2">Khoa học máy tính</option>
            </select>
            <p></p>
            
            Câu lạc bộ tham gia
            <br>
            <input type="checkbox" name="IT">Tin học<br>
            <input type="checkbox" name="Art">Văn nghệ<br>
            <input type="checkbox" name="Sport">Thể thao<br>
            <p></p>
            
            Sở thích 
            <textarea cols="30" rows="6" name="Hobby"></textarea>
            <p></p>
            
            <button>Đăng ký</button>
        </form>
    </body>
</html>
