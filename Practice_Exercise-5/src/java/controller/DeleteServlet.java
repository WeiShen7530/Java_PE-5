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

/**
 *
 * @author Dell
 */
@WebServlet(urlPatterns = {"/DeleteServlet"})
public class DeleteServlet extends HttpServlet {

    ContactGet contactServlet = new ContactGet();
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        String phoneNumber = request.getParameter("txtPhone");
        contactServlet.deleteContact(phoneNumber);
        
        response.sendRedirect("/Practice_Exercise-5/Alert.jsp");
    }
}
