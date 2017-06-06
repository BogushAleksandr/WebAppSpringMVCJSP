<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@page language="java" contentType="text/html; ISO-8859-1" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <script
            src="https://code.jquery.com/jquery-3.2.1.min.js"
            integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
            crossorigin="anonymous"></script>
    <script src="resources/js/login.js"></script>
    <link href="/resources/css/style.css" rel="stylesheet">
</head>
<body>
<div style="font-family: 'Monotype Corsiva'; font-size: 15pt; font-weight: bolder; color: #feff3c;">
    <input id="login" type="text" placeholder="Введите логин">
    <input id="password" type="password" placeholder="Введите пароль">
    <button id="sendButton">OK</button>
</div>
<%--<div style="font-family: 'Monotype Corsiva'; font-size: 15pt; font-weight: bolder; color: #feff3c;">
    <label for="login">Login: </label><input id="login" type="text" placeholder="Введите логин">
    <label for="password">Password:</label><input id="password" type="password" placeholder="Введите пароль">
    <button id="sendButton">OK</button>
</div>--%>
</body>
</html>