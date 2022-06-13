package com.tomorrow.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author YinQiming
 * @create 2022-06-12 18:48
 */
@Controller
public class RedirectController {

    @GetMapping("/addUser")
    public String addUser(){
        return "addUser";
    }
}
