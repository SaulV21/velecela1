package com.prueba.velecela.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document(collection = "profesor")
@Data
public class Profesor {
    @Id
    private Long prof_id;
    private String nombre;
    private String direccion;
    private String telefono;
    private Departamento depto_id;
    private List <Curso> listadecursos;
}
