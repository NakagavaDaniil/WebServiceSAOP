package com.epam.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller("/*")
public class SoapCallController {

    @RequestMapping(value = "/*")
    public String getPage(Model model){
        model.addAttribute("message", "message from controller");
        return "soap";
    }
}
