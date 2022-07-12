package com.alkemy.disney.disney.entity;

import lombok.Data;
import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "personaje")
@Data
public class PersonajeEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    private String imagen;
    private String nombre;
    private int edad;
    private int peso;
    private String historia;

    @ManyToMany(mappedBy = "personajes", cascade = CascadeType.ALL)
    private List<PeliculaEntity> peliculas = new ArrayList<>();

    // methods
    public void addPelicula(PeliculaEntity pelicula) {
        this.peliculas.add(pelicula);
    }

    public void removePelicula(PeliculaEntity pelicula) {
        this.peliculas.remove(pelicula);
    }
}
