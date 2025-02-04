package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by u1863558 on 14/03/2019.
 */
public class WeekOnePaneController {
        
    @FXML
    private TextArea displayInformation ;
    private MovieList movieList = new MovieList();
    private Movie selectedMovie;
    private Button BtnBooking;


    private ArrayList<Movie> movieLs = new ArrayList<>(movieList.getMovies());


    public void openMulan(ActionEvent actionEvent) {
    setMovie("Mulan");
    }
    public void openSpiderman(ActionEvent actionEvent){
        setMovie("Spiderman");
    }
    public void openHalfBaked(ActionEvent actionEvent) {setMovie("GetOut");}
    public void openGetOut(ActionEvent actionEvent) {setMovie("Half Baked");}
    public void openHaroldAndKumar(ActionEvent actionEvent) {setMovie("Harold and Kumar");}


    private void setMovie(String movieName) {
        for (Movie movie : movieLs) {
            if (movie.getTitle().equals(movieName)) {
                displayInformation.setText
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

