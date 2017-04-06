<%-- 
    Document   : index
    Created on : Apr 18, 2012, 11:19:45 AM
    Author     : Jiasheng Li
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<title>Coffee Advisor></title>
<body>
  <h1 align="center">Coffee Advisor </h1>
  <form method="POST" action="/MVC/CoffeeServlet">
    Select coffee
    Type:
    <select name="type" size=1">
      <option value="milky">Milky</option>
      <option value="froffy">Froffy</option>
      <option value="icey">Icey</option>
      <option value="strong">Spaced Out</option>
    </select>
    <br><br>
    <center>
      <input type="Submit">
    </center>
   </form>
</body>
<html>