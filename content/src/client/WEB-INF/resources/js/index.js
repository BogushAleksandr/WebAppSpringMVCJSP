/* global $ */

$(document).ready(function(){
    alert("Добро пожаловать на православную страницу просфорни! Заказ просфорок только после регистрации!");

    $(".signin").click(function(){
        window.location.replace("/login");
    });

    $(".signout").click(function(){

        $.ajax({
            url: "/logout",
            type: "post",
            success: function(){
                window.location.replace("/");
            }
        });
    })

});
