package es.jmruirod.firstspring2.service;

import es.jmruirod.firstspring2.model.Book;
import java.util.List;

/**
 * La interfaz `BooksServiceInterface` define las operaciones que se pueden realizar en la
 * gestión de libros.
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
public interface BooksServiceInterface 
{
    /**
     * Obtiene todos los libros disponibles.
     *
     * @return Una lista de todos los libros.
     */
    public List<Book> getAllBooks();
    
    /**
     * Busca un libro por su número ISBN.
     *
     * @param isbn El número ISBN del libro a buscar.
     * @return El libro encontrado o null si no se encuentra.
     */
    public Book findBookById(int isbn);
    
    /**
     * Crea un nuevo libro.
     *
     * @param book El libro a crear.
     */
    public void createBook(Book book);
    
    /**
     * Actualiza la información de un libro existente.
     *
     * @param book El libro con la información actualizada.
     */
    public void updateBook(Book book);
    
    /**
     * Elimina un libro por su número ISBN.
     *
     * @param isbn El número ISBN del libro a eliminar.
     */
    public void deleteBook(int isbn);
}