package sample;

import com.sun.org.apache.xpath.internal.functions.FuncFalse;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by u1863558 on 06/03/2019.
 */
public class ShowingMovieController implements Initializable{
    public Button backButton;
    public Movie selected = Main.selectedMovie;
    public Label displayTitle;
    public Label checkID;
    public Label displayMovieTime;


//diplayes information
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        displayMovieTime.setText(selected.getTheater() + "    " + "\n" +selected.getShowtime() + "\n" + "£ " + selected.getPrice());
        displayTitle.setText(selected.getTitle());
        if (selected.getRating().equals("R")) {
            checkID.setText("Check User ID");}
        else{checkID.setVisible(false);

        }
//        if (selected.getRating().equals("R")) {
//            checkID.setText("Check User ID");
//        }

    }
    // garry lecture 20 term 2
    public void Btnback(ActionEvent actionEvent) throws IOException{
        Window mainWindow = backButton.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("fxml/First_week.fxml"));
        mainWindow.getScene().setRoot(newRoot);

    }

    public void sendToSnack(ActionEvent actionEvent) throws IOException{
        Parent snackController = FXMLLoader.load(getClass().getResource("fxml/Booking.fxml"));
        Scene mainMenuPageScene = new Scene(snackController);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(mainMenuPageScene);
        window.show();
    }
}
