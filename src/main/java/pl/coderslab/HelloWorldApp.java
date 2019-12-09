package pl.coderslab;

import java.util.ArrayList;
import java.util.List;

public class HelloWorldApp{

    public static void main(String... args){
        List<String> listOfBooks = new ArrayList<>();
        listOfBooks.add("Programming Pearls");
        listOfBooks.add("Clean Code");
        listOfBooks.add("Effective Java");
        listOfBooks.add("Code Complete");

        // Using forEach loop to iterate and removing
        // element during iteration will throw
        // ConcurrentModificationException in Java
        for(String book: listOfBooks){
            if(book.contains("Code"));{
                listOfBooks.remove(book);
            }
        }
    }

}
