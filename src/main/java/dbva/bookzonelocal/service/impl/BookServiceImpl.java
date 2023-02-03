package dbva.bookzonelocal.service.impl;

import dbva.bookzonelocal.model.Book;
import dbva.bookzonelocal.model.exceptions.InvalidBookIdException;
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

    @Override
    public Book findById(String id) {
        Book book = this.bookRepository.findById(id).orElseThrow(InvalidBookIdException::new);
        return book;
    }

    @Override
    public Book saveBook(String isbn, String title, Integer rating, Boolean forSale, Integer price) {
        Book book = new Book(isbn,title,rating,forSale,price);
        return this.bookRepository.save(book);
    }

    @Override
    public Book editBook(String isbnToEdit, String isbn, String title, Integer rating, Boolean forSale, Integer price) {
        Book book = this.bookRepository.findById(isbnToEdit).orElseThrow(InvalidBookIdException::new);

        book.setId(isbn);
        book.setTitle(title);
        book.setRating(rating);
        book.setForSale(forSale);
        book.setPrice(price);
        return this.bookRepository.save(book);
    }

    @Override
    public void delete(String isbn) {
        Book book = this.bookRepository.findById(isbn).orElseThrow(InvalidBookIdException::new);
        this.bookRepository.delete(book);
    }
}
