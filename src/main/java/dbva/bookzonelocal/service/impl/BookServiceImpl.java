package dbva.bookzonelocal.service.impl;

import dbva.bookzonelocal.model.Book;
import dbva.bookzonelocal.repository.BookRepository;
import dbva.bookzonelocal.service.BookService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> listAll() {
        return this.bookRepository.findAll();
    }
}
