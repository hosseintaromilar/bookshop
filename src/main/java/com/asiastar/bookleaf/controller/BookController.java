package com.asiastar.bookleaf.controller;

import com.asiastar.bookleaf.dto.request.BookRequest;
import com.asiastar.bookleaf.dto.response.BookResponse;
import com.asiastar.bookleaf.service.book.BookService;
import jakarta.validation.Valid;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @PostMapping
    public ResponseEntity<BookResponse> save(@RequestBody  @Valid BookRequest book){
        return ResponseEntity.ok(bookService.save(book));
    }
    @GetMapping
    public ResponseEntity<Page<BookResponse>>getAll(Pageable pageable){
            return ResponseEntity.ok(bookService.findAll(pageable));
    }
}
