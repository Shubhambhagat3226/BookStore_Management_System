package com.dct.Book_store_management.service;

import com.dct.Book_store_management.entity.Books;

import java.util.List;

public interface BookService {

    List<Books> fetchAllBooks();
    Books createBook(Books book);
    Books fetchBookById(int bookId);
    boolean deleteBookById(int bookId);
}
