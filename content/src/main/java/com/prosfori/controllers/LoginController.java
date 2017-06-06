package com.prosfori.controllers;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.prosfori.dao.DatabaseWrapper;
import com.prosfori.dao.User;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@Scope("session")
public class LoginController {

    //TODO clean login method up?
    @RequestMapping(value = "/login", method = RequestMethod.GET)
    public String showLoginPage(){
        return "login";
    }

    @ResponseBody
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    public String login(HttpServletRequest request, HttpServletResponse response, ModelMap model){
        DatabaseWrapper wrapper = DatabaseWrapper.getInstance();

        request.getParameter("data");

        Gson gson = new GsonBuilder().create();

        User user = gson.fromJson(request.getParameter("data"), User.class);

        User db_user = wrapper.getUser(user.getLogin());

        if(!user.getPassword().equals(db_user.getPassword())){
            //something bad happened
            return "false";
        }

        HttpSession session = request.getSession();

        session.setAttribute("username", db_user.getUsername());
        session.setAttribute("userid", db_user.getId());

        return "true";
    }
}
