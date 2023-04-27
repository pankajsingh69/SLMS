package com.marchapr.LMSkunalsir.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.marchapr.LMSkunalsir.Enums.Genre;
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
public class Book {
//    id title price genre
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String title;
    private int price;

    private Genre genre;

    private boolean isIssued;
//    we know that book to author is many to one relationship
// book is the child class
    @ManyToOne
    @JoinColumn
    @JsonIgnore
    private Author author;


    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private List<Transaction> transactions = new ArrayList<>();

    //mapping between Library and Book is 1:M
    // book is the child class
    @ManyToOne
    @JoinColumn
    LibraryCard libraryCard;

}

