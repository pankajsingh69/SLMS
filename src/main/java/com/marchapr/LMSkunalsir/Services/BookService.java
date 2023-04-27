package com.marchapr.LMSkunalsir.Services;

import com.marchapr.LMSkunalsir.DTO.BookRequestDTO;
import com.marchapr.LMSkunalsir.DTO.BookResponseDTO;
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
    public BookResponseDTO addBook(BookRequestDTO bookRequestDTO) throws Exception {
        Author author = authorRepository.findById(bookRequestDTO.getAuthorId()).get();

        Book book = new Book();
        book.setTitle(bookRequestDTO.getTitle());
        book.setGenre(bookRequestDTO.getGenre());
        book.setPrice(bookRequestDTO.getPrice());
        book.setIssued(false);
        book.setAuthor(author);

        author.getBookList().add(book);
        authorRepository.save(author);

        //set the response for the call like
        BookResponseDTO bookResponseDTO = new BookResponseDTO();
        bookResponseDTO.setPrice(book.getPrice());
        bookResponseDTO.setTitle(book.getTitle());

        return bookResponseDTO;
    }
}
