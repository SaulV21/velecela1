package com.prueba.velecela.models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Getter
@Setter
@Document(collection = "curso")
@Data
public class Curso {
    @Id
    private Long curso_id;
    private String nombre;
    private String nivel;
    private String descripcion;

}
