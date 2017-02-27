package classes.exercise6;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Dorota Marszałek on 2017-02-27.
 */
public class Book {
    private String title;
    private String author;
    private int yearOfPublication;
    private static List<Book> books = new ArrayList<Book>();

    public Book(String title, String author, int yearOfPublication) {
        this.title = title;
        this.author = author;
        this.yearOfPublication = yearOfPublication;
        Book.books.add(this);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYearOfPublication() {
        return yearOfPublication;
    }

    public void setYearOfPublication(int yearOfPublication) {
        this.yearOfPublication = yearOfPublication;
    }

    @Override
    public String toString() {
        return "Title = " + title + ", Author = " + author + ", Year of publication = " + yearOfPublication;
    }

    public static List<String> getAllBooks(){
        List<String> books = new ArrayList<String>();
        for (Book b:Book.books){
            books.add(b.toString());
        }
        return books;
    }


}
