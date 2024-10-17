package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasification;

public class Movie extends Tittle implements Clasification {
    private String director;

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
}
