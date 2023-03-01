package com.prueba.velecela.repository;

import com.prueba.velecela.models.Profesor;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProfesorRepository extends MongoRepository<Profesor, Long> {
}
