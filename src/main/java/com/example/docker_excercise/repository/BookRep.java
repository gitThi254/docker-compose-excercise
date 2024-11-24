package com.example.docker_excercise.repository;

import com.example.docker_excercise.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRep extends JpaRepository<Book, Long> {
}
