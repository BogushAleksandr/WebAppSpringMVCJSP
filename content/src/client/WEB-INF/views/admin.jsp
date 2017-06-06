<%--
  Created by IntelliJ IDEA.
  User: Admin
  Date: 19.05.2017
  Time: 23:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <script
            src="https://code.jquery.com/jquery-3.2.1.min.js"
            integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
            crossorigin="anonymous"></script>
    <script src="/resources/js/admin.js" type="text/javascript"></script>
</head>
<body>

    <div class="prosfora">
        <label for="prosfora-name">Name:</label><input id="prosfora-name" type="text"><br/>
        <label for="prosfora-price">Price:</label><input id="prosfora-price" type="number">
        <button id="create-prosfora">create</button>
    </div>

    <br>
    <br>

    <div class="store">
        <label for="store-prosfora-id">Name:</label><select id="store-prosfora-id"></select><br/>
        <label for="store-quantity">Quantity:</label><input id="store-quantity" type="number">
        <button id="create-store">create</button>
    </div>

    <button id="store">get store</button>
    <button id="prosfori">get prosfori</button>


    <div class="store-entry"></div>
    <hr>
    <div class="prosfori-types"></div>
    <hr>
    <div class="orders"></div>
</body>
</html>
