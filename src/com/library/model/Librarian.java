package com.library.model;

public class Librarian extends Person{

    private String password;

    public Librarian(String name, String password) {
        super(name);
        this.password = password;
    }

    @Override
    public void whoAreYou() {
        System.out.println("I am a librarian. My name is " + name);
    }

    public void searchBook(){}

    public void verifyMember(){}

    public void issueBook(){}

    public void calculateFine(){}

    public void returnBook(){}

}
