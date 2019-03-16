package sample;

import com.sun.javafx.collections.ObservableListWrapper;
import com.sun.org.apache.xpath.internal.operations.String;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by u1863558 on 06/03/2019.
 */
public class ShowingMovieController implements Initializable{
    public Movie selected = Main.selectedMovie;
    public Label displayTitle;
    public Label displayMovieTime;


    @Override
    public void initialize(URL location, ResourceBundle resources){
        displayMovieTime.setText(selected.getShowtime ()+ "    " +selected.getTheater());
        displayTitle.setText(selected.getTitle());
    }

    public void Btnback(ActionEvent actionEvent) {
        

    }
}
