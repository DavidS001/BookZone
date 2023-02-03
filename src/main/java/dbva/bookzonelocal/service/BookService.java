package dbva.bookzonelocal.service;

import dbva.bookzonelocal.model.Book;
import dbva.bookzonelocal.model.exceptions.InvalidBookIdException;

import java.util.List;

public interface BookService {

    List<Book> listAll();

    Book findById(String id);

    Book saveBook(String isbn,String title, Integer rating, Boolean forSale, Integer price);

    Book editBook(String isbnToEdit,String isbn,String title,Integer rating, Boolean forSale, Integer price) throws InvalidBookIdException;

    void delete(String isbn);
}
