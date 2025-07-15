package com.books.library.books;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.books.library.model.Books;

@Service
public class BookService {

    private final BookRepository bookRepository;

    @Autowired
    public BookService(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public List<Books> getBooks(){
        return bookRepository.findAll();
    }

    public void save(Books book) {
        bookRepository.save(book);
    }

    public void delete(Long id) {
        bookRepository.deleteById(id);
    }

    public void edit(Long id, Books updatedBook) {
        Books existingBook = bookRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Invalid book ID: " + id));

        existingBook.setTitle(updatedBook.getTitle());
        existingBook.setAuthor(updatedBook.getAuthor());
        existingBook.setPublished(updatedBook.getPublished());

        bookRepository.save(existingBook);
    }

    // ✅ Find a single book by ID
    public Books findById(Long id) {
        return bookRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException("Book not found with ID: " + id));
    }
}
