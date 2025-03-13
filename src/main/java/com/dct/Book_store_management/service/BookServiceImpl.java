package com.dct.Book_store_management.service;

import com.dct.Book_store_management.entity.Books;
import com.dct.Book_store_management.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService{

    private final BookRepository bookRepo;

    public BookServiceImpl(BookRepository bookRepo) {
        this.bookRepo = bookRepo;
    }

    @Override
    public List<Books> fetchAllBooks() {
        return bookRepo.findAll();
    }

    @Override
    public Books createBook(Books book) {
        return bookRepo.save(book);
    }

    @Override
    public Books fetchBookById(int bookId) {
        return bookRepo.findById(bookId).get();
    }

    @Override
    public boolean deleteBookById(int bookId) {
         if (bookRepo.existsById(bookId)) {
             bookRepo.deleteById(bookId);
             return true;
         } else {
             return false;
         }
    }

}
