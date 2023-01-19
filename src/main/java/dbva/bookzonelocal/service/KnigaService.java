package dbva.bookzonelocal.service;

import dbva.bookzonelocal.model.Kniga;
import org.apache.catalina.LifecycleState;

import java.util.List;

public interface KnigaService {

    List<Kniga> listAll();
}
