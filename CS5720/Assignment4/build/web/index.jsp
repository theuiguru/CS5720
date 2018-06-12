<%-- 
    Document   : index
    Created on : Apr 10, 2012, 12:59:36 PM
    Author     : cthoma29
    CS5720: Assignment 4
    Description: Order html form allowing user to enter/select value on the form and click submit button to post form data to the server side.
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html><head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>A Sample FORM using POST</title>
</head><body bgcolor="#FDF5E6">
<center><h1>A Sample FORM using POST</h1></center>
<form method="POST" action="http://localhost:8080/AssignmentFour/OrderServlet">
Item Number: <input type="text" size="20" name="itemNo"><br>
Quantity: <input type="text" size="20" name="qty"><br>
Price Each: <input type="text" size="20" name="price" value="$"><br>
<hr>
First Name: <input type="text" size="20" name="firstName"><br>
Last Name: <input type="text" size="20" name="lastName"><br>
Middle Initial: <input type="text" size="20" name="mi"><br>
Shipping Address: <textarea name="address" rows="5" cols="40"></textarea><br>
Credit Card:<br>
<input type="radio" name="cardType" value="visa">Visa<br>
<input type="radio" name="cardType" value="mc">Master Card<br>
<input type="radio" name="cardType" value="ae">American Express<br>
<input type="radio" name="cardType" value="discover">Discover<br>
<input type="radio" name="cardType" value="javasc">Java SmartCard<br>
Credit Card Number: <input type="password" name="cardNo"><br>
Repeat Credit Card Number: <input type="password" name="cardNo"><p>
<center><input type="submit" value="Submit Order"></center>
</form></body></html>