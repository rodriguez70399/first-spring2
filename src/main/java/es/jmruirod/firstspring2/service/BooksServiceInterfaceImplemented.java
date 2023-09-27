package es.jmruirod.firstspring2.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import es.jmruirod.firstspring2.model.Book;

/**
 * La clase `BooksServiceInterfaceImplemented` implementa la interfaz `BooksServiceInterface` 
 * y proporciona servicios relacionados con la gestión de libros.
 */
@Service
public class BooksServiceInterfaceImplemented implements BooksServiceInterface
{
    /**
     * La lista de libros gestionada por este servicio.
     */
    private List<Book> bookList;
    
    /**
     * Crea una instancia de `BooksServiceInterfaceImplemented` e inicializa la lista de libros con algunos libros de ejemplo.
     */
    public BooksServiceInterfaceImplemented() 
    {
        this.bookList = new ArrayList<>();
        this.bookList.add(new Book(111, "Java 17", "Programación"));
        this.bookList.add(new Book(222, "One Piece", "Manga"));
        this.bookList.add(new Book(333, "Biblia", "Religión"));
        this.bookList.add(new Book(444, "Comida real", "Alimentación"));
        this.bookList.add(new Book(555, "Harry Potter", "Fantasía"));
    }

    /**
     * Obtiene una lista de todos los libros disponibles.
     *
     * @return Una lista de todos los libros.
     */
    @Override
    public List<Book> getAllBooks() 
    {
        return this.bookList;
    }

    /**
     * Busca un libro por su número ISBN.
     *
     * @param isbn El número ISBN del libro a buscar.
     * @return El libro encontrado o null si no se encuentra.
     */
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

    /**
     * Crea un nuevo libro.
     *
     * @param book El libro a crear.
     */
    @Override
    public void createBook(Book book) 
    {
        this.bookList.add(book);
    }

    /**
     * Actualiza la información de un libro existente.
     *
     * @param book El libro con la información actualizada.
     */
    @Override
    public void updateBook(Book book) 
    {
        int index = this.bookList.indexOf(findBookById(book.getIsbn()));
        this.bookList.remove(index);
        this.bookList.add(index, book);        
    }

    /**
     * Elimina un libro por su número ISBN.
     *
     * @param isbn El número ISBN del libro a eliminar.
     */
    @Override
    public void deleteBook(int isbn) 
    {
        this.bookList.remove(this.bookList.indexOf(findBookById(isbn)));
    }
}