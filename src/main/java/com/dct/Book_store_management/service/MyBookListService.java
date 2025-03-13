package com.dct.Book_store_management.service;

import com.dct.Book_store_management.entity.MyBookList;
import com.dct.Book_store_management.repository.MyBookListRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MyBookListService {

    private final MyBookListRepository myBookListRepo;

    public MyBookListService(MyBookListRepository myBookListRepo) {
        this.myBookListRepo = myBookListRepo;
    }

    public MyBookList saveMyBook(MyBookList book) {
        return myBookListRepo.save(book);
    }

    public List<MyBookList> fetchAllBooks() {
        return myBookListRepo.findAll();
    }

    public boolean existById(int id) {
        return myBookListRepo.existsById(id);
    }

    public boolean deleteById(int id) {
        if (myBookListRepo.existsById(id)) {
            myBookListRepo.deleteById(id);
            return true;
        } else {
            return false;
        }
    }
}
