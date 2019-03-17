package sample;

import com.sun.javafx.collections.ObservableListWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import java.io.File;
import java.util.ArrayList;

public class MovieList{
    private ArrayList<Movie> movies = new ArrayList<>();

    public ArrayList<Movie> getMovies() {
        return movies;
    }

    public MovieList() {

        Movie m1 = new Movie("Mulan", "Animation", "U", 88, 5.00,
                "Theater One",
                "19:00",
                new File("/image/mulan.png"));

        Movie m2 = new Movie("Spiderman", "Action", "PG13", 116, 5.50,
                "Theater Two",
                "14:00",
                new File("/image/spider.jpg"));
//
//        Movie GetOut = new Movie("GetOut", "Thriller", "R", 90, 6.00,
//                new File("/image/getOut.png"));
//
//        Movie HalfBaked = new Movie("HalfBaked", "Comedy", "R", 90, 5.00,
//                new File("/image/half.jpg"));
//
//        Movie Kumar = new Movie("Harold", "Comedy", "R", 88, 5.00,
//                new File("/image/Harold&Kumar.JPG"));

        movies.add(m2);
        movies.add(m1);

    }
}