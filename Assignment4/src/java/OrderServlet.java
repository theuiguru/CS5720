import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.mysql.jdbc.Connection;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import javax.servlet.http.HttpSession;
import javax.sql.*;
/**
 * CS5720: Assignment 4
 * Description: OrderServlet.java;
 *  Process the form data sent from the html form, save the data into database.
 *  Use MySQL as backend database, create a table with following columns listed.
 *  Display a confirm html page with the data retrieved from database by referencing ItemNumber.
 * @author cthoma29
 */
@WebServlet(name = "OrderServlet", urlPatterns = {"/OrderServlet"})
public class OrderServlet extends HttpServlet {
    /** 
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code> methods.
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private Connection con = null;
    private PrintWriter out;
    Statement s = null;
    protected void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {  
        int item=0, qty=0, ccnum=0;
        String price="", fname="", lname="", addr="", cctype="";
        response.setContentType("text/html;charset=UTF-8");
        String itemNum = request.getParameter("itemNo");
        String quantity = request.getParameter("qty");
        String priceach = request.getParameter("price");
        String fName = request.getParameter("firstName");
        String lName = request.getParameter("lastName");
        String address = request.getParameter("address");
        String creditcard = request.getParameter("cardType");
        String cardNo = request.getParameter("cardNo");
        String query = "INSERT INTO FormData VALUES('" + itemNum + "', '" + quantity + "', '" + priceach + "', '" + fName + "', '" + lName + "', '" + address + "', '" + creditcard + "', '" + cardNo + "')";
        String query2 = "SELECT * FROM FormData WHERE ItemNumber= '" + itemNum + "' ";
        out = response.getWriter();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost/AssignmentFour", "root", "OWMYSQL");
            s = (Statement) con.createStatement();
            s.executeUpdate(query);
        } catch(Exception e) {
            e.printStackTrace();
        }
        try {
            ResultSet rs = s.executeQuery(query2);
            while(rs.next()) {
                item = rs.getInt("ItemNumber");
                qty = rs.getInt("Quantity");
                price = rs.getString("Price");
                fname = rs.getString("FirstName");
                lname = rs.getString("LastName");
                addr = rs.getString("ShippingAddr");
                cctype = rs.getString("CreditCardType");
                ccnum = rs.getInt("CreditCardNum");
                con.close();
            }
        } catch(SQLException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
            while((e = e.getNextException()) != null) {
                System.out.println(e.getMessage());
            }
        }
        catch(Exception e) { Logger.getLogger(OrderServlet.class.getName()).log(Level.SEVERE, null, e); }
        try {
            //HttpSession session = request.getSession();
            //session.setAttribute("ItemNumber", item);
            //TODO output your page here
            out.println("<html>");
            out.println("<head>");
            out.println("<title>A Sample FORM using POST</title>"); 
            out.println("</head>");
            out.println("<body bgcolor='#FDF5E6'>");
            out.println("<h1 align='center'>A Sample FORM using POST</h1>");
            out.println("<b>Confirmation</b><p>");
            out.println("Item Number: " + item + "<br>");
            out.println("Quantity: " + qty + "<br>");
            out.println("Price: " + price + "<br>");
            out.println("First Name: " + fname + "<br>");
            out.println("Last Name: " + lname + "<br>");
            out.println("Shipping Address: " + addr + "<br>");
            out.println("Credit Card: " + cctype + "<br>");
            out.println("Credit Card Number: " + ccnum + "<br>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }
    /*public Connection connectionDB() throws SQLException {
        try {
            Class.forName( "com.mysql.jdbc.Driver" );
            con = (Connection) DriverManager.getConnection( "jdbc.mysql://localhost:3306", "root", "OWMYSQL" );
            return con;
        } catch (Exception ex) {
            Logger.getLogger(OrderServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;
    }*/
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