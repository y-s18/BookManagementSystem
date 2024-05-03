package com.bookmanagsys.backendbms.controller;

import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bookmanagsys.backendbms.model.Book;
import com.bookmanagsys.backendbms.service.BookService;

import lombok.AllArgsConstructor;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping(path = "api/v1/books")
@AllArgsConstructor
public class BookController {

    private final BookService bookService;

    @GetMapping()
    public List<Book> getBooks() {
        return this.bookService.getBooks();
    }

    @GetMapping("/{bookId}")
    public Book getBook(@PathVariable("bookId") Long id) {
        return this.bookService.getBook(id);
    }

    @PostMapping
    public void addBook(@RequestBody Book bookDetails) {
        this.bookService.addBook(bookDetails);
    }

    @PutMapping("/{bookId}")
    public void updateBook(@PathVariable("bookId") Long id, @RequestBody Book bookDetatils) {
        this.bookService.updateBook(id, bookDetatils);
    }

    @DeleteMapping("/{bookId}")
    public void deleteBook(@PathVariable("bookId") Long id) {
        this.bookService.deleteBook(id);
    }
}
