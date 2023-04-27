package com.marchapr.LMSkunalsir.Controllers;


import com.marchapr.LMSkunalsir.DTO.BookRequestDTO;
import com.marchapr.LMSkunalsir.DTO.BookResponseDTO;
import com.marchapr.LMSkunalsir.Models.Book;
import com.marchapr.LMSkunalsir.Services.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookController {

    @Autowired
    BookService bookService;
    @PostMapping("/add")
    public BookResponseDTO addBooks(@RequestBody BookRequestDTO bookRequestDTO) throws Exception {

        return bookService.addBook(bookRequestDTO);
    }

}
