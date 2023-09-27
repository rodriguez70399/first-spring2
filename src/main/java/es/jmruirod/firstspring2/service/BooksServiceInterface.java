package es.jmruirod.firstspring2.service;

import java.util.List;

import es.jmruirod.firstspring2.model.Book;

public interface BooksServiceInterface 
{
    public List<Book> getAllBooks();
    public Book findBookById(int isbn);
    public void createBook(Book book);
    public void updateBook(Book book);
    public void deleteBook(int isbn);
}
