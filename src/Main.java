import com.aluracursos.screenmatch.calculos.RecomendsFilter;
import com.aluracursos.screenmatch.calculos.TimeCalculator;
import com.aluracursos.screenmatch.modelos.Episode;
import com.aluracursos.screenmatch.modelos.Movie;
import com.aluracursos.screenmatch.modelos.Serie;

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

        Serie casaDragon = new Serie();
        casaDragon.setName("La casa del Dragon");
        casaDragon.setReleaseDate(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setEpisodeOfTemp(10);
        casaDragon.setMinutesOfEpisode(50);
        casaDragon.mesageTechnicalSheet();

        Movie otherMovie = new Movie();
        otherMovie.setName("matrix");
        otherMovie.setReleaseDate(1998);
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

        recomendsFilter.Filter(episode);
    }
}
