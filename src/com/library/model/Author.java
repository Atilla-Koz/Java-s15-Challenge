package com.library.model;

import javax.xml.namespace.QName;
import java.util.List;

public class Author extends Person {

    private List<Book> books;

    public Author(String name, List<Book> books) {
        super(name);
        this.books = books;
    }

    @Override
    public void whoAreYou() {
        System.out.println("I am an author. My name is" + name);
    }


    public void newBook(Book book) {
        books.add(book);
    }

    public void showBooks(){

        for (Book book : books) {
            book.display();
        }
    }
}


