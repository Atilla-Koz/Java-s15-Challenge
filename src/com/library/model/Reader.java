package com.library.model;

import java.util.ArrayList;
import java.util.List;

public class Reader extends Person{

    private List<Book> books;


    public Reader(String name) {
        super(name);
        this.books = new ArrayList<>();
    }

    @Override
    public void whoAreYou() {
        System.out.println("I am a reader. My name is " + name);
    }

    public void purchaseBook(Book book) {
        books.add(book);
    }

    public void borrowBook(Book book) {
        if(book.getStatus().equals("Avaible")){
            books.add(book);
            book.updateStatus("Borrowed");
        }else{
            System.out.println("Book is not available");
        }
    }

    public void returnBook(Book book){
        books.remove(book);
        book.updateStatus("Avaible");
    }

    public void showBooks(){
        for (Book book : books) {
            book.display();
        }
    }
}
