package com.marchapr.LMSkunalsir.Models;

import com.marchapr.LMSkunalsir.Enums.TransactionStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.CreationTimestamp;

import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String transactionNumber;
    @CreationTimestamp
    private Date createdDate;

    @Enumerated(value = EnumType.STRING)
    private TransactionStatus transactionStatus;

    private boolean issuedOperation;
    // true means book is issued and false means it's returned


    // transaction is mapped 1:M from both card and Book so we map
    @ManyToOne
    @JoinColumn
    LibraryCard libraryCard;

    @ManyToOne
    @JoinColumn
    Book book;
}
