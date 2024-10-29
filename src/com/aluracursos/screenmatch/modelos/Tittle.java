package com.aluracursos.screenmatch.modelos;

public class Tittle {
    //creamos las varables de nuestra clase padre que heredaran las hijas
    private String name;
    private int releaseDate;
    private int minutesDurations;
    private boolean userPlan;
    private double plusEvaluations;
    private int totalEvaluations;

    public Tittle(String name, int releaseDate) {
        this.name = name;
        this.releaseDate = releaseDate;
    }

    //usamos las estrcturas generativas setter para permitir el uso de las variables
    public void setName(String name) {
        this.name = name;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setMinutesDurations(int minutesDurations) {
        this.minutesDurations = minutesDurations;
    }

    public int getTotalEvaluations(){
        return totalEvaluations;
    }
    public double getplusEvaluations(){
        return plusEvaluations;
    }

    //usamos los getter para poder hallar las variables privadas de la clase
    public String getName() {
        return name;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public double getMinutesDurations() {
        return minutesDurations;
    }

    //creamos un metodo para mostrar la ficha tecnica de la pelicula
    public void mesageTechnicalSheet(){
        System.out.println("El nombre de la pelicula es: " + getName());
        System.out.println("Su fecha de lanzamiento fue: " + getReleaseDate());
        System.out.println("Su duracion es: " + getMinutesDurations());
    }

    //creamos un metodo que reciba una variable de tipo double llamada nota
    public void evaluation(double note){
        plusEvaluations += note;
        totalEvaluations ++;
    }
    //calcula la media
    public double showMedia(){
        return plusEvaluations / totalEvaluations;
    }


}
