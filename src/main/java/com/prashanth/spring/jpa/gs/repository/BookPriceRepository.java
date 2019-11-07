package com.prashanth.spring.jpa.gs.repository;

import com.prashanth.spring.jpa.gs.model.BookPrice;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookPriceRepository extends JpaRepository<BookPrice, Long> {
}
