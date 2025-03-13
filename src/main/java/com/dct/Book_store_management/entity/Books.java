package com.dct.Book_store_management.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Books {

    @Id
    @SequenceGenerator(
            name = "books_seq",
            sequenceName = "books_seq",
            allocationSize = 1
    )
    @GeneratedValue(
            strategy = GenerationType.SEQUENCE,
            generator = "books_seq"
    )
    private int id;
    private String name;
    private String author;
    private double price;
}
