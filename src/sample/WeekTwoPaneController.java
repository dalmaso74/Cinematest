package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by u1863558 on 18/03/2019.
 */
public class WeekTwoPaneController {

    @FXML
    private TextArea displayedInfo;
    private MovieList movieList = new MovieList();
    private Movie selectedMovie;

    private ArrayList<Movie> movieTwo = new ArrayList<>(movieList.getMovieSec());


    public void openLogan(ActionEvent actionEvent) {
        setMovie("Logan");
    }
    public void openGreenBook(ActionEvent actionEvent) {
        setMovie("GreenBook");
    }
    public void openDeadpool(ActionEvent actionEvent) {
        setMovie("DeadPool");
    }
    public void openTheLegoMovie(ActionEvent actionEvent) {
        setMovie("TheLegoMovie");
    }
    public void openVice(ActionEvent actionEvent) {setMovie("Vice");}



    private void setMovie(String movieName) {
        System.out.println("simon");
        for (Movie movie : movieTwo) {
            if (movie.getTitle().equals(movieName)) {
                System.out.println("jim");
                displayedInfo.setText
                        ("Movie:  " + movie.getTitle() + "\n" + "Genre:  " + movie.getGenre() + "\n" +
                                "Rating: " + movie.getRating() + "\n" + "Length: " + movie.getLength() + "\n" +
                                "Theater: " + movie.getTheater() + "\n" + "Price:  " + movie.getPrice());
                selectedMovie = movie;
                Main.selectedMovie = movie;
            }
        }
    }


    public void sendBooking(ActionEvent actionEvent) throws IOException {
        Parent firstWeekParent = FXMLLoader.load(getClass().getResource("fxml/Showing.fxml"));
        Scene mainMenuPageScene = new Scene(firstWeekParent);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(mainMenuPageScene);
        window.show();
    }
}