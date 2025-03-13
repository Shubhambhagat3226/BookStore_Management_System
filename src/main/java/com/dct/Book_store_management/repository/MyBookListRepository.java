package com.dct.Book_store_management.repository;

import com.dct.Book_store_management.entity.MyBookList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyBookListRepository extends JpaRepository<MyBookList, Integer> {
}
