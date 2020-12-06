package com.offcn.controller;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;

@RestController
public class TestController {

    @GetMapping("/set")
    public String setSession(HttpSession session){
        session.setAttribute("msg","你好啊");
        return "OK";
    }


    @GetMapping("getSession")
    public String getSession(HttpSession session){
        String msg = (String) session.getAttribute("msg");
        return msg;
    }


}
