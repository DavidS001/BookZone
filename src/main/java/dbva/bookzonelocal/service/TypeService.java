package dbva.bookzonelocal.service;

import dbva.bookzonelocal.model.Type;

import java.util.List;

public interface TypeService {

    Type findById(Integer id);

    List<Type> findAll();
}
