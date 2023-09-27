package es.jmruirod.firstspring2.model;

public class Book 
{
    private int isbn;
    private String title;
    private String genre;
    
    public Book() 
    {

    }

    public Book(int isbn, String title, String genre) 
    {
        this.isbn = isbn;
        this.title = title;
        this.genre = genre;
    }

    public int getIsbn() 
    {
        return isbn;
    }

    public void setIsbn(int isbn) 
    {
        this.isbn = isbn;
    }

    public String getTitle() 
    {
        return title;
    }

    public void setTitle(String title) 
    {
        this.title = title;
    }

    public String getGenre() 
    {
        return genre;
    }

    public void setGenre(String genre) 
    {
        this.genre = genre;
    }
}
