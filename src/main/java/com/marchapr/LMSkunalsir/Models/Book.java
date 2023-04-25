package com.marchapr.LMSkunalsir.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.marchapr.LMSkunalsir.Enums.Genre;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
    @Enumerated(value = EnumType.STRING)
    private Genre genre;

//    we know that book to author is many to one relationship
// book is the child class
    @ManyToOne
    @JoinColumn
    @JsonIgnore
    private Author author;

}

