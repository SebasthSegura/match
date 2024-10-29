package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasification;

public class Movie extends Tittle implements Clasification {
    private String director;


    public Movie(String name, int releaseDate) {
        super(name, releaseDate);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasification() {
        return (int) showMedia() / 2;
    }

    @Override
    public String toString() {
        return "Pelicula " + this.getName() + " (" + getReleaseDate() + ")";
    }
}
