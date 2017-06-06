<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page language="java" contentType="text/html; ISO-8859-1" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>Просфорня</title>
    <script
            src="https://code.jquery.com/jquery-3.2.1.min.js"
            integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
            crossorigin="anonymous"></script>
    <script src="resources/js/index.js" type="text/javascript"></script>


    <title>Просфорня</title>
    <!--author Имя автора документа.description Описание текущего документа.keywords Список ключевых слов, встречающихся на странице.-->
    <meta http-equiv="Content-Type"/>
    <meta name="description" content="Сайт об изготовлении и продаже просфорок любой сложности"/>
    <meta name="keywords" content="просфорки, хлеб, Свято-Троицкого, Ионииского"/>
    <link href="/resources/css/style.css" rel="stylesheet">
</head>
<body link="#1e76ff" vlink="#ff8c00" alink="#52ffa5">
<div class="wrapper">
    <div class="upheader">
        <div style="position: absolute; left: 15%; right: 20%; top: 14%;">
            <h1>Просфорня Свято-Троицкого Ионинского мужского монастыря</h1></div>
        <div style=" position: absolute; top: 2%;">
            <jsp:include page="login.jsp"/>
        </div>
        <div>
            <div style="font-family: 'Monotype Corsiva'; font-size: 15pt; font-weight: bolder;position: fixed; left: 90%; right: 2%; top: 2%;">
                <a href="#registration" title="Регистрация на нашем сайте для заказа просфорок">Регистрация</a>
            </div>
            <div style="font-family: 'Monotype Corsiva'; font-size: 15pt; font-weight: bolder;position: fixed; left: 90%; right: 2%; top: 6%;">
                <a href="#Shop" title="Заказ и покупка просфорок">Покупка</a>
            </div>
            <div style="font-family: 'Monotype Corsiva'; font-size: 15pt; font-weight: bolder;position: fixed; left: 90%; right: 2%; top: 10%;">
                <a href="http://www.pravmir.ru/sekretyi-prosfornika-ili-hlebushek-s-zapahom-solntsa/" title="СМИ о нас"
                   target="_blank">СМИ о нас</a>
            </div>
            <div style="font-family: 'Monotype Corsiva'; font-size: 15pt; font-weight: bolder;position: fixed; left: 90%; right: 2%; top: 14%;">
                <p class="bold">${welcomingMessage}</p>
            </div>
        </div>
    </div>
</div>

<div class="header"></div>

<div class="content">
    <div class="razdel1">
        <p><a name="Shop">Заказ просфор</a></p></br>
    </div>

    <div class="orderf">
        <jsp:include page="order.jsp"/>
    </div>

</div>


<div class="footerend">
    <div id="adressmonast">
        <%--/* <address>Украина, город Киев, Свято-Троицкий Ионинский мужской монастырь, улица Тимирязевская, 1</address>--%>
        <p id="adr">
            Адрес:</br>
            Украина</br>
            Город Киев</br>
            Свято-Троицкий Ионинский мужской монастырь</br>
            ул.Тимирязевская, 1</br>
            Телефон:</br>
            +38099-559-61-74</br>
            e-mail:</br>
            prosforaukr@gmail.com
        </p>
    </div>

    <div id="firstregistration">
        <p><a name="registration" style="font-family: 'Monotype Corsiva'; font-size: 16pt; font-weight: bolder; color: chartreuse">Регистрация</a></p>
        <jsp:include page="register.jsp"/>
    </div>

    <div id="googlemap">
        <p style ="font-family: 'Monotype Corsiva'; font-size: 16pt; font-weight: bolder; color: chartreuse">Наши координаты:</p>
        <iframe src="https://www.google.com/maps/embed?pb=!1m18!1m12!1m3!1d1005.9250726478004!2d30.562716716827232!3d50.4155395967861!2m3!1f0!2f0!3f0!3m2!1i1024!2i768!4f13.1!3m3!1m2!1s0x40d4cf646672b139%3A0x21fe9b8f6031164!2z0KHQstGP0YLQvi3QotGA0L7QuNGG0LrQuNC5INCY0L7QvdC40L3RgdC60LjQuSDQvNC-0L3QsNGB0YLRi9GA0Yw!5e1!3m2!1sru!2sua!4v1495310758062"
                width="300" height="250" frameborder="0" style="border:0" allowfullscreen></iframe>
    </div>
</div>
</body>
</html>