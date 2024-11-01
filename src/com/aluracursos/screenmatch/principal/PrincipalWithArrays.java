package com.aluracursos.screenmatch.principal;

import com.aluracursos.screenmatch.modelos.Movie;
import com.aluracursos.screenmatch.modelos.Serie;
import com.aluracursos.screenmatch.modelos.Tittle;

import java.util.ArrayList;

public class PrincipalWithArrays {
    public static void main(String[] args) {

        Movie myMovie = new Movie("encanto", 2021);
        myMovie.evaluation(9);
        Serie casaDragon = new Serie("La casa del Dragon", 2022);
        Movie otherMovie = new Movie("matrix", 1998);
        otherMovie.evaluation(9);
        var newMovie = new Movie("El señor de los anillo", 2001);
        newMovie.evaluation(9);

        ArrayList<Tittle> list = new ArrayList<>();

        /*
        para poder agregar las series sin ningun tipo de error
        hay una solucion muy simple la cual es que en vez de Movie este declarado
        como parametro cambie a Tittle ya que esta engloba todo el concepto
        */
        list.add(myMovie);
        list.add(otherMovie);
        list.add(newMovie);
        list.add(casaDragon);

        for (Tittle item:list) {
            System.out.println(item.getName());
            if (item instanceof Movie movie && movie.getClasification() > 2) {
                System.out.println("Clasificacion: " + movie.getClasification());
            }
        }
    }
}
