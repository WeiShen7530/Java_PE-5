<%-- 
    Document   : Calculator
    Created on : Jul 7, 2020, 8:37:32 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Calculator</title>
    </head>
    <body>
        <h1>Calculator</h1>
        <form action="CalculatorServlet" method="post">
            Toán hạng thứ nhất <input type="text" name="firstNb" />
            <br><br>
            
            Phép toán 
            <select name="cal">
                <option value="1">Cộng</option>
                <option value="2">Trừ</option>
                <option value="3">Nhân</option>
                <option value="4">Chia</option>
            </select>
            <br><br>
            
            Toán hạng thứ hai <input type="text" name="secondNb">
            <br><br>
            
            <button type="submit">Tính toán</button>
        </form>
    </body>
</html>
