/*global $*/
$(document).ready(function(){

    $("#send").click(function(){

        //TODO add validation
        var username = $("#username").val().trim();
        var login = $("#login").val().trim();
        var email = $("#email").val().trim();
        var phoneNumber = $("#phone-number").val().trim();
        var password = $("#password").val().trim();
        var cpassword = $("#confirm-password").val().trim();


        var sendData = JSON.stringify({
            username: username,
            login: login,
            email: email,
            phoneNumber: phoneNumber,
            password: password
        });

        console.log("sendData: "+sendData);
        $.ajax({
           url:"/registration",
           type: "post",
           data: {data : sendData},
           success: function(data){
               if(data === "good")
                   window.location.replace("/login");
           }
        });

   });
});