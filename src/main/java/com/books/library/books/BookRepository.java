package com.books.library.books;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.books.library.model.Books;

@Repository
public interface  BookRepository extends JpaRepository<Books, Long>{
    
}
