package classes.exercise6;

/**
 * Created by Dorota Marszałek on 2017-02-27.
 */

/*Stwórz klasę Book, która będzie zawierała informację o książce. Stwórz
        przykładowe książki (stworzenie książki w klasie Library).*/


public class Library {

    public static void main(String[] args) {
        Book book1 = new Book("Head First. Java", "Sierra Kathy", 2011);
        Book book2 = new Book("Title 2", "Author2", 2012);
        Book book3 = new Book("Title 3", "Author3", 2016);
        Book book4 = new Book("Title 4", "Author4", 2010);
        System.out.println(Book.getAllBooks());
    }
}
