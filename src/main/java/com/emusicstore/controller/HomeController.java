package com.emusicstore.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by hanghua on 4/19/17.
 */
@Controller
public class HomeController {

    @RequestMapping("/")
    public String home(){
        return "home";
    }
}
