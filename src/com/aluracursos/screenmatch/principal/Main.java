package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.calculos.RecomendsFilter;
import com.aluracursos.screenmatch.calculos.TimeCalculator;
import com.aluracursos.screenmatch.modelos.Episode;
import com.aluracursos.screenmatch.modelos.Movie;
import com.aluracursos.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //creamos una pelicula nueva llamandola y dando un nombre propio
        Movie myMovie = new Movie("encanto", 2021);
        myMovie.setMinutesDurations(125);

        myMovie.mesageTechnicalSheet();
        myMovie.evaluation(7.9);
        myMovie.evaluation(10);
        myMovie.evaluation(8.9);
        System.out.println(myMovie.getplusEvaluations());
        System.out.println(myMovie.getTotalEvaluations());
        System.out.println(myMovie.showMedia());

        Serie casaDragon = new Serie("La casa del Dragon", 2022);
        casaDragon.setTemporadas(1);
        casaDragon.setEpisodeOfTemp(10);
        casaDragon.setMinutesOfEpisode(50);
        casaDragon.mesageTechnicalSheet();

        Movie otherMovie = new Movie("matrix", 1998);
        otherMovie.setMinutesDurations(180);

        TimeCalculator calculator = new TimeCalculator();
        calculator.include(myMovie);
        calculator.include(casaDragon);
        calculator.include(otherMovie);
        System.out.println("");
        System.out.println("tiempo necesario para ver todos tus titulos seleccionados: "
                + calculator.getTotalTime() + " minutos");

        //usamos la clase RecomendsFilter para dar un mensaje en la clase principal
        RecomendsFilter recomendsFilter = new RecomendsFilter();
        recomendsFilter.Filter(myMovie);

        Episode episode = new Episode();
        episode.setNumber(1);
        episode.setName("La casa de Targaryen");
        episode.setSerie(casaDragon);
        episode.setTotalVisualization(300);

        //usamos el metodo filtrar
        recomendsFilter.Filter(episode);

        /*usamos var para indicar que estamos iniciando
         una variable de tipo global que va a ser un objeto de tipo Movie
         de este modo newMovie quedara registrada sin tanta redundancia y mas simple*/
        var newMovie = new Movie("El señor de los anillo", 2001);
        newMovie.setMinutesDurations(180);

        /*creamos un array para poder ver el comportamiento de los arrays y entenderlo.
         * de igual modo en el parametro principal del arraylist el tipo de dato
         * especificado a recibir es un dato de tipo Movie ya que esta indicado entre <>*/
        ArrayList<Movie> listMovie = new ArrayList<>();

        //agregamos los objetos de Movie al arraylist
        listMovie.add(myMovie);
        listMovie.add(otherMovie);
        listMovie.add(newMovie);

        //imprimimos el tamaño del array en un "sout"
        System.out.println("El tamaño de la lista de pelicula es: " + listMovie.size());

        //ahora imprimimos en pantalla el primer item de la lista
        System.out.println("La primera pelicula de la lista es: " + listMovie.get(0).getName());

        System.out.println(listMovie);

        System.out.println("toString de la pelicula:" + listMovie.get(0).toString());

    }
}
