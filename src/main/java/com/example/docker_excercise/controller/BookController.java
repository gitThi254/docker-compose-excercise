package com.example.docker_excercise.controller;


import com.example.docker_excercise.model.Book;
import com.example.docker_excercise.service.BookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/book")
@RequiredArgsConstructor
public class BookController {
    private final BookService bookService;
    @PostMapping
    public String save(Book book) {
        bookService.Save(book);
        return "Create Book success 1";
    }
    @GetMapping
    public List<Book> findAll() {
        return bookService.findAll();
    }
    @GetMapping("/{id}")
    public Book findById(@PathVariable("id") Long id) {
        return bookService.findById(id);
    }
    @DeleteMapping("/{id}")
    public String deleteById(@PathVariable("id")  Long id) {
        bookService.delete(id);
        return "Delete Book success 1";
    }
}
