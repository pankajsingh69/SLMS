package com.marchapr.LMSkunalsir.Models;

import com.marchapr.LMSkunalsir.Enums.CardStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class LibraryCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

//    private String vaildTill;

    @Enumerated(value = EnumType.STRING)
    private CardStatus cardStatus;

    @CreationTimestamp
    private Date createdDate;

    @UpdateTimestamp
    private Date updatedDate;

    @OneToOne
    @JoinColumn
    Student student;

    @OneToMany(mappedBy = "libraryCard", cascade = CascadeType.ALL)
    private List<Transaction> transactions = new ArrayList<>();


    // library is the parent of book
    @OneToMany(mappedBy = "libraryCard", cascade = CascadeType.ALL)
    List<Book> books = new ArrayList<>();
}
