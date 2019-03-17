package sample;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.Label;

import java.awt.*;
import java.net.URL;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.ResourceBundle;

/**
 * Created by u1863558 on 16/03/2019.
 */
public class BookingController {
    public Movie selected = Main.selectedMovie;
    public Label movie,ticket,ticketBooked,totalPrice;
    public Label tolPop,tolHaribo,priceLabel,tolCoke;
    private int ticketNumber;
    private double ticketOfMovie;
    NumberFormat gb = NumberFormat.getCurrencyInstance(Locale.UK);

    public void addMovie(ActionEvent actionEvent) {
        ticketOfMovie = ticketOfMovie + Main.selectedMovie.getPrice();
        ticketNumber = ticketNumber + 1;
        ticketBooked.setText("" + ticketNumber);
        totalPrice.setText(gb.format(ticketOfMovie));
    }

    public void subMovie(ActionEvent actionEvent) {
        ticketOfMovie = ticketOfMovie - Main.selectedMovie.getPrice();
        ticketNumber = ticketNumber - 1;
        ticketBooked.setText("" + ticketNumber);
        totalPrice.setText(gb.format(ticketOfMovie));

        if (ticketNumber <= 0){
            ticketNumber = ticketNumber + 1;
            ticketOfMovie = ticketOfMovie + Main.selectedMovie.getPrice();
        }

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
