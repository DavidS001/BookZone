package dbva.bookzonelocal.service.impl;

import dbva.bookzonelocal.model.Type;
import dbva.bookzonelocal.repository.TypeRepository;
import dbva.bookzonelocal.service.TypeService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TypeServiceImpl implements TypeService {

    private final TypeRepository typeRepository;

    public TypeServiceImpl(TypeRepository typeRepository) {
        this.typeRepository = typeRepository;
    }

    public List<Type> findAll(){
        return this.typeRepository.findAll();
    }

    public Type findById(Integer id){
        return this.typeRepository.findById(id).orElseThrow();
    }
}
