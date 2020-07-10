<%-- 
    Document   : ContactManagement
    Created on : Jul 7, 2020, 8:43:52 AM
    Author     : Dell
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Quản lý thuê bao điện thoại</title>
    </head>
    <body>
        <h1>Quản lý thuê bao điện thoại </h1>
        <form name="form1" action="Process.jsp">
            <input type="hidden" name="buttonName">
            <input type="button" name="Insert" value="Insert" onclick="Insert()">
            <input type="button" name="Update" value="Update" onclick="Update()">
            <input type="button" name="Delete" value="Delete" onclick="Delete()">
            <input type="button" name="Search" value="Search" onclick="Search()">
        </form>
        
        <script language="javascript">
            function Insert(){
                document.form1.buttonName.value = "Insert";
                form1.submit();
            }
            function Update(){
                document.form1.buttonName.value = "Update";
                form1.submit();
            }
            function Delete(){
                document.form1.buttonName.value = "Delete";
                form1.submit();
            }
            function Search(){
                document.form1.buttonName.value = "Search";
                form1.submit();
            }
        </script>
    </body>
</html>

