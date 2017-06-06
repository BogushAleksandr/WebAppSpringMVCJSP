/*global $ */
$(document).ready(function(){

    var prosforaList;

    //get controls:
    var prosforaSelect = $("#store-prosfora-id");

    $.ajax({
        url: "/get/prosfori",
        type: "post",
        success: function(data){
            console.log("prosfori:");
            console.log(data);

            prosforaList = data;

            var prosforasElement = $(".prosfori-types");

            console.log(typeof(data) + " length= " + data.length);

            prosforaList.forEach(function(item){
                prosforaSelect.append("<option value=" + item.id + ">" + item.name + "</option>");

            });

            for(var i = 0; i<data.length; i++){
                prosforasElement.append("<li>" + data[i].id + " " + data[i].name + "" + data[i].price + "</li>");
            }
        }
    });

    $("#create-prosfora").click(function(){

        var prosforaName = $("#prosfora-name").val().trim();
        var prosforaPrice = $("#prosfora-price").val().trim();

        var data = JSON.stringify({
            name: prosforaName,
            price: prosforaPrice
        });

        $.ajax({
            url: "/admin/add/prosfora",
            type: "post",
            data: {data: data},
            success: function(response){
                console.log("prosfora creation");
                console.log(response);
            }
        });
    });

    $("#create-store").click(function(){
        var prosforaId = $("#store-prosfora-id").val().trim();
        var prosforaQuantity = $("#store-quantity").val().trim();

        var data = JSON.stringify({
            prosforaId: prosforaId,
            quantity: prosforaQuantity
        });

        $.ajax({
            url: "/admin/add/store",
            type:"post",
            data: {data: data},
            success:function(response){
                console.log("store entry creation");
                console.log(response);
            }
        });
    });


    $("#store").click(function(){

        $.ajax({
            url:"/admin/store",
            type:"post",
            success: function(data){
                console.log("store:");
                console.log(data);
                var storeElement = $(".store-entry");

                //console.log(data[0].prosforaId);

                for(var i = 0; i<data.length; i++){
                    storeElement.append("<li>" + data[i].id + " " + data[i].prosforaId + "" + data[i].quantity + "</li>");
                }
            }
        });
    });

    $("#prosfori").click(function(){


    });

});