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

//    public void SelectMovieButtonPushed(ActionEvent eventChange) throws IOException {

//    }


    public void openMulan(ActionEvent actionEvent) {
    setMovie("Mulan");
    }
    public void openSpiderman(ActionEvent actionEvent){
        setMovie("Spiderman");
    }


    private void setMovie(String movieName) {
        for (Movie movie : movieLs) {
            if (movie.getTitle().equals(movieName)) {
                displayInformation.setText
                        ("Movie:  " + movie.getTitle() + "\n" + "Genre:  " + movie.getGenre() + "\n" +
                                "Rating: " + movie.getRating() + "\n" + "Length: " + movie.getLength() + "\n" + "Theater: " + movie.getTheater()
                                + "\n" + "Price:  " + movie.getPrice());
                selectedMovie = movie;
                Main.selectedMovie = movie;

            }

        }
    }
    public void sendBooking(ActionEvent actionEvent) throws IOException {

//        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/Showing.fxml"));
//        loader.setController(new ShowingMovieController());
//        ShowingMovieController showingMovieController = loader.getController();
//        Parent newRoot = loader.load();
        Parent firstWeekParent = FXMLLoader.load(getClass().getResource("fxml/Showing.fxml"));
        Scene mainMenuPageScene = new Scene(firstWeekParent);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(mainMenuPageScene);
        window.show();

//        Main.setMovingTest("Hello world");
//        System.out.println(Main.getMovingTest());
//    }
//    public void sendBooking(ActionEvent chanceEvenet) throws IOException {
//
//        FXMLLoader loader = new FXMLLoader(getClass().getResource("fxml/Showing.fxml"));
//        loader.setController(new ShowingMovieController());
//        ShowingMovieController showingMovieController = loader.getController();
//        Parent newRoot = loader.load();
//
//        showingMovieController
    }
    }

