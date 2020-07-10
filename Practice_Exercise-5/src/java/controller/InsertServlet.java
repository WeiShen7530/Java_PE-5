/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import get.ContactGet;
import java.io.IOException;
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
@WebServlet(urlPatterns = {"/InsertServlet"})
public class InsertServlet extends HttpServlet {

    ContactGet contactServlet = new ContactGet();
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        Contact cntct = new Contact();
        
        cntct.setCtcName(request.getParameter("txtName"));
        cntct.setCtcPhone(request.getParameter("txtPhone"));
        cntct.setCtcAddress(request.getParameter("txtAddress"));

        contactServlet.insertContact(cntct);

        response.sendRedirect("/Practice_Exercise-5/Alert.jsp");
    }
}
