package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import java.io.File;
import java.util.ArrayList;

/**
 * Created by u1863558 on 13/03/2019.
 */
public class ShowingList {
    ArrayList<Showing> FirstWeekShowing = new ArrayList<Showing>();
    ArrayList<Movie> movies = new ArrayList<>();


    void initialize(){

        MovieList m = new MovieList();

        Movie mulan = new Movie("Mulan","Animation","U",88,5.00,
                new File("/image/mulan.png"));

        movies.add(mulan);

        m.addMovie(mulan);
//        ObservableList<String> showingTime = FXCollections.observableArrayList();
//    MovieList movieList = new MovieList();
//    movieList.
//        Showing showingMulan = new Showing(MovieList.get);

    }



}
