package com.alkemy.disney.disney.entity;

import lombok.Data;

import javax.persistence.*;
//import java.util.ArrayList;
//import java.util.List;

@Entity
@Table(name = "genero")
@Data
public class GeneroEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    private String nombre;
    private String imagen;
    //private List<PeliculaEntity> peliculas = new ArrayList<>();
}
