package sample;

import com.sun.org.apache.xpath.internal.functions.FuncFalse;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by u1863558 on 06/03/2019.
 */
public class ShowingMovieController implements Initializable{
    public Movie selected = Main.selectedMovie;
    public Label displayTitle,checkID;
    public Label displayMovieTime;
// TODO: get images in
    // TODO: age restriction

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        displayMovieTime.setText(selected.getTheater() + "    " + selected.getShowtime() + "\n" + "£ " + selected.getPrice());
        displayTitle.setText(selected.getTitle());
//        if (selected.getRating().equals("R")) {
//            checkID.setText("Check User ID");
//        }

    }
    public void Btnback(ActionEvent actionEvent) throws IOException{
        Parent firstWeekParent = FXMLLoader.load(getClass().getResource("fxml/First_week.fxml"));
        Scene mainMenuPageScene = new Scene(firstWeekParent);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(mainMenuPageScene);
        window.show();

    }

    public void sendToSnack(ActionEvent actionEvent) throws IOException{
        Parent snackController = FXMLLoader.load(getClass().getResource("fxml/Booking.fxml"));
        Scene mainMenuPageScene = new Scene(snackController);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(mainMenuPageScene);
        window.show();
    }
}
