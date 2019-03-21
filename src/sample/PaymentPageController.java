package sample;

import com.sun.xml.internal.bind.v2.TODO;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;
import java.net.URL;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by u1863558 on 18/03/2019.
 */
public class PaymentPageController {
    public Button backButton;
    public double totalPrice = Main.getTotalPrice();
    public Movie selected = Main.selectedMovie;
    private NumberFormat gb = NumberFormat.getCurrencyInstance(Locale.UK);

    public Label displayPayment;

    //displayes selected movie information
    public void initialize() {
        displayPayment.setText("Movie Title  " + selected.getTitle() + "\n" +
                "Theater     " + selected.getTheater() + "\n" +
                "Showing Time    " + selected.getShowtime() + "\n" +
                "Price of Movie   " + gb.format(Main.getPriceTickets()) +
                "\n" + "Haribo  " + gb.format(Main.getPriceHaribo()) +
                "\n" + "PopCorn   " + gb.format(Main.getPricePopCorn()) + "\n" + "Fanta  " + gb.format(Main.getPriceFanta()) + "\n"
                + "Coco-cola    " + gb.format(Main.getPriceCoke()) +
                "\n" + "Total    " + gb.format(Main.getTotalPrice()));

    }

    public void cashPayment(ActionEvent actionEvent) {
    }

    public void cardPayment(ActionEvent actionEvent) {
    }

    // Garry lecture notes
    public void sendBackShowing(ActionEvent actionEvent) throws IOException {
        Window mainWindow = backButton.getScene().getWindow();
        Parent newRoot = FXMLLoader.load(getClass().getResource("fxml/Booking.fxml"));
        mainWindow.getScene().setRoot(newRoot);
    }
    //used garry code
    public void openMovie(ActionEvent actionEvent) throws IOException {
        Parent firstWeekParent = FXMLLoader.load(getClass().getResource("fxml/First_week.fxml"));
        Scene mainMenuPageScene = new Scene(firstWeekParent);
        Stage window = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        window.setScene(mainMenuPageScene);
        window.show();
    }
}
