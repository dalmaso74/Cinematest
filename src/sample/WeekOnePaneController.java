package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;

import java.util.ArrayList;

/**
 * Created by u1863558 on 14/03/2019.
 */
public class WeekOnePaneController {
        
    @FXML
    private TextArea displayInformation;
    private MovieList movieList = new MovieList();
    private Movie selectedMovie;

    private ArrayList<Movie> movieLs = new ArrayList<>(movieList.getMovies());


    public void openMulan(ActionEvent actionEvent) {
    setMovie("Mulan");
    }
    public void openSpiderman(ActionEvent actionEvent){
        setMovie("Spiderman");
    }


    private void setMovie(String movieName){
        for (Movie movie : movieLs){
            if (movie.getTitle().equals(movieName)) {
                displayInformation.setText("Movie:  " + movie.getTitle() + "\n" + "Genre:  " + movie.getGenre() + "\n" +
                        "Rating: " + movie.getRating() + "\n" + "Length: " + movie.getLength() + "\n" + "Theater: " + movie.getTheater()
                        + "\n" + "Price:  " + movie.getPrice());
                selectedMovie = movie;
            }

            }

    }


}
