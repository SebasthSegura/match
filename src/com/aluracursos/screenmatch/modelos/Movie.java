package com.aluracursos.screenmatch.modelos;

public class Movie {
    //creamos las varables de nuestra clase padre que heredaran las hijas
    private String name;
    private int releaseDate;
    private double minutesDurations;
    private boolean userPlan;
    private double plusEvaluations;
    private int totalEvaluations;

    //usamos las estrcturas generativas setter para permitir el uso de las variables
    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setMinutesDurations(double minutesDurations) {
        this.minutesDurations = minutesDurations;
    }

    public int getTotalEvaluations(){
        return totalEvaluations;
    }
    public double getplusEvaluations(){
        return plusEvaluations;
    }

    //creamos un metodo para mostrar la ficha tecnica de la pelicula
    public void mesageTechnicalSheet(){
        System.out.println("El nombre de la pelicula es: " + name);
        System.out.println("Su fecha de lanzamiento fue: " + releaseDate);
        System.out.println("Su duracion es: " + minutesDurations);
    }

    //creamos un metodo que reciba una variable de tipo double llamada nota
    public void evaluation(double note){
        plusEvaluations += note;
        totalEvaluations ++;
    }
    public double showMedia(){
        return plusEvaluations / totalEvaluations;
    }
}
