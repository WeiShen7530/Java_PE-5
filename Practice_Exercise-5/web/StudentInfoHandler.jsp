<%-- 
    Document   : StudentInfoHandler
    Created on : Jul 7, 2020, 8:46:25 AM
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
        <h1 style="font-weight: bold">Thông tin sinh viên đăng ký</h1>

        <p style="font-weight: bold">Thông tin người dùng đã nhập:</p>
        <p>Họ tên: <%=request.getParameter("txtName")%></p> 
        <p>Mã số: <%=request.getParameter("txtID")%></p> 
        <p>Ngày sinh: <%=request.getParameter("txtDoB")%></p>
        
        <p>Giới tính:
            <%
                if(Integer.parseInt(request.getParameter("Gender")) == 1)
                    out.println("Nam");
                else out.println("Nữ");
            %>
        </p>
        
        <p>Khoa:
            <%
                if(Integer.parseInt(request.getParameter("Faculty")) == 1)
                    out.println("CNTT");
                else out.println("KHMT");
            %>
        </p>
        
        <p>Câu lạc bộ tham gia:
            <%
                String strIT = "";
                String strArt = "";
                String strSport = "";
                
                if(request.getParameter("IT") != null)
                    strIT = "Tin học";
                if(request.getParameter("Art") != null)
                    strArt = "Văn nghệ";
                if(request.getParameter("Sport") != null)
                    strSport = "Thể thao";
                
                if (strIT == "" && strArt == "" && strSport == "")
                    out.println("Không.");
                else
                    out.println(strIT + " " + strArt + " " + strSport);
            %>
        </p>
        
        <p>Sở thích: <%=request.getParameter("Hobby")%></p>
    </body>
</html>
