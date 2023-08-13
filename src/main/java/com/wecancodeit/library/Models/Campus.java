package com.wecancodeit.library.Models;

import java.util.Collection;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Campus {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;

    private String location;

    @OneToMany(mappedBy = "campus")
    private Collection<Book> books;

    protected Campus() {
    }

    public Campus(String location) {
        this.location = location;
    }

    public long getId() {
        return id;
    }

    public String getLocation() {
        return location;
    }

    public Collection<Book> getBooks() {
        return books;
    }

}
