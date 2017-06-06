<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Registration</title>
    <script
            src="https://code.jquery.com/jquery-3.2.1.min.js"
            integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
            crossorigin="anonymous"></script>
    <script src="resources/js/reg.js"></script>
    <link href="/resources/css/stylereg.css" rel="stylesheet">
</head>
<body>

<%--<div>
    <label for="username">Username:</label><input id="username" type="text" placeholder="Имя пользователя"><br/>
    <label for="login">Login:</label><input id="login" type="text" placeholder="Логин"><br/>
    <label for="email">Email:</label><input id="email" type="text" placeholder="E-mail"><br/>
    <label for="phone-number">Phone number:</label><input id="phone-number" type="text" placeholder="Номер телефона"><br/>
    <label for="password">Password: </label><input id="password" type="password" placeholder="Пароль"><br/>
    <label for="confirm-password">Confirm password:</label><input id="confirm-password" type="password" placeholder="Повторите пароль"><br/>
    <button id="send">Регистрация</button>
</div>--%>
<div class="regis">
    <div class="field">
        <label for="username" style="float: left">Имя:</label>
        <input id="username" type="text" placeholder="Имя пользователя"><br/>
    </div>
    <div class="field">
        <label for="login" style="float: left">Логин:</label>
        <input id="login" type="text" placeholder="Логин"><br/>
    </div>
    <div class="field">
        <label for="email" style="float: left">E-mail:</label>
        <input id="email" type="text" placeholder="E-mail"><br/>
    </div>
    <div class="field">
        <label for="phone-number" style="float: left">Номер телефона:</label>
        <input id="phone-number" type="text" placeholder="Номер телефона"><br/>
    </div>
    <div class="field">
        <label for="password" style="float: left">Password: </label>
        <input id="password" type="password" placeholder="Пароль"><br/>
    </div>
    <div class="field">
        <label for="confirm-password" style="float: left">Повторите password:</label>
        <input id="confirm-password" type="password" placeholder="Повторите пароль"><br/>
    </div>
    <button id="send">Регистрация</button>
</div>

</body>
</html>
