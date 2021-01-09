package com.library.book.books;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Book {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String author;
    private String description;
    private String price;
    private String imgPath;

    public Book(String name, String author, String description, String price, String imgPath) {
        this.name = name;
        this.author = author;
        this.description = description;
        this.price = price;
        this.imgPath = imgPath;
    }
}
