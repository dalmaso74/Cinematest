package sample;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    public static Movie selectedMovie = null;
    private static double totalPrice;
    private static double priceHaribo, pricePopCorn, priceFanta, priceCoke, priceTickets;
// TODO: get moviePrice

    // TODO: print trailer and cardPyment

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("fxml/First_Week.fxml"));
        primaryStage.setTitle("Cinema");
        primaryStage.setScene(new Scene(root, 1026, 700));
        primaryStage.show();
    }

    public static double getTotalPrice() {
        return totalPrice;
    }

    public static void setTotalPrice(double totalPrice) {
        Main.totalPrice = totalPrice;
    }

    public static double getPriceHaribo() {
        return priceHaribo;
    }

    public static void setPriceHaribo(double priceHaribo) {
        Main.priceHaribo = priceHaribo;
    }

    public static double getPricePopCorn() {
        return pricePopCorn;
    }

    public static void setPricePopCorn(double pricePopCorn) {
        Main.pricePopCorn = pricePopCorn;
    }

    public static double getPriceFanta() {
        return priceFanta;
    }

    public static void setPriceFanta(double priceFanta) {
        Main.priceFanta = priceFanta;
    }

    public static double getPriceCoke() {
        return priceCoke;
    }

    public static void setPriceCoke(double priceCoke) {
        Main.priceCoke = priceCoke;
    }

    public static double getPriceTickets() {
        return priceTickets;
    }

    public static void setPriceTickets(double priceTickets) {
        Main.priceTickets = priceTickets;
    }

    public static void main(String[] args) {
        launch(args);
    }
}
