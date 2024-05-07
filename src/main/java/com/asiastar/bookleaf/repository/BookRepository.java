package com.asiastar.bookleaf.repository;

import com.asiastar.bookleaf.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface BookRepository extends JpaRepository<Book,Long> {

    Optional<Book> findByName(String name);
}
