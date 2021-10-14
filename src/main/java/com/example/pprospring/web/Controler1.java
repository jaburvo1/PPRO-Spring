package com.example.pprospring.web;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@Controller
public class Controler1 {
    @GetMapping("/action1")
    public void action1(HttpServletRequest rerqvest, HttpServletResponse response) throws IOException {
        System.out.println(rerqvest.getHeader("User-agent"));
        response.getWriter().println("Hello world!");

    }
    @GetMapping("/action2")
    public String action2(Model model, HttpServletResponse response){
        response.setContentType("txt/html");
        model.addAttribute("key1", "Abc");
        Person p =new Person("Jan", "Novák");
        model.addAttribute("person", p);
        return "template1";
    }
}
