package dbva.bookzonelocal.service;

import dbva.bookzonelocal.model.Author;

import java.util.HashMap;

public interface WroteService {

    HashMap<String,String> findAuthorsOfBooks();
}
