package com.prosfori.controllers;

import com.google.gson.GsonBuilder;
import com.prosfori.dao.DatabaseWrapper;
import com.prosfori.dao.User;
import org.hibernate.Session;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.gson.Gson;

/**
 * Created by Admin on 18.05.2017.
 */
@Controller
public class RegistrationController {
    @RequestMapping(value = "/registration", method = RequestMethod.GET)
    public String getPage(ModelMap model){
        return "register";
    }

    @ResponseBody
    @RequestMapping(value = "/registration", method = RequestMethod.POST)
    public String registerUser(HttpServletRequest request, HttpServletResponse response, ModelMap model){
        model.addAttribute("parameter", request.getParameter("data"));

        //TODO add a user to database
        Gson gson = new GsonBuilder().create();

        //getting a user from json we got from a request
        User user = gson.fromJson(request.getParameter("data"), User.class);

        DatabaseWrapper wrapper = DatabaseWrapper.getInstance();



        return wrapper.registerUser(user);
    }

}
