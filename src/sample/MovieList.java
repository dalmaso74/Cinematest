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

        Movie m1 = new Movie("Mulan", "Animation", "U", 88, 3.00,
                "Theater One",
                "19:00",
                new File("/image/mulan.png"));

        Movie m2 = new Movie("Spiderman", "Action", "PG13", 116, 6.50,
                "Theater Two",
                "14:00",
                new File("/image/spider.jpg"));

        Movie m3 = new Movie("GetOut", "Thriller", "R", 90, 6.00,
                "Theater Three",
                "17:00",
                new File("/image/getOut.png"));

        Movie m4 = new Movie("Half Baked", "Comedy", "R", 90, 3.00,
                "Theater Four",
                "14:00",
                new File("/image/half.jpg"));

        Movie m5 = new Movie("Harold and Kumar", "Comedy", "R", 88, 4.00,
                "Theater Five",
                "19:00",
                new File("/image/Harold&Kumar.JPG"));

        Movie m6 = new Movie("Logan", "Action", "R", 94, 5.20,
                "Theater Six",
                "20:00",
                new File("/image/Logan.JPG"));

        Movie m7 = new Movie("GreenBook", "Drama", "PG13", 70, 6.00,
                "Theater Seven",
                "17:00",
                new File("/image/greenBook.png"));

        Movie m8 = new Movie("DeadPool", "Action/Comedy", "R", 86, 5.60,
                "Theater Eight",
                "19:30",
                new File("/image/Deadpool.png"));

        Movie m9 = new Movie("TheLegoMovie", "Animation/comedy", "U", 100, 5.50,
                "Theater Nine",
                "15:00",
                new File("/image/TheLegoMovie.jpg"));

        Movie m10 = new Movie("Vice", "Drama", "R", 140, 6.50,
                "Theater Ten",
                "21:00",
                new File("/image/Vice.png"));


        movies.add(m2);
        movies.add(m1);
        movies.add(m3);
        movies.add(m4);
        movies.add(m5);
        movieSec.add(m6);
        movieSec.add(m7);
        movieSec.add(m8);
        movieSec.add(m9);
        movieSec.add(m10);
    }
}