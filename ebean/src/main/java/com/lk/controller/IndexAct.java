package com.lk.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;

@Controller
public class IndexAct {
    @RequestMapping(value = {"/", "/index"}, method = RequestMethod.GET)
    public String index(HttpServletRequest request) {
        System.out.println(request.getLocalPort());
        return "index";
    }
}
