package com.aluracursos.screenmatch.modelos;

public class Serie extends Tittle {
    private int temporadas;
    private int episodeOfTemp;
    private int minutesOfEpisode;

    public Serie(String name, int releaseDate) {
        super(name, releaseDate);
    }

    //creamos un metodo que sobre escriba el metodo de otra clase para poder usarlo
    //mediante la herencia
    @Override
    public double getMinutesDurations() {
        return temporadas * episodeOfTemp * minutesOfEpisode;
    }

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public int getEpisodeOfTemp() {
        return episodeOfTemp;
    }

    public void setEpisodeOfTemp(int episodeOfTemp) {
        this.episodeOfTemp = episodeOfTemp;
    }

    public int getMinutesOfEpisode() {
        return minutesOfEpisode;
    }

    public void setMinutesOfEpisode(int minutesOfEpisode) {
        this.minutesOfEpisode = minutesOfEpisode;
    }

    /*
    sobreescribimos el metodo toString para que las series no se muestren
    como referencia sino con su nombre y fecha de lanzamiento como se hizo en movie
     */
    @Override
    public String toString() {
        return "serie: " + this.getName() + " (" + this.getReleaseDate() + ")";
    }
}
