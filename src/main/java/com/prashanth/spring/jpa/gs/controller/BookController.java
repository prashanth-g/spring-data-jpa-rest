package com.prashanth.spring.jpa.gs.controller;

import com.prashanth.spring.jpa.gs.model.*;
import com.prashanth.spring.jpa.gs.repository.BookPriceRepository;
import com.prashanth.spring.jpa.gs.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    BookPriceRepository bookPriceRepository;

    // Get Parent data and child from parent to child
    @GetMapping(value = "/books", produces = "application/json")
    public List<Book> getBook() {
        List<Book> all = bookRepository.findAll();
        return all;
    }

    // Get Child data and Parent from child to parent
    @GetMapping(value = "/prices", produces = "application/json")
    public PriceCategoryDto getBookPrices() {
        List<BookPrice> all = bookPriceRepository.findAll();

        PriceCategoryDto priceCategoryDto = new PriceCategoryDto();
        priceCategoryDto.setPrice(all.get(0).getPrice());
        BookCategory bookCategory = all.get(0).getBookCategory();
        priceCategoryDto.setCategoryName(bookCategory.getName());

        return priceCategoryDto;
    }

}
