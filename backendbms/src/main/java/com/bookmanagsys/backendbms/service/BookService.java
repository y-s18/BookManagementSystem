package com.bookmanagsys.backendbms.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bookmanagsys.backendbms.exception.ResourceNotFoundException;
import com.bookmanagsys.backendbms.model.Book;
import com.bookmanagsys.backendbms.repository.BookRepository;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class BookService {

    private final BookRepository bookRepository;

    public List<Book> getBooks() {
        return this.bookRepository.findAll();
    }

    public Book getBook(Long id) {
        return this.bookRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book with id: " + id + " does not exist"));
    }

    public void addBook(Book book) {
        Book newBook = new Book(book.getId(), book.getName(),
                book.getAuthor(), book.getPublisher(), book.getIsbn());
        this.bookRepository.save(newBook);
    }

    public void updateBook(Long id, Book bookDetails) {
        Book updatedBook = this.bookRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Book with id: " + id + " does not exist"));
        updatedBook.setName(bookDetails.getName());
        updatedBook.setAuthor(bookDetails.getAuthor());
        updatedBook.setPublisher(bookDetails.getPublisher());
        updatedBook.setIsbn(bookDetails.getIsbn());

        this.bookRepository.save(updatedBook);
    }

    public void deleteBook(Long id){
        this.bookRepository.findById(id).orElseThrow(()->new ResourceNotFoundException("Book with id: " + id + " does not exist"));
        this.bookRepository.deleteById(id);
    }
}
