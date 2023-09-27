package es.jmruirod.firstspring2.model;

/**
 * La clase `Book` representa un libro con su número ISBN, título y género.
 * 
 * @author Jose Manuel Ruiz Rodriguez
 */
public class Book 
{
    private int isbn;
    private String title;
    private String genre;
    
    /**
     * Crea una instancia de la clase `Book` con valores predeterminados.
     */
    public Book() 
    {

    }

    /**
     * Crea una instancia de la clase `Book` con los valores especificados.
     *
     * @param isbn  El número ISBN del libro.
     * @param title El título del libro.
     * @param genre El género del libro.
     */
    public Book(int isbn, String title, String genre) 
    {
        this.isbn = isbn;
        this.title = title;
        this.genre = genre;
    }

    /**
     * Obtiene el número ISBN del libro.
     *
     * @return El número ISBN del libro.
     */
    public int getIsbn() 
    {
        return isbn;
    }

    /**
     * Establece el número ISBN del libro.
     *
     * @param isbn El nuevo número ISBN del libro.
     */
    public void setIsbn(int isbn) 
    {
        this.isbn = isbn;
    }

    /**
     * Obtiene el título del libro.
     *
     * @return El título del libro.
     */
    public String getTitle() 
    {
        return title;
    }

    /**
     * Establece el título del libro.
     *
     * @param title El nuevo título del libro.
     */
    public void setTitle(String title) 
    {
        this.title = title;
    }

    /**
     * Obtiene el género del libro.
     *
     * @return El género del libro.
     */
    public String getGenre() 
    {
        return genre;
    }

    /**
     * Establece el género del libro.
     *
     * @param genre El nuevo género del libro.
     */
    public void setGenre(String genre) 
    {
        this.genre = genre;
    }
}