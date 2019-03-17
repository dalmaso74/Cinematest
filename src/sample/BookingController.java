package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Label;

import java.awt.*;
import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by u1863558 on 16/03/2019.
 */
public class BookingController {
    public Movie selected = Main.selectedMovie;
    public Label movie,ticket,ticketBooked,totalPrice;
    public Label tolPop,tolHaribo,priceLabel,tolCoke;
    private int ticketNumber;
    public double ticketOfMovie;

    public void addMovie(ActionEvent actionEvent) {
        ticketOfMovie = ticketOfMovie + Main.selectedMovie.getPrice();
        ticketNumber = ticketNumber + 1;
        ticketBooked.setText("" + ticketNumber);
    }

    public void subMovie(ActionEvent actionEvent) {
    }

    public void minusSnack(ActionEvent actionEvent) {
    }

    public void addSnack(ActionEvent actionEvent) {
    }

    public void subDrink(ActionEvent actionEvent) {
    }

    public void addDrink(ActionEvent actionEvent) {
    }
}
