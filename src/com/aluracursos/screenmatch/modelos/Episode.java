package com.aluracursos.screenmatch.modelos;

import com.aluracursos.screenmatch.calculos.Clasification;

public class Episode implements Clasification {

    //creamos las variables a utilizar numero, nombre, serie para los episodios
    private int number;
    private String name;
    private Serie serie;
    private int totalVisualization;

    public int getTotalVisualization() {
        return totalVisualization;
    }

    public void setTotalVisualization(int totalVisualization) {
        this.totalVisualization = totalVisualization;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    //ayudara para el filtro de recomendaciones  ya que dependiendo de la
    //clasificacion que tenga tendra mas visivilidad
    @Override
    public int getClasification() {
        if (totalVisualization > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
