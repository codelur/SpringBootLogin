package com.app.html.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/profile")
public class ProfileController {
    @GetMapping("/add")
    public String addProfile(HttpServletRequest request, Model model) {
        model.addAttribute("username", "User Sal");
        return "addprofile";
    }

    @GetMapping("/save")
    public String saveProfile(HttpServletRequest request, Model model) {
        String method = request.getMethod();  // e.g., GET
         String requestURI = request.getRequestURI();  // e.g., /home
         String queryString = request.getQueryString();
        return "addprofile";
    }
    
}
