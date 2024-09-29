package com.app.html.controller;
import org.springframework.ui.Model; 
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import jakarta.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("/")
public class HomeController {
    @GetMapping("/home")
    public String home(HttpServletRequest request, Model model) {
         // Get Request Information
         String method = request.getMethod();  // e.g., GET
         String requestURI = request.getRequestURI();  // e.g., /home
         String queryString = request.getQueryString();  // query string (if any)
 
         // Log or store the request info for use in the view or logs
         System.out.println("Method: " + method);
         System.out.println("Request URI: " + requestURI);
         System.out.println("Query String: " + queryString);
 
         // You can add request details to the model to display them in home.html (if needed)
         model.addAttribute("method", method);
         model.addAttribute("requestURI", requestURI);
         model.addAttribute("queryString", queryString);
        return "home";  // Create a home.html template in the templates folder
    }

    @GetMapping("/login")
    public String login() {
        return "login";  // This will render login.html
    }

    @GetMapping("/error")
    public String Error() {
        return "lohomegin";  // This will render login.html
    }

    @GetMapping("/request")
    public String request(HttpServletRequest request, Model model) {
        String method = request.getMethod();  // e.g., GET
         String requestURI = request.getRequestURI();  // e.g., /home
         String queryString = request.getQueryString();  // query string (if any)
 
         // Log or store the request info for use in the view or logs
         System.out.println("Method: " + method);
         System.out.println("Request URI: " + requestURI);
         System.out.println("Query String: " + queryString);
 
         // You can add request details to the model to display them in home.html (if needed)
         model.addAttribute("method", method);
         model.addAttribute("requestURI", requestURI);
         model.addAttribute("queryString", queryString);
        return "addprofile";
    }
}
