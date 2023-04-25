package com.marchapr.LMSkunalsir.Models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String name;
    private int age;
    private double rating;
    @Column(unique = true)
    private String email;

//    author to book is 1 to many and author is the parent

    @OneToMany(mappedBy = "author", cascade = CascadeType.ALL)
//    private Book book;  we can't use this object because there can be multiple books
    List<Book> bookList = new ArrayList<>();
}
