package sample;

import com.sun.javafx.collections.ObservableListWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;

import java.io.File;
import java.util.ArrayList;

public class MovieList extends ObservableListWrapper<Movie> {

    public MovieList() {
        super(FXCollections.observableArrayList());
    }

    public void addMovie(Movie m) {
        super.add(m);
    }

    public Movie getMovie() {
        return MovieList.super.get(1);
    }


    public static void main(String[] args) {
        ObservableList<Movie> movieTitle = FXCollections.observableArrayList();


        Movie mulan = new Movie("Mulan", "Animation", "U", 88, 5.00,
                new File("/image/mulan.png"));

//        Movie Spiderman = new Movie("Spiderman","Action","PG13",116,5.50,
//                new File("/image/spider.jpg"));
//
//        Movie GetOut = new Movie("GetOut","Thriller","R",90,6.00,
//                new File("/image/getOut.png"));
//
//        Movie HalfBaked = new Movie("HalfBaked","Comedy","R",90,5.00,
//                new File("/image/half.jpg"));
//
//        Movie Kumar = new Movie("Harold","Comedy","R",88,5.00,
//                new File("/image/Harold&Kumar.JPG"));


        movieTitle.add(mulan);
//        FirstMovies.add(Spiderman);
//        FirstMovies.add(GetOut);
//        FirstMovies.add(HalfBaked);
//        FirstMovies.add(Kumar);

//
//        //secondWeek
//
//        Movie Vice = new Movie("Vice","Drama","PG15",130,7.00,
//                new File("/image/Vice.png"));
//
//        Movie Logan = new Movie("Logan","Action","R",120,6.00,
//                new File("/image/Logan.png"));
//
//        Movie LegoMovie = new Movie("LegoMovie","Animation","U",90,6.00,
//                new File("/image/TheLegoMovie.jpg"));
//
//        Movie GreenBook = new Movie("GreenBook","Drama","PG13",90,6.00,
//                new File("/image/greenBook.png"));
//
//        Movie Deadpool = new Movie("Deadpool","Action","R",90,6.00,
//                new File("/image/Deadpool.png"));
//
//
//        SecondMovies.add(Vice);
//        SecondMovies.add(Logan);
//        SecondMovies.add(LegoMovie);
//        SecondMovies.add(GreenBook);
//        SecondMovies.add(Deadpool);
    }
}
//    public Movie getGetMovie(int i) {
//        return super.(i);
//    }
// MoviesList.addMovie(mulan);





