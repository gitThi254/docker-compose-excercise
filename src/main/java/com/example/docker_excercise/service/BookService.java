package com.example.docker_excercise.service;


import com.example.docker_excercise.model.Book;
import com.example.docker_excercise.repository.BookRep;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class BookService {
    private final BookRep bookRep;
    public void Save(Book book) {
        bookRep.save(book);
    }
    public List<Book> findAll() {
        return bookRep.findAll();
    }
    public Book findById(Long id) {
        return bookRep.findById(id).get();
    }
    public void delete(Long id) {
        bookRep.deleteById(id);
    }
}
