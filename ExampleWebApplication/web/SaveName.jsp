<%-- 
    Document   : SaveName
    Created on : Apr 9, 2012, 9:12:21 PM
    Author     : cthoma29
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<jsp:useBean id="user" class="JavaBean.UserData" scope="session"/>
<jsp:setProperty name="user" property="*"/>
<% JavaBean.UserData userData = new JavaBean.UserData();
   userData.setAge(Integer.parseInt(request.getParameter("age")));
   userData.setUsername(request.getParameter("username"));
   userData.setEmail(request.getParameter("email"));
%>
<%--
    String name = request.getParameter("username");
    String email = request.getParameter("email");
    String age = request.getParameter("age");
    session.setAttribute("theName", name);
    session.setAttribute("theEmail", email);
    session.setAttribute("theAge", age);
--%>
<!DOCTYPE html>
<html><body>
        <h1><a href="NextPage.jsp">Continue</a></h1>
</body></html>