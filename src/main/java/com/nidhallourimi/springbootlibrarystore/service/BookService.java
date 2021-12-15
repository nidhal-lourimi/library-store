package com.nidhallourimi.springbootlibrarystore.service;


import com.nidhallourimi.springbootlibrarystore.model.Book;
import com.nidhallourimi.springbootlibrarystore.repository.BookRepository;
import org.jetbrains.annotations.NotNull;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public record BookService(BookRepository bookRepository) {

    public Book saveBook(@NotNull Book book) {
        book.setCreateTime(LocalDateTime.now());
        return bookRepository.save(book);
    }
    public void deleteBook(Long id){
        bookRepository.deleteById(id);

    }

    public List<Book> findAllBooks(){
        return  bookRepository.findAll();
    }
}
