<%--
  Created by IntelliJ IDEA.
  User: dedovcore
  Date: 09.08.2020
  Time: 16:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>


<html>
<head>
    <title>Добавь авто</title>
</head>
<body>
<h1>Добавь авто в нашу базу данных</h1>
<FORM action="/", method="post">
    <p>Имя<input type = "text" name="name" required></p>
    <p>Модель<input type = "text" name="model" required></p>
    <p>Цена<input type = "number" name="price" required></p>
    <p>Номер телефона<input type = "number" name="number" required></p>
    <p><input type = "submit" value = "окей" /><p>
</FORM>

<a href="/Delete"> <button>Либо удали авто</button></a>

</body>
</html>
