/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.unipiloto.servlet;

import co.edu.unipiloto.sessionBEAN.CalBeanLocal;
import java.io.IOException;
import java.io.PrintWriter;
import javax.ejb.EJB;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author jorge_j3qr4sd
 */
@WebServlet(name = "CalcServlet", urlPatterns = {"/CalcServlet"})
public class CalcServlet extends HttpServlet {

    @EJB
    private CalBeanLocal calBean;

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    
    
    
    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            String v1=request.getParameter("v1");
            
            
            
           
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet CalcServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            for (int i = 0; i < v1.length(); i++) 
            {
                if (v1.charAt(i)== '+') 
                    out.println("<h1>Suma = " + calBean.sumar(Integer.parseInt(v1.split("\\+")[0]),Integer.parseInt(v1.split("\\+")[1])) + "</h1>");
                else
                if (v1.charAt(i)== '-') 
                    out.println("<h1>Resta = " + calBean.restar(Integer.parseInt(v1.split("-")[0]),Integer.parseInt(v1.split("-")[1])) + "</h1>");
                else
                if (v1.charAt(i)== '*') 
                    out.println("<h1>Multiplicacion = " + calBean.multiplicar(Integer.parseInt(v1.split("\\*")[0]),Integer.parseInt(v1.split("\\*")[1])) + "</h1>");
                else
                if (v1.charAt(i)== '/') 
                    out.println("<h1>Division = " + calBean.dividir(Integer.parseInt(v1.split("/")[0]),Integer.parseInt(v1.split("/")[1])) + "</h1>");
                else
                if (v1.charAt(i)== '%') 
                    out.println("<h1>Modulo = " + calBean.modulo(Integer.parseInt(v1.split("%")[0]),Integer.parseInt(v1.split("%")[1])) + "</h1>");
                else
                if (v1.charAt(i)== '^') 
                    out.println("<h1>Cuadrado = " + calBean.potencia(Integer.parseInt(v1.split("\\^")[0])) + "</h1>");          
            }
            
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
