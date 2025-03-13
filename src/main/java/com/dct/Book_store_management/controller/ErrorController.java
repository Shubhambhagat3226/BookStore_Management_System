package com.dct.Book_store_management.controller;

import jakarta.servlet.http.HttpServletRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ErrorController implements org.springframework.boot.web.servlet.error.ErrorController {
    @RequestMapping("/error")
    public String handleError(Model model, HttpServletRequest request) {
        Integer statusCode = (Integer) request.getAttribute("javax.servlet.error.status_code");
        String errorMessage = (String) request.getAttribute("javax.servlet.error.message");
        String requestUri = (String) request.getAttribute("javax.servlet.error.request_uri");

        model.addAttribute("status", statusCode != null ? statusCode : "Unknown");
        model.addAttribute("errorMessage", errorMessage != null ? errorMessage : "Unknown error");
        model.addAttribute("path", requestUri != null ? requestUri : "Unknown path");
        return "error";
    }
}