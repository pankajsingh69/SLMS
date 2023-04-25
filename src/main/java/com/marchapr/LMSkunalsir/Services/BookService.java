package com.marchapr.LMSkunalsir.Services;

import com.marchapr.LMSkunalsir.Models.Author;
import com.marchapr.LMSkunalsir.Models.Book;
import com.marchapr.LMSkunalsir.Repositories.AuthorRepository;
import com.marchapr.LMSkunalsir.Repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    AuthorRepository authorRepository;
    public void addBook(Book book) throws Exception {
        Author author;
        try{
            author = authorRepository.findById(book.getAuthor().getId()).get();
        }catch (Exception e){
            throw new Exception("Author not present");
        }
//        how will we add this book to the list

        List<Book> booksWritten = author.getBookList();
        booksWritten.add(book);

        authorRepository.save(author);
    }
}
