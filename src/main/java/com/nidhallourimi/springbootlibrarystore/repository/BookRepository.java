package com.nidhallourimi.springbootlibrarystore.repository;

import com.nidhallourimi.springbootlibrarystore.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Long> {
}
