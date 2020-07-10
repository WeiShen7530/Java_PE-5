/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import get.ContactGet;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Contact;

/**
 *
 * @author Dell
 */
@WebServlet(urlPatterns = {"/ContactServlet"})
public class ContactServlet extends HttpServlet {

    ContactGet contactServlet = new ContactGet();
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");
        
        try {
            PrintWriter out = response.getWriter();
            String phoneNumber = request.getParameter("txtPhone");
            
            Contact temp = contactServlet.searchContact(phoneNumber);
            
            int id = temp.getCtcID();
            String name = temp.getCtcName();
            String phone = temp.getCtcPhone();
            String address = temp.getCtcAddress();
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
            out.println("<title>Search Contacts</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Ket qua tra so dien thoai theo yeu cau cua ban :</h1>");
            out.println("<table border='1' cellpadding='8' cellspacing='5' style='border-collapse: collapse;'>");
            out.println("<tr>");
            out.println("<th>So thu tu</th>");
            out.println("<th>Ten thue bao</th>");
            out.println("<th>So dien thoai</th>");
            out.println("<th>Dia chi</th>");
            out.println("</tr>");
            out.println("<tr>");
            out.println("<td>" + id + "</td>");
            out.println("<td>" + name + "</td>");
            out.println("<td>" + phone + "</td>");
            out.println("<td>" + address + "</td>");
            out.println("</tr>");
            out.println("</body>");
            out.println("</html>");
        } catch (SQLException ex) {
            Logger.getLogger(ContactServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
