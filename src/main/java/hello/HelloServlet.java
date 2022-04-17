/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.time.LocalTime;

/**
 *
 * @author viter
 */
@WebServlet("/alomundo")
public class HelloServlet extends HttpServlet {

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
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HelloServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HelloServlet at " + request.getContextPath() + "</h1>");
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
        
        String msg = "";
        
        String lang = request.getParameter("lang");
        if(lang==null)
            lang = "pt";
        switch(lang){
            case "pt":
                msg = "Alô, ";
                break;
            case "en":
                msg = "Hello, ";
                break;
            case "fr":
                msg = "Bonjour, ";
                break;
            case "es":
                msg = "Hola, ";
                break;
            case "jp":
                msg = "Kon'nichiwa, ";
                break;
        }
        
        String nome = request.getParameter("nome");

        if(nome==null)
            nome = "Fulano";
        
        msg = msg+nome+"!";

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HelloServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet HelloServlet</h1>");
            out.println("<p>" + msg + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
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
        String msg = "";
        
        String lang = request.getParameter("lang");
        if(lang==null)
            lang = "pt";
        switch(lang){
            case "pt":
                msg = "Alô, ";
                break;
            case "en":
                msg = "Hello, ";
                break;
            case "fr":
                msg = "Bonjour, ";
                break;
            case "de":
                msg = "Hallo, ";
                break;
            case "es":
                msg = "Hola, ";
                break;
            case "jp":
                msg = "Kon'nichiwa, ";
                break;
        }
        
        String voca = request.getParameter("voca");
        if(voca == null)
            voca = "";
        
        switch(voca){
            case "nn":
                msg = msg + "";
                break;
            case "Sr.":
                msg = msg + "Sr. ";
                break;
            case "Sra.":
                msg = msg + "Sra. ";
                break;
        }
        
        String nome = request.getParameter("nome");

        if(nome==null)
            nome = "Fulano";
        
        msg = msg+nome+", ";
        
        
        LocalTime Tempo = LocalTime.now();
        
        if(Tempo.getHour() >=0 && Tempo.getHour() <= 12){
        switch(lang){
            case "pt":
                msg = msg + "Bom dia !";
                break;
            case "en":
                msg = msg + "Good morning !";
                break;
            case "fr":
                msg = msg + "Bon matin !";
                break;
            case "de":
                msg = msg + "Guten morgen !";
                break;
            case "es":
                msg = msg + "Buen día !";
                break;
            case "jp":
                msg = msg + "Ohayō !";
                break;
        }
        }else if (Tempo.getHour() > 12 && Tempo.getHour() <= 18) {
            switch(lang){
                case "pt":
                    msg = msg + "Boa tarde !";
                    break;
                case "en":
                    msg = msg + "Good afternoon !";
                    break;
                case "fr":
                    msg = msg + "Bon après-midi !";
                    break;
                case "de":
                    msg = msg + "Guten tag !";
                    break;
                case "es":
                    msg = msg + "Buenas tardes !";
                    break;
                case "jp":
                    msg = msg + "Kon'nichiwa !";
                    break;
            }
        } else {
            switch(lang){
                case "pt":
                    msg = msg + "Boa noite !";
                    break;
                case "en":
                    msg = msg + "Good night !";
                    break;
                case "fr":
                    msg = msg + "Bonne nuit !";
                    break;
                case "de":
                    msg = msg + "Gute nacht !";
                    break;
                case "es":
                    msg = msg + "Buenas noches !";
                    break;
                case "jp":
                    msg = msg + "Oyasuminasai !";
                    break;
            }
        }
        


        
        
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet HelloServlet</title>");            
            out.println("</head>");
            out.println("<body style=\"background-color:lightgray;\">");
            out.println("<h1>Desenvolvimento de Aplicações Corporativas</h1>");
            out.println("<p style=\"color:red;\">" + msg + "</p>");
            out.println("</body>");
            out.println("</html>");
        }
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
