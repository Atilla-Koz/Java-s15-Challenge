package com.library.model;

import java.util.Date;

public class Book {

    private int bookID;
    private Author author;
    private String name;
    private String edition;
    private String status;
    private Date dateOfPurchase;
    private Reader owner;



    public Book(int bookID, Author author, String name, String edition, String status, Date dateOfPurchase, Reader owner) {
        this.bookID = bookID;
        this.author = author;
        this.name = name;
        this.edition = edition;
        this.status = status;
        this.dateOfPurchase = dateOfPurchase;
        this.owner = owner;
    }

    public String getTittle(){
        return name;
    }

    public Author getAuthor(){
        return author;
    }

    public void changeOwner(Reader newOwner){
        this.owner = newOwner;
    }

    public Reader getOwner(){
        return owner;
    }

    public void display(){
        System.out.println("Book ID: " + bookID + ", Title: " + name + ", Author: " + author.name);
    }

    public void updateStatus(String status){
        this.status = status;
    }

    public String getStatus(){
        return status;
    }
}
