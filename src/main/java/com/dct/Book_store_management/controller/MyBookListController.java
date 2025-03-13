package com.dct.Book_store_management.controller;

import com.dct.Book_store_management.service.MyBookListService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MyBookListController {

    private final MyBookListService myBookListService;

    public MyBookListController(MyBookListService myBookListService) {
        this.myBookListService = myBookListService;
    }

    @RequestMapping("/deleteMyList/{id}")
    public String deleteById(@PathVariable int id) {
        myBookListService.deleteById(id);
        return "redirect:/my_books";
    }
}
