package com.wecancodeit.library.Models;

import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;

@Entity
public class Author {

    @Id
    @GeneratedValue
    private long id;

    private String firstName;
    private String lastName;

    @ManyToMany(mappedBy = "authors")
    private Collection<Book> books;

    protected Author() {
    }

    public Author(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Collection<Book> getBooks(){
        return books;
    }
    public long getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }



}
