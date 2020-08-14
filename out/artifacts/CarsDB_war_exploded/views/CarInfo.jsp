<%@ page import="service.CarService" %>
<%@ page import="java.sql.Statement" %>
<%@ page import="dataBase.JDBC" %>
<%@ page import="java.sql.ResultSet" %>
<%@ page import="models.Car" %>
<%@ page import="java.sql.SQLException" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.io.PrintWriter" %><%--
  Created by IntelliJ IDEA.
  User: dedovcore
  Date: 10.08.2020
  Time: 19:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>База данных</title>
</head>
<body>
<form action="/CarInfo", method="post">
</form>

<%
    PrintWriter pw = response.getWriter();
    CarService carService = new CarService();
    ArrayList <Car> cars = carService.getAll();
%>
<table border="3">
    <tr>
        <td>Name</td>
        <td>Model</td>
        <td>Price</td>
        <td>Number</td>
    </tr>
    <%
        for(Car car:cars){
    %>
    <tr>
        <td> <%=car.getName()%> </td>
        <td> <%=car.getModel()%> </td>
        <td> <%=car.getPrice()%> </td>
        <td> <%=car.getNumber()%> </td>
    </tr>
    <%}%>
</table>
</body>
</html>
