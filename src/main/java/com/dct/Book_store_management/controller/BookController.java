package com.dct.Book_store_management.controller;

import com.dct.Book_store_management.entity.Books;
import com.dct.Book_store_management.entity.MyBookList;
import com.dct.Book_store_management.service.BookService;
import com.dct.Book_store_management.service.MyBookListService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class BookController {

    private final BookService bookService;
    private final MyBookListService myBookListService;

    public BookController(BookService bookService, MyBookListService myBookListService) {
        this.bookService = bookService;
        this.myBookListService = myBookListService;
    }

    @GetMapping("/")
    public String homePage() {
        return "index";
    }

    @GetMapping("/book_register")
    public String bookRegisterPage() {
        return "bookRegister";
    }

    @GetMapping("/available_books")
    public String getBookList(Model model) {
        List<Books> books = bookService.fetchAllBooks();
        model.addAttribute("books", books);
        return "BookList";
    }

    @PostMapping("/save")
    public String createBook(Books book) {
        bookService.createBook(book);
        return "redirect:/available_books";
    }

    @GetMapping("/my_books")
    public String myBookPage(Model model) {

        List<MyBookList> myBooks = myBookListService.fetchAllBooks();
        model.addAttribute("books", myBooks);
        return "myBook";
    }

    @GetMapping("/mylist/{id}")
    public String addToMyList(@PathVariable("id") int id) {
        Books book = bookService.fetchBookById(id);

        if (!myBookListService.existById(book.getId())) {
            MyBookList myBook = new MyBookList(book.getId(),
                    book.getName(),
                    book.getAuthor(),
                    book.getPrice()
            );
            myBookListService.saveMyBook(myBook);
        }
        return "redirect:/my_books";
    }

    @RequestMapping("/edit/{id}")
    public String editBook(@PathVariable("id") int id, Model model) {
        Books book = bookService.fetchBookById(id);
        model.addAttribute("book", book);
        return "bookEdit";
    }

    @RequestMapping("/delete/{id}")
    public String deleteBook(@PathVariable("id") int id, Model model) {
        bookService.deleteBookById(id);
        return "redirect:/available_books";
    }
}
