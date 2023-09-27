package es.jmruirod.firstspring2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import es.jmruirod.firstspring2.model.Book;

@Service
public class BooksServiceInterfaceImplemented implements BooksServiceInterface
{
    private List<Book> bookList;
    
    public BooksServiceInterfaceImplemented() 
    {
        this.bookList = new ArrayList<>();
        this.bookList.add(new Book(111, "Java 17", "Programacion"));
        this.bookList.add(new Book(222, "One Piece", "Manga"));
        this.bookList.add(new Book(333, "Biblia", "Religion"));
        this.bookList.add(new Book(444, "Comida real", "Alimentacion"));
        this.bookList.add(new Book(555, "Harry Potter", "Fantasia"));
    }

    @Override
    public List<Book> getAllBooks() 
    {
        return this.bookList;
    }

    @Override
    public Book findBookById(int isbn) 
    {
        Book searchedBook = null;

        for (Book book : bookList) 
        {
            if(book.getIsbn() == isbn)
            {
                searchedBook = book;
            }
        }

        return searchedBook;
    }

    @Override
    public void createBook(Book book) 
    {
        this.bookList.add(book);
    }

    @Override
    public void updateBook(Book book) 
    {
        int index = this.bookList.indexOf(findBookById(book.getIsbn()));
        this.bookList.remove(index);
        this.bookList.add(index, book);        
    }

    @Override
    public void deleteBook(int isbn) 
    {
        this.bookList.remove(this.bookList.indexOf(findBookById(isbn)));
    }
}
