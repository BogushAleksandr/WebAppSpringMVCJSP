/*global $*/
$(document).ready(function(){

    var prosforaTypes;

    $.ajax({
        url: "/get/prosfori",
        type: "post",
        success: function(data){
            console.log("prosfori:");
            console.log(data);
            prosforaTypes = data;
        }
    });
    $("#send-order").click(function(){

        var prosforaId = $("#prosfora-id").val().trim();

        var quantity = $("#quantity").val().trim();
        var deliveryAddr = $("#delivery-address").val().trim();
        var deliveryDate = new Date($("#delivery-date").val().trim()).getTime();//toISOString().slice(0,10);
        var comment = $("#comment").val().trim();



        var data = JSON.stringify({
            prosforaId: prosforaId,
            quantity : quantity,
            deliveryAddress : deliveryAddr,
            deliveryDate : deliveryDate,
            comment: comment
        });

        console.log({data:data});
        /*
        $.ajax({
            url: "/order",
            type: "post",
            data: {data: data},
            success: function(data){
                if(data === "ok")
                    console.log("ordering done");
            }
        });*/
    });

    for(var i = 1; i<5; i++)
        $("#send-order"+i).click(clickHandler);



    //knopka po kotoroi clickaesh
    $("#quick-order").click(function(){

        var krestovId = 1;
        var bogorodId = 2;

        var krestovQuantity = $("#krestov-quantity").val().trim();
        var bogorodQuantity = $("#bogorod-quantity").val().trim();

        var deliveryAddr = $("#delivery-address").val().trim();
        var deliveryDate = new Date($("#delivery-date").val().trim()).getTime();//toISOString().slice(0,10);
        var comment = $("#comment").val().trim();



        var data1 = JSON.stringify({
            prosforaId: krestovId,
            quantity : krestovQuantity,
            deliveryAddress : deliveryAddr,
            deliveryDate : deliveryDate,
            comment: comment
        });
        var data2 = JSON.stringify({
            prosforaId: bogorodId,
            quantity : bogorodQuantity,
            deliveryAddress : deliveryAddr,
            deliveryDate : deliveryDate,
            comment: comment
        });

        console.log({data:data1, data2: data2});

        $.ajax({
            url: "/order",
            type: "post",
            data: {data: data1},
            success: function(data){
                if(data === "ok")
                    console.log("ordering done");
            }
        });
        $.ajax({
            url: "/order",
            type: "post",
            data: {data: data2},
            success: function(data){
                if(data === "ok")
                    console.log("ordering done");
            }
        });
    });


});

function clickHandler(){

    id = $(this).attr("id").slice(-1);

    //var prosforaId = $("#prosfora-id" + id).val().trim();

    console.log("#quantity" + id);

    var quantity = $("#quantity" + id).val().trim();
    var deliveryAddr = $("#delivery-address" + id).val().trim();
    var deliveryDate = new Date($("#delivery-date" + id).val().trim()).getTime();//toISOString().slice(0,10);
    var comment = $("#comment" + id).val().trim();


    var data = JSON.stringify({
        prosforaId: id,
        quantity : quantity,
        deliveryAddress : deliveryAddr,
        deliveryDate : deliveryDate,
        comment: comment
    });

    console.log({data:data});
/*
 $.ajax({
 url: "/order",
 type: "post",
 data: {data: data},
 success: function(data){
 if(data === "ok")
 console.log("ordering done");
 }*/
 }