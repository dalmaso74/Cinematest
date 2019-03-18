package sample;

import com.sun.javafx.collections.ObservableListWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import java.io.File;
import java.util.ArrayList;

public class MovieList{
    private ArrayList<Movie> movies = new ArrayList<>();
    private ArrayList<Movie> movieSec = new ArrayList<>();
    public ArrayList<Movie> getMovies() {
        return movies;
    }
    public ArrayList<Movie> getMovieSec(){return movieSec;}

    public MovieList() {

        Movie m1 = new Movie("Mulan", "Animation", "U", 88, 5.00,
                "Theater One",
                "19:00",
                new File("/image/mulan.png"));

        Movie m2 = new Movie("Spiderman", "Action", "PG13", 116, 5.50,
                "Theater Two",
                "14:00",
                new File("/image/spider.jpg"));

        Movie m3 = new Movie("GetOut", "Thriller", "R", 90, 6.00,
                "Theater Three",
                "17:00",
                new File("/image/getOut.png"));

        Movie m4 = new Movie("Half Baked", "Comedy", "R", 90, 5.00,
                "Theater Four",
                "14:00",
                new File("/image/half.jpg"));

        Movie m5 = new Movie("Harold and Kumar", "Comedy", "R", 88, 5.00,
                "Theater Five",
                "19:00",
                new File("/image/Harold&Kumar.JPG"));

        Movie m6 = new Movie("Logan", "Comedy", "R", 88, 5.00,
                "Theater Five",
                "19:00",
                new File("/image/Harold&Kumar.JPG"));

        movies.add(m2);
        movies.add(m1);
        movies.add(m3);
        movies.add(m4);
        movies.add(m5);
        movieSec.add(m6);
    }
}