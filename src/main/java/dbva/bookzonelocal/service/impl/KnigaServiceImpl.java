package dbva.bookzonelocal.service.impl;

import dbva.bookzonelocal.model.Kniga;
import dbva.bookzonelocal.repository.KnigaRepository;
import dbva.bookzonelocal.service.KnigaService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KnigaServiceImpl implements KnigaService {

    private final KnigaRepository knigaRepository;

    public KnigaServiceImpl(KnigaRepository knigaRepository) {
        this.knigaRepository = knigaRepository;
    }

    @Override
    public List<Kniga> listAll() {
        return this.knigaRepository.findAll();
    }
}
