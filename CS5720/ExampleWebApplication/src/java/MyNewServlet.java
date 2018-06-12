/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author cthoma29
 */
@WebServlet(name = "MyNewServlet", urlPatterns = {"/MyNewServlet"})
public class MyNewServlet extends HttpServlet {

    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("Application/pdf");
        PrintWriter out = response.getWriter();
        try {
            String c = request.getParameter("type");
            CoffeeExpert ce = new CoffeeExpert();
            List result = ce.getTypes(c);
            request.setAttribute("styles", result);
            RequestDispatcher view = request.getRequestDispatcher("result.jsp");
            view.forward(request, response);
            /*URL pdfLink = new URL("http://www.oldwestbury.edu/pdfforms/Catalog10-12_Online.pdf");
            URLConnection conn = pdfLink.openConnection();
            InputStream input = conn.getInputStream();
            OutputStream output = response.getOutputStream();
            int read = 0;
            byte[] bytes = new byte[1024];
            while((read = input.read(bytes)) != -1)
            {
                output.write(bytes,0,read);
            }
            output.flush();
            output.close();*/
            //response.setHeader("Content-disposition", "inline; filename=pdfforms/Catalog10-12_Online.pdf");
            
            /*String firstName = request.getParameter("firstName");
            String lastName = request.getParameter("lastName");
            HttpSession session = request.getSession();
            //session.getAttribute("userName");
            String userName = (String)session.getAttribute("userName");
            
            //TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet NewServlet</title>");  
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet NewServlet at " + request.getContextPath () + "</h1>");
            out.println("<p>" + userName + lastName + "</p>");
            out.println("</body>");
            out.println("</html>");*/
        } finally {            
            out.close();
        }
    }
    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /** 
     * Handles the HTTP <code>GET</code> method.
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
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>
}
