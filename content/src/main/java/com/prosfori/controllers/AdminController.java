package com.prosfori.controllers;

import com.google.gson.Gson;
import com.prosfori.dao.DatabaseWrapper;
import com.prosfori.dao.Prosfori;
import com.prosfori.dao.Store;
import com.prosfori.utilities.GsonWrapper;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@Controller
public class AdminController {

    @RequestMapping(value = "/admin", method = RequestMethod.GET)
    public String getAdminPage(HttpServletRequest request, HttpServletResponse response, ModelMap model){
        return "admin";
    }

    @ResponseBody
    @RequestMapping(value="/admin/add/prosfora", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    public String addProsfora(HttpServletRequest request, HttpServletResponse response){
        GsonWrapper gson = GsonWrapper.getInstance();
        DatabaseWrapper db = DatabaseWrapper.getInstance();

        //TODO add exception handling here
        System.out.println(request.getParameter("data"));
        db.addProsfora((Prosfori) gson.fromJson(request.getParameter("data"), Prosfori.class));

        return "ok";
    }

    @ResponseBody
    @RequestMapping(value="/admin/add/store", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    public String addStoreEntry(HttpServletRequest request, HttpServletResponse response){
        GsonWrapper gsonWrapper = GsonWrapper.getInstance();
        DatabaseWrapper db = DatabaseWrapper.getInstance();

        db.addStore((Store) gsonWrapper.fromJson(request.getParameter("data"), Store.class));
        return "ok";
    }

    @ResponseBody
    @RequestMapping(value = "/get/prosfori", method = RequestMethod.POST,produces = "application/json; charset=utf-8")
    public String getProsfori(HttpServletRequest request, HttpServletResponse response, ModelMap model){
        GsonWrapper gson = GsonWrapper.getInstance();
        DatabaseWrapper db = DatabaseWrapper.getInstance();

        return gson.toJson(db.getProsforas());
    }

    @ResponseBody
    @RequestMapping(value = "/admin/store", method = RequestMethod.POST, produces = "application/json; charset=utf-8")
    public String getStore(HttpServletRequest request, HttpServletResponse response){
        GsonWrapper gson = GsonWrapper.getInstance();
        DatabaseWrapper db = DatabaseWrapper.getInstance();

        return gson.toJson(db.getStore());
    }

}
