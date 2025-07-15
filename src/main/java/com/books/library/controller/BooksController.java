package com.books.library.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.books.library.books.BookService;
import com.books.library.model.Books;

@Controller
@RequestMapping("/books")
public class BooksController {

    private final BookService bookService;

    @Autowired
    public BooksController(BookService bookService){
        this.bookService = bookService;
    }

    @GetMapping
    public String listBooks(Model model) {
        model.addAttribute("books", bookService.getBooks());
        return "list"; // Will render src/main/resources/templates/list.html
    }

    @GetMapping("/new")
    public String newBooks(Model model) {
        model.addAttribute("books", new Books());
        return "new"; // Will render src/main/resources/templates/list.html
    }
    @PostMapping("/save")
    public String saveBooks(@ModelAttribute("books") Books book) {
        bookService.save(book);
        return "redirect:/books"; // After saving, redirect to the list page
    }

    @GetMapping("/edit/{id}")
    public String showEditForm(@PathVariable Long id, Model model) {
    Books book = bookService.findById(id); // you need to implement this
    model.addAttribute("books", book);
    return "edit"; // Renders edit.html
}

    @PostMapping("/delete/{id}")
    public String deleteBook(@PathVariable Long id) {
        bookService.delete(id);
        return "redirect:/books";
    }
}
