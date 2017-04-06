<%-- 
    Document   : NextPage
    Created on : Apr 9, 2012, 9:19:47 PM
    Author     : cthoma29
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="user" class="JavaBean.UserData" scope="session"/>
<!DOCTYPE html>
<html><body>
<%--<h2>Hello <%=session.getAttribute("theName")%>!<br/>
E-mail: <%=session.getAttribute("theEmail")%><br/>
Age: <%=session.getAttribute("theAge")%></h2>--%>
You entered<BR> Name: 
<%= user.getUsername() %><BR>
Email: <%= user.getEmail() %><BR>
Age: <%= user.getAge() %><p>

Session Bean<BR>
Name: <%= user.getUsername() %><BR>
Email: <%= user.getEmail() %><BR>
Age: <%= user.getAge() %><BR>
</body></html>