<%-- 
    Document   : index
    Created on : Mar 14, 2012, 8:26:41 PM
    Author     : cthoma29
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.util.*"%>
<%@page import="JavaBean.UserData"%>
<!DOCTYPE html>
<html><body>
<%--    
        <% java.util.Date date = new java.util.Date();%>
        <h1>Hello! The time is now 
        <% out.println(date);
           out.println("<BR>Your machine's address is: ");
           out.println(request.getRemoteHost());%></h1>
           
       <%! Date theDate = new Date();
            Date getDate() {
                return theDate;
            } %>
            
       <table border="2">
           <% for(int i=0; i<5; i++) { %>
           <tr><td>Number</td>
               <td><%=i+1%></td>
           </tr>
           <% } %>
       </table>
--%>
<form method="POST" action="SaveName.jsp">
   What's your name? <input type="text" name="username" size="20" /><BR>
   What's your email address? <input type="text" name="email" size="20" /><BR>
   What's your age? <input type="text" name="age" size="4" /><p>
   <input type="submit" />
   
</form></body></html>