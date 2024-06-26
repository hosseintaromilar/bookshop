package com.asiastar.bookleaf.service.book;

import com.asiastar.bookleaf.dto.request.BookRequest;
import com.asiastar.bookleaf.dto.response.BookResponse;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;


public interface BookService {

    BookResponse save(BookRequest bookRequest);

    Page<BookResponse> findAll(Pageable pageable);

   List<BookResponse> findByName(String name);

    BookResponse findById(Long id);

    void deleted(Long id);

}
