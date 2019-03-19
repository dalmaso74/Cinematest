package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Locale;

/**
 * Created by u1863558 on 16/03/2019.
 */
public class BookingController {
    public SnacksList snc = new SnacksList();
    public Movie selected = Main.selectedMovie;
    public Label movie, ticket, ticketBooked, totalPrice;
    public Label tolPop, tolHaribo, priceLabel, tolCoke, tolFanta;
    private int ticketNumber, hariboNumber, popcornNumber, fantaNumber, cokeNumber;
    private double ticketOfMovie,hariboPrice = 2.00,popCornPrice = 1.70, drinkPrice = 1.50;
    private NumberFormat gb = NumberFormat.getCurrencyInstance(Locale.UK);
    public ComboBox<String> comboDrink;
    public ComboBox<String> comboFood;

    private ObservableList<String> getFood = FXCollections.observableArrayList
            ("Haribo", "Popcorn");

    private ObservableList<String> getDrink = FXCollections.observableArrayList
            ("Fanta", "Coke");

    public void initialize(){
        comboFood.setItems(getFood);
        comboDrink.setItems(getDrink);
    }

    public void addMovie(ActionEvent actionEvent) {
        ticketOfMovie = ticketOfMovie + Main.selectedMovie.getPrice();
        ticketNumber = ticketNumber + 1;
        ticketBooked.setText("" + ticketNumber);
        totalPrice.setText(gb.format(ticketOfMovie));
    }

    public void subMovie(ActionEvent actionEvent) {
        if (ticketNumber <= 0) {
            System.out.println("Cannot take away anymore tickets");
        } else {
            ticketNumber = ticketNumber - 1;
            ticketOfMovie = ticketOfMovie - Main.selectedMovie.getPrice();
            ticketBooked.setText("" + ticketNumber);
            totalPrice.setText(gb.format(ticketOfMovie));
        }
    }
//Add Snacks and Drinks
    public void addSnack(ActionEvent actionEvent) {
        if (comboFood.getValue().equals("Haribo")){
            ticketOfMovie = ticketOfMovie + hariboPrice;
            hariboNumber = hariboNumber + 1;
            tolHaribo.setText("" + hariboNumber);
            totalPrice.setText(gb.format(ticketOfMovie));
        }
        if (comboFood.getValue().equals("Popcorn")){
            ticketOfMovie = ticketOfMovie + popCornPrice;
            popcornNumber = popcornNumber + 1;
            tolPop.setText("" + popcornNumber);
            totalPrice.setText(gb.format(ticketOfMovie));
        }
    }

    public void addDrink(ActionEvent actionEvent) {
        if (comboDrink.getValue().equals("Fanta")){
            ticketOfMovie = ticketOfMovie + drinkPrice;
            fantaNumber = fantaNumber + 1;
            tolFanta.setText("" + fantaNumber);
            totalPrice.setText(gb.format(ticketOfMovie));
        }

        if (comboDrink.getValue().equals("Coke")){
            ticketOfMovie = ticketOfMovie + drinkPrice;
            cokeNumber = cokeNumber + 1;
            tolCoke.setText("" + cokeNumber);
            totalPrice.setText(gb.format(ticketOfMovie));
        }
    }
//    Sub Snacks and Drinks
    public void subSnack(ActionEvent actionEvent) {
        if (comboFood.getValue().equals("Haribo")){

            if (hariboNumber <=0){
                System.out.println("error negative value");
            }else{
                ticketOfMovie = ticketOfMovie - hariboPrice;
                hariboNumber = hariboNumber - 1;
                tolHaribo.setText("" + hariboNumber);
                totalPrice.setText(gb.format(ticketOfMovie));
            }
        }
        if (comboFood.getValue().equals("Popcorn")){

            if (popcornNumber <=0){
                    System.out.println("error negative value");
                }else{
                    ticketOfMovie = ticketOfMovie - popCornPrice;
                popcornNumber = popcornNumber - 1;
                tolPop.setText("" + popcornNumber);
                totalPrice.setText(gb.format(ticketOfMovie));
            }
        }
    }

    public void subDrink(ActionEvent actionEvent) {
        if (comboDrink.getValue().equals("Fanta")){
            System.out.println("no Fanta");
            if (fantaNumber <=0){
                System.out.println("error negative value");
            }else{
                ticketOfMovie = ticketOfMovie - drinkPrice;
                fantaNumber = fantaNumber - 1;
                tolFanta.setText("" + fantaNumber);
                totalPrice.setText(gb.format(ticketOfMovie));
            }
        }

        if (comboDrink.getValue().equals("Coke")){
            System.out.println("No coke");
            if (cokeNumber <=0){
                System.out.println("error negative value");
            }else{
                ticketOfMovie = ticketOfMovie - drinkPrice;
                cokeNumber = cokeNumber - 1;
                tolCoke.setText("" + cokeNumber);
                totalPrice.setText(gb.format(ticketOfMovie));
            }
        }
    }

    public void sentToPayment(ActionEvent actionEvent)throws IOException {
        Main.setTotalPrice(ticketOfMovie);

        Parent paymentPageController = FXMLLoader.load(getClass().getResource("fxml/PaymentPage.fxml"));
        Scene paymentPageScene = new Scene(paymentPageController);
        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();
        window.setScene(paymentPageScene);
        window.show();
    }
}
