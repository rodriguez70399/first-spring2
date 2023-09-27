package es.jmruirod.firstspring2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import es.jmruirod.firstspring2.model.Book;
import es.jmruirod.firstspring2.service.BooksServiceInterface;

@RestController
public class BooksController 
{
    @Autowired
    private BooksServiceInterface service;

    @GetMapping(value="books", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Book> getAllBooks()
    {
        return this.service.getAllBooks();
    }

    @GetMapping(value="book/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Book findBookById(@PathVariable int isbn)
    {
        return this.service.findBookById(isbn);
    }

    @PostMapping(value = "book", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createBook(@RequestBody Book book)
    {
        this.service.createBook(book);
    }

    @PutMapping(value = "book", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateBook(@RequestBody Book book)
    {
        this.service.updateBook(book);
    }

    @DeleteMapping(value = "book/{isbn}")
    public void deleteBook(@PathVariable int isbn)
    {
        this.service.deleteBook(isbn);
    }
}
