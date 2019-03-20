package sample;

import com.sun.xml.internal.bind.v2.TODO;
import javafx.event.ActionEvent;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by u1863558 on 18/03/2019.
 */
public class PaymentPageController {
    public double totalPrice = Main.getTotalPrice();
    public Movie selected = Main.selectedMovie;

    public Label displayPayment;

    public void initialize(){
        displayPayment.setText("Movie Title  " + selected.getTitle()+ "\n"+
                "Theater"+ selected.getTheater()+"\n"+
                "Showing Time" +selected.getShowtime()+"\n"+
                // TODO: get moviePrice
                //"Price of Movie" +Main.get
                "\n"+"Haribo "+ Main.getPriceHaribo() +
                "\n" +"PopCorn "+Main.getPricePopCorn()+"\n"+"Fanta  " +Main.getPriceFanta() +"\n"
                +"Coco-cola  "+ Main.getPriceCoke()+
                "\n" +"Total  "+ Main.getTotalPrice());
    }

    public void cashPayment(ActionEvent actionEvent) {
    }

    public void cardPayment(ActionEvent actionEvent) {
    }
}
