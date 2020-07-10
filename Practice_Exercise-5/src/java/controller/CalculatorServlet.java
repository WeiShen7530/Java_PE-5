/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Dell
 */
@WebServlet(urlPatterns = {"/CalculatorServlet"})
public class CalculatorServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        PrintWriter out = response.getWriter();
        
        float result;
        float number1 = Float.parseFloat(request.getParameter("firstNb"));
        float number2 = Float.parseFloat(request.getParameter("secondNb"));
        
        int cal = Integer.parseInt(request.getParameter("cal"));
       
        switch (cal) {
            case 1:
                result = number1 + number2;
                break;
            case 2:
                result = number1 - number2;
                break;
            case 3:
                result = number1 * number2;
                break;
            default:
                result = number1 / number2;
                break;
        }
        
        out.println("<!DOCTYPE html>");
        out.println("<html>");
        out.println("<head>");
        out.println("<meta http-equiv='Content-Type' content='text/html; charset=UTF-8'>");
        out.println("<title>Calculator</title>");
        out.println("</head>");
        out.println("<body>");
        out.println("<p>Ket qua:</p>");
        out.println(result);
        out.println("<p></p>");
        out.println("<input type='button' value='Back' onclick='javascript:history.back();'>");
        out.print("<input type='button' value='Close' onclick='return window.close();'>");
        out.println("</body>");
        out.println("</html>");
    }
}
