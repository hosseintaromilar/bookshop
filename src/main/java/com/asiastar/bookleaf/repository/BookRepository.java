package com.asiastar.bookleaf.repository;

import com.asiastar.bookleaf.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Long> {
}
