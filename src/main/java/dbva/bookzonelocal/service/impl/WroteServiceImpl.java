package dbva.bookzonelocal.service.impl;

import dbva.bookzonelocal.model.Author;
import dbva.bookzonelocal.model.Book;
import dbva.bookzonelocal.model.exceptions.InvalidAuthorIdException;
import dbva.bookzonelocal.model.exceptions.InvalidBookIdException;
import dbva.bookzonelocal.model.primarykeys.WroteID;
import dbva.bookzonelocal.model.relations.WroteRelation;
import dbva.bookzonelocal.repository.AuthorRepository;
import dbva.bookzonelocal.repository.BookRepository;
import dbva.bookzonelocal.repository.WroteRepository;
import dbva.bookzonelocal.service.WroteService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

@Service
public class WroteServiceImpl implements WroteService {

    private final BookRepository bookRepository;
    private final AuthorRepository authorRepository;
    private final WroteRepository wroteRepository;

    public WroteServiceImpl(BookRepository bookRepository, AuthorRepository authorRepository, WroteRepository wroteRepository) {
        this.bookRepository = bookRepository;
        this.authorRepository = authorRepository;
        this.wroteRepository = wroteRepository;
    }


    @Override
    public HashMap<String, String> findAuthorsOfBooks() {
        HashMap<String,Integer> booksAuthorsMap = new HashMap<>();
        List<WroteRelation> wroteRelationList = this.wroteRepository.findAll();
        List<Author> authors = this.authorRepository.findAll();

        wroteRelationList.forEach(el -> booksAuthorsMap.put(el.getWroteID().getBookId(),el.getWroteID().getAuthorId()));

        HashMap<String,String> mappedBookAuthor = new HashMap<>();
        booksAuthorsMap.forEach((k,v)-> mappedBookAuthor.put(k,authors.get(v).getName()));

        return mappedBookAuthor;
    }
}
