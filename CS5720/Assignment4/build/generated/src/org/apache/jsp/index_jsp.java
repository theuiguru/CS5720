package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.Vector _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public Object getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html><head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("<title>A Sample FORM using POST</title>\n");
      out.write("</head><body bgcolor=\"#FDF5E6\">\n");
      out.write("<center><h1>A Sample FORM using POST</h1></center>\n");
      out.write("<form method=\"POST\" action=\"http://localhost:8080/AssignmentFour/OrderServlet\">\n");
      out.write("Item Number: <input type=\"text\" size=\"20\" name=\"itemNo\"><br>\n");
      out.write("Quantity: <input type=\"text\" size=\"20\" name=\"qty\"><br>\n");
      out.write("Price Each: <input type=\"text\" size=\"20\" name=\"price\" value=\"$\"><br>\n");
      out.write("<hr>\n");
      out.write("First Name: <input type=\"text\" size=\"20\" name=\"firstName\"><br>\n");
      out.write("Last Name: <input type=\"text\" size=\"20\" name=\"lastName\"><br>\n");
      out.write("Middle Initial: <input type=\"text\" size=\"20\" name=\"mi\"><br>\n");
      out.write("Shipping Address: <textarea name=\"address\" rows=\"5\" cols=\"40\"></textarea><br>\n");
      out.write("Credit Card:<br>\n");
      out.write("<input type=\"radio\" name=\"cardType\" value=\"visa\">Visa<br>\n");
      out.write("<input type=\"radio\" name=\"cardType\" value=\"mc\">Master Card<br>\n");
      out.write("<input type=\"radio\" name=\"cardType\" value=\"ae\">American Express<br>\n");
      out.write("<input type=\"radio\" name=\"cardType\" value=\"discover\">Discover<br>\n");
      out.write("<input type=\"radio\" name=\"cardType\" value=\"javasc\">Java SmartCard<br>\n");
      out.write("Credit Card Number: <input type=\"password\" name=\"cardNo\"><br>\n");
      out.write("Repeat Credit Card Number: <input type=\"password\" name=\"cardNo\"><p>\n");
      out.write("<center><input type=\"submit\" value=\"Submit Order\"></center>\n");
      out.write("</form></body></html>");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
