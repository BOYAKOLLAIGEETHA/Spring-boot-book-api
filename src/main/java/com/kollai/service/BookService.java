package com.kollai.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.kollai.model.Book;
import com.kollai.repository.BookRepository;

import java.util.List;
import java.util.Optional;

@Service
public class BookService {

    @Autowired
    private BookRepository repo;

    public Book saveBook(Book book) {
        return repo.save(book);
    }

    public List<Book> getAllBooks() {
        return repo.findAll();
    }

    public Optional<Book> getBookById(Long id) {
        return repo.findById(id);
    }

    public Book updateBook(Long id, Book book) {
        Book existing = repo.findById(id).orElseThrow(() -> new RuntimeException("Book not found"));
        existing.setTitle(book.getTitle());
        existing.setAuthor(book.getAuthor());
        existing.setPrice(book.getPrice());
        return repo.save(existing);
    }

    public void deleteBook(Long id) {
        repo.deleteById(id);
    }

    public List<Book> searchByAuthor(String author) {
        return repo.findByAuthorContainingIgnoreCase(author);
    }
}
