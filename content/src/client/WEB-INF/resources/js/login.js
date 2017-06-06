/* global $ */
$(document).ready(function(){

    $("#sendButton").click(function(){

        var login = $("#login").val().trim();
        var password = $("#password").val().trim();

        var data = JSON.stringify({
            login: login,
            password: password
        });

        $.ajax({
            url:"/login",
            type: "post",
            data: {data: data},
            success: function(response){
                if(response === "true"){
                    window.location.replace("/");
                }else{
                    //TODO change error behaviour
                    alert("Something went wrong.")
                }
            }
        });
    });
});