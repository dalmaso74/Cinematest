package sample;

import javafx.event.ActionEvent;
import javafx.scene.control.Label;

/**
 * Created by u1863558 on 18/03/2019.
 */
public class PaymentPageController {

    public Label displayPayment;

    public void initialize(){
        displayPayment.setText("" + Main.getTotalPrice());
    }

    public void cashPayment(ActionEvent actionEvent) {
    }

    public void cardPayment(ActionEvent actionEvent) {
    }
}
