import com.aluracursos.screenmatch.modelos.Movie;

public class Main {
    public static void main(String[] args) {
        //creamos una pelicula nueva llamandola y dando un nombre propio
        Movie myMovie = new Movie();
        myMovie.setName("encanto");
        myMovie.setReleaseDate(2021);
        myMovie.setMinutesDurations(125);

        myMovie.mesageTechnicalSheet();
        myMovie.evaluation(7.9);
        myMovie.evaluation(10);
        myMovie.evaluation(8.9);
        System.out.println(myMovie.getplusEvaluations());
        System.out.println(myMovie.getTotalEvaluations());
        System.out.println(myMovie.showMedia());

//        com.aluracursos.screenmatch.modelos.Movie otherMovie = new com.aluracursos.screenmatch.modelos.Movie();
//        otherMovie.name = "matrix";
//        otherMovie.releaseDate = 1998;
//        otherMovie.minutesDurations = 180;
//
//        otherMovie.mesageTechnicalSheet();

    }
}
