package com.kollai.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kollai.model.Book;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findByAuthorContainingIgnoreCase(String author);
}