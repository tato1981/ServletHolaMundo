/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;



public class Registro extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request atender de responder las peticiones del cliente
     * @param response servlet response atiende las respuestas que vienen de servidor
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            
            String nom, appat, apmat, correo, ip, ipr;            
            int edad, puerto, puertor;
            
            ip= request.getLocalAddr();
            puerto = request.getLocalPort();
            
            ipr = request.getRemoteAddr();
            puertor = request.getRemotePort();
            
            nom = request.getParameter("nombre");
            appat = request.getParameter("appat");
            apmat = request.getParameter("apmat");
            edad = Integer.parseInt(request.getParameter("edad"));
            correo = request.getParameter("correo");
            
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet Registro</title>");            
            out.println("</head>");
            out.println("<body>"            
                       +"<br>"
                       +"Tu nombre es: "+nom
                       +"<br>"
                       +"Tu apellido paterno es: "+appat
                       +"<br>"
                       +"Tu apellido materno es: "+apmat
                       +"<br>"
                       +"Tu edad es: " +edad
                       +"<br>"
                       +"Tu correo es: "+correo
                       +"<br>"
                       +"Tu ip es: "+ ip
                       +"<br>"
                       +"Tu ip remota es: "+ipr
                       +"<br>"
                       +"Tu puerto es: "+puerto
                       +"<br>"
                       +"Tu puerto remoto es: " +puertor);
            out.println("<h1>Registro Exitoso </h1>"
                         +"<a href='index.html'>Regresar al menu principal</a>");
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
