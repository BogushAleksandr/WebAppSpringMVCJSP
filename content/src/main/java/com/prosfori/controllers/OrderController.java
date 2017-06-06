package com.prosfori.controllers;

import com.prosfori.dao.DatabaseWrapper;
import com.prosfori.dao.Ordering;
import com.prosfori.utilities.GsonWrapper;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.sql.Date;
import java.sql.Timestamp;

@Controller
@Scope("session")
public class OrderController {
    @RequestMapping("/order")
    public String returnPage(HttpServletRequest request, HttpServletResponse response){
        HttpSession session = request.getSession(false);
        return session.getAttribute("username")==null?"order":"notlogged";

    }

    //TODO add exception handling
    @ResponseBody
    @RequestMapping(value = "/order", method = RequestMethod.POST)
    public String processOrder(HttpServletRequest request, HttpServletResponse response, HttpSession session){
        GsonWrapper gson = GsonWrapper.getInstance();
        DatabaseWrapper db = DatabaseWrapper.getInstance();

        /*
        Enumeration<String> list = request.getSession().getAttributeNames();
        while(list.hasMoreElements()){
            String param = list.nextElement();
            System.out.println(param);
            System.out.println(request.getSession().getAttribute(param));
        }*/

        Ordering order = new Ordering();

        order = (Ordering) gson.fromJson(request.getParameter("data"), Ordering.class);
        order.setUserId((int)request.getSession(false).getAttribute("userid"));
        //TODO check if this works or not
        order.setOrder_date(System.currentTimeMillis());

        System.out.println("order.comment = " + order.getComment());
        System.out.println("order.delivery = " + order.getDeliveryAddress());
        System.out.println("order.confirmed = " + order.getConfirmed());
        System.out.println("order.delivered = " + order.getDelivered());
        System.out.println("order.deliveryDate = " + order.getDeliveryDate());
        System.out.println("order.id = " + order.getId());
        System.out.println("order.orderDate = " + order.getOrder_date());
        System.out.println("order.prosf_id = " + order.getProsforaId());
        System.out.println("order.quantity = " + order.getQuantity());
        System.out.println("order.user_id = " + order.getUserId());

        db.makeOrder(order);

        return "ok";
    }

    @ResponseBody
    @RequestMapping(value = "/order/user", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    public String getUserOrder(HttpServletRequest request, HttpServletResponse response){
        GsonWrapper gson = GsonWrapper.getInstance();
        DatabaseWrapper db = DatabaseWrapper.getInstance();

        return gson.toJson(db.getOrdersByUserId(Integer.parseInt(request.getParameter("userId"))));
    }
}
