package com.prosfori.controllers;

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
public class IndexController {
    /*@RequestMapping("/")
   ublic String index(HttpServletRequest request, HttpServletResponse response, ModelMap model){
       HttpSession session = request.getSession(false);
       model.addAttribute("welcomingMessage", session==null || session.getAttribute("username") == null?"<a href='#' class='signin'>Sign in!</a>":
                                           "Welcome, "+session.getAttribute("username") + ". You can <a href='#' class='signout'>sign out</a> at any moment");
       return "index";
   }*/
    @RequestMapping("/")
    public String index(HttpServletRequest request, HttpServletResponse response, ModelMap model){
        HttpSession session = request.getSession(false);
        model.addAttribute("welcomingMessage", session==null || session.getAttribute("username") == null?"<a href='#' class='signin'>Вход!</a>":
                "Добро пожаловать, "+session.getAttribute("username") + ". Вы можете <a href='#' class='signout'>Выйти!</a> at any moment");

    return "index";
    }

    @ResponseBody
    @RequestMapping(value = "/logout", method = RequestMethod.POST)
    public String logout(HttpServletRequest request, HttpServletResponse response, ModelMap model){
        request.getSession(false).invalidate();
        return "session_invalidated";
    }
}
