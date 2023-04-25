package com.marchapr.LMSkunalsir.Controllers;

import com.marchapr.LMSkunalsir.Models.Author;
import com.marchapr.LMSkunalsir.Services.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/author")
public class AuthorController {
    @Autowired
    AuthorService authorService;
    @PostMapping("/add")
    public String addAuthor(@RequestBody Author author){

        authorService.addAuthor(author);
        return "Author added successfully";
    }

//    to fetch the list of all authors

    @GetMapping("/getAuthors")
    public List<Author> getAuthors(){
        return authorService.getAuthors();
    }
}
