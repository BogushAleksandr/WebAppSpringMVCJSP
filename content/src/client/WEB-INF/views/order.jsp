<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Order</title>
    <script
            src="https://code.jquery.com/jquery-3.2.1.min.js"
            integrity="sha256-hwg4gsxgFZhOsEEamdOYGBf13FyQuiTwlAQgxVSNgt4="
            crossorigin="anonymous"></script>
    <script src="/resources/js/order.js" type="text/javascript"></script>
    <script src="http://cdn.jsdelivr.net/webshim/1.12.4/extras/modernizr-custom.js"></script>
    <!-- polyfiller file to detect and load polyfills -->
    <script src="http://cdn.jsdelivr.net/webshim/1.12.4/polyfiller.js"></script>
    <script>
        /* global webshims*/
        /* global setOptions */
        webshims.setOptions('waitReady', false);
        webshims.setOptions('forms-ext', {types: 'date'});
        webshims.polyfill('forms forms-ext');
    </script>
    <link href="/resources/css/styleorder.css" rel="stylesheet">
</head>
<body>
<%--
 <label for="prosfora-id">Select type:</label><select id="prosfora-id"></select><br/>
 <label for="quantity">Quantity</label><input id="quantity" type="number"><br/>
 <label for="delivery-address">Deliver to:</label><input id="delivery-address" type="text"><br/>
 <label for="delivery-date">Delivery date:</label><input id="delivery-date" type="date"><br/>
 <label for="comment">Additional info:</label><input id="comment" type="text"><br/>

 <button id="send-order">Create order</button>--%>


<div>
    <div class="orderingmal">
        <p id="order1"> Малые крестовые просфоры</p>
        <div class="main">
            <div id="img1">
                <img id="m1" src="/resources/img/mal.jpg" width="270px" height="270px"
                     alt="Малые крестовые просфорки"/></br>
            </div>
            <div class="form-field">
                <div class="field">
                    <label for="quantity1" style="float: left">Количество</label>
                    <input id="quantity1" type="number" placeholder="Количество" title="Количество крестовых"/>
                </div>
                <div class="field">
                    <label for="delivery-address1" style="float: left">Адрес доставки:</label>
                    <input id="delivery-address1" type="text" placeholder="Адрес доставки"/>
                </div>
                <div class="field">
                    <label for="delivery-date1" style="float: left">Дата заказа</label>
                    <input id="delivery-date1" type="date" />
                </div>
                <div class="field">
                    <label for="comment1" style="float: left">Дополнительная информация</label>
                    <input id="comment1" type="text" placeholder="Комментарии"/>
                </div>
                <button id="send-order1">Отправить</button>
            </div>
        </div>
    </div>

    <div class="orderingbigkrest">
        <p id="order2">Большие крестовые просфоры</p>
        <div class="main">
            <div id="img2">
                <img id="m2" src="/resources/img/bigkrest.jpg" width="270px" height="260px"
                     alt="Большие крестовые просфорки"/></br>
            </div>
            <div class="form-field">
                <div class="field">
                    <label for="quantity2" style="float: left">Количество</label>
                    <input id="quantity2" type="number" placeholder="Количество"
                           title="Количество крестовых"/>
                </div>
                <div class="field">
                    <label for="delivery-address2" style="float: left">Адрес доставки:</label>
                    <input id="delivery-address2" type="text" placeholder="Адрес доставки"/>
                </div>
                <div class="field">
                    <label for="delivery-date2" style="float: left">Дата заказа</label>
                    <input id="delivery-date2" type="date"/>
                </div>
                <div class="field">
                    <label for="comment2" style="float: left">Дополнительная информация</label>
                    <input id="comment2" type="text" placeholder="Комментарии"/>
                </div>
                <button id="send-order2">Отправить</button>
            </div>
        </div>
    </div>
</div>


<div>
    <div class="orderingsredkrest">
        <p id="order3">Средние крестовые просфоры</p>
        <div class="main">
            <div id="img3">
                <img id="m3" src="/resources/img/sredkrest.jpg" width="270px" height="270px" alt="Средние крестовые просфорки"/></br>
            </div>
            <div class="form-field">
                <div class="field">
                    <label for="quantity3" style="float: left">Количество</label>
                    <input id="quantity3" type="number" placeholder="Количество крестовых" title="Количество"/>
                </div>
                <div class="field">
                    <label for="delivery-address3" style="float: left">Адрес доставки:</label>
                    <input id="delivery-address3" type="text" placeholder="Адрес доставки"/>
                </div>
                <div class="field">
                    <label for="delivery-date3" style="float: left">Дата заказа</label>
                    <input id="delivery-date3" type="date"/>
                </div>
                <div class="field">
                    <label for="comment3" style="float: left">Дополнительная информация</label>
                    <input id="comment3" type="text" placeholder="Комментарии"/>
                </div>
                <button id="send-order3">Отправить</button>
            </div>
        </div>
    </div>

    <div class="orderingsredbogor">
        <p id="order4">Средние борогодичные просфоры</p>
        <div class="main">
            <div id="img4">
                <img id="m4" src="/resources/img/sredbogor.jpg" width="270px" height="260px" alt="Средние борогодичные просфорки"/></br>
            </div>
            <div class="form-field">
                <div class="field">
                    <label for="quantity4" style="float: left">Количество</label>
                    <input id="quantity4" type="number" placeholder="Количество борогодичных" title="Количество"/>
                </div>
                <div class="field">
                    <label for="delivery-address4" style="float: left">Адрес доставки:</label>
                    <input id="delivery-address4" type="text" placeholder="Адрес доставки"/>
                </div>
                <div class="field">
                    <label for="delivery-date4" style="float: left">Дата заказа</label>
                    <input id="delivery-date4" type="date"/>
                </div>
                <div class="field">
                    <label for="comment4" style="float: left">Дополнительная информация</label>
                    <input id="comment4" type="text" placeholder="Комментарии"/>
                </div>
                <button id="send-order4">Отправить</button>
            </div>
        </div>

    </div>
</div>

</body>
</html>
