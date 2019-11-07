package com.prashanth.spring.jpa.gs.repository;

import com.prashanth.spring.jpa.gs.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
