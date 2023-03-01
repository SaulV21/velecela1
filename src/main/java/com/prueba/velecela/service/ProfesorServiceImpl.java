package com.prueba.velecela.service;

import com.prueba.velecela.models.Profesor;
import com.prueba.velecela.repository.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Service;

@Service
public class ProfesorServiceImpl extends GenericServiceImpl<Profesor, Long> implements ProfesorService {
    @Autowired
    ProfesorRepository prof;
    @Override
    public CrudRepository<Profesor, Long> getDao() {
        return prof;
    }
}
