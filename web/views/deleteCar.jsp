<%--
  Created by IntelliJ IDEA.
  User: dedovcore
  Date: 09.08.2020
  Time: 18:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Мои конгратьюлейшены</title>
</head>


<body>
<h1>Авто в базе данных</h1>
<form action="/Hello", method="post">
<p>Если хочешь удалить свое авто из базы данных, то введи свой номер телефона:</p>
<p>Номер телефона<input type = "number" name="number" required></p>
    <p><input type = "submit" value = "удалить" /><p>
</form>
<a href="/"> <button>Назад</button></a>
<a href="/CarInfo"> <button>База данных</button></a>



</body>
</html>
