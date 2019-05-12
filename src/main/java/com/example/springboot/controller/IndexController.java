package com.example.springboot.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by:刘祥
 * 2019/5/11 2:04
 */
@Controller
public class IndexController {
    @GetMapping("/hello")
    public String index(){
        System.out.println("hello");
        return "index";
    }
}
