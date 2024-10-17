package com.aluracursos.screenmatch.calculos;

import com.aluracursos.screenmatch.modelos.Movie;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Tittle;

public class TimeCalculator {
    private int totalTime;

    //creamos un getter para el encapsulamiento de la variable "totalTime"
    public int getTotalTime() {
        return totalTime;
    }

    //creamos un metodo para calcular el tiempo total sumando a una
    //variable "totaltime" todos los minutos de duracion de cada pelicula
    public void include(Tittle titulo){
        this.totalTime += titulo.getMinutesDurations();
    }

}
