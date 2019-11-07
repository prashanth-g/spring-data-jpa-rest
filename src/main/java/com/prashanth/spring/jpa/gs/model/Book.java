package com.prashanth.spring.jpa.gs.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "book")
@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
public class Book implements Serializable {

    public Book() {
    }

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Long id;

    private String name;

    @OneToMany(mappedBy = "book")
    @JsonManagedReference
    private Set<BookCategory> bookCategory;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<BookCategory> getBookCategory() {
        return bookCategory;
    }

    public void setBookCategory(Set<BookCategory> bookCategory) {
        this.bookCategory = bookCategory;
    }
}
