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

/**
 * La clase `BooksController` es un controlador REST que gestiona las operaciones relacionadas con los libros.
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
@RestController
public class BooksController 
{
    /**
     * El servicio que proporciona la funcionalidad relacionada con los libros.
     */
    @Autowired
    private BooksServiceInterface service;

    /**
     * Obtiene una lista de todos los libros disponibles.
     * 
     * @return Una lista de todos los libros en formato JSON.
     * 
     * @apiNote GET localhost:8080/books
     */
    @GetMapping(value="books", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<Book> getAllBooks()
    {
        return this.service.getAllBooks();
    }

    /**
     * Busca un libro por su número ISBN.
     *
     * @param isbn El número ISBN del libro a buscar.
     * @return El libro encontrado en formato JSON o null si no se encuentra.
     * 
     * @apiNote GET localhost:8080/book/1
     */
    @GetMapping(value="book/{isbn}", produces = MediaType.APPLICATION_JSON_VALUE)
    public Book findBookById(@PathVariable int isbn)
    {
        return this.service.findBookById(isbn);
    }

    /**
     * Crea un nuevo libro.
     *
     * @param book El libro a crear en formato JSON.
     * 
     * @apiNote POST localhost:8080/book
     */
    @PostMapping(value = "book", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void createBook(@RequestBody Book book)
    {
        this.service.createBook(book);
    }

    /**
     * Actualiza la información de un libro existente.
     *
     * @param book El libro con la información actualizada en formato JSON.
     * 
     * @apiNote PUT localhost:8080/book
     */
    @PutMapping(value = "book", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updateBook(@RequestBody Book book)
    {
        this.service.updateBook(book);
    }

    /**
     * Elimina un libro por su número ISBN.
     *
     * @param isbn El número ISBN del libro a eliminar.
     * 
     * @apiNote DELETE localhost:8080/book/1
     */
    @DeleteMapping(value = "book/{isbn}")
    public void deleteBook(@PathVariable int isbn)
    {
        this.service.deleteBook(isbn);
    }
}