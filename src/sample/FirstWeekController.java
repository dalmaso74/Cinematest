package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by u1863558 on 05/03/2019.
 */
public class FirstWeekController extends HomeController {
    ObservableList<String> weekList = FXCollections.observableArrayList
            ("Week1", "Week2");
    @FXML
    public AnchorPane weekPane;
    public ComboBox saturdayWeekBox;
//    private MovieList movieList = new MovieList();
//    private ArrayList<Movie> movieLs = new ArrayList<>(movieList.getMovies());
    //public Button

    @FXML
    private void initialize() {

        saturdayWeekBox.setValue("Select Week");
        saturdayWeekBox.setItems(weeksList);


    }

    public void setWeek(ActionEvent actionEvent) throws IOException {
        if (saturdayWeekBox.getValue().equals("WeekOne")) {
            Node node;
            node = (Node) FXMLLoader.load(getClass().getResource("fxml/WeekOnePane.fxml"));
            weekPane.getChildren().setAll(node);
        }
        if (saturdayWeekBox.getValue().equals("WeekTwo")) {
            Node node;
            node = (Node) FXMLLoader.load(getClass().getResource("fxml/WeekTwoPane.fxml"));
            weekPane.getChildren().setAll(node);
        }

    }

    //button to send home
    public void openHome(ActionEvent actionEvent) throws IOException {
        Parent homePageParent = FXMLLoader.load(getClass().getResource("fxml/HomePage.fxml"));
        Scene mainMenuPageScene = new Scene(homePageParent);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(mainMenuPageScene);
        window.show();
    }





}
