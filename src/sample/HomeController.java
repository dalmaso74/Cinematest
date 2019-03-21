package sample;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ComboBox;
import javafx.stage.Stage;

import java.awt.*;
import java.io.IOException;

public class HomeController {


    ObservableList<String> weeksList = FXCollections.observableArrayList
            ("WeekOne", "WeekTwo");

    @FXML
    private ComboBox weekBox;



    @FXML
    // send user to the movie place
    public void openMovie(ActionEvent actionEvent) throws IOException {
        Parent firstWeekParent = FXMLLoader.load(getClass().getResource("fxml/First_week.fxml"));
        Scene mainMenuPageScene = new Scene(firstWeekParent);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(mainMenuPageScene);
        window.show();
    }

}
