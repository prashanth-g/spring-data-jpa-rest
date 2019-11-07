package com.prashanth.spring.jpa.gs.repository;

import com.prashanth.spring.jpa.gs.model.BookCategory;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookCategoryRepository extends JpaRepository<BookCategory, Long> {
}
