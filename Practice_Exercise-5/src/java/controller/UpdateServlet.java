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
@WebServlet(urlPatterns = {"/UpdateServlet"})
public class UpdateServlet extends HttpServlet {

    ContactGet contactServlet = new ContactGet();
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        Contact cntct = new Contact();
        
        String oldPhone = request.getParameter("txtOldPhone");
        
        cntct.setCtcName(request.getParameter("txtNewName"));
        cntct.setCtcPhone(request.getParameter("txtNewPhone"));
        cntct.setCtcAddress(request.getParameter("txtNewAddress"));

        contactServlet.updateContact(cntct, oldPhone);

        response.sendRedirect("/Practice_Exercise-5/Alert.jsp");
    }
}
