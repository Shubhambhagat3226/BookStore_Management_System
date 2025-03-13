package com.dct.Book_store_management.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "my_books")
public class MyBookList {

    @Id
    @Column(name = "book_id")
    private int id;
    private String name;
    private String author;
    private double price;
}
