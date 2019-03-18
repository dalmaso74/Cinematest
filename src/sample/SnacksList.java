package sample;

import java.util.ArrayList;

/**
 * Created by u1863558 on 01/02/2009.
 */
public class SnacksList {
    private ArrayList<Snacks> food = new ArrayList<>();
    private ArrayList<Snacks> drink = new ArrayList<>();

    public ArrayList<Snacks> getFood() {
        return food;
    }
    public  ArrayList<Snacks> getDrink() {
        return drink;
    }


    public SnacksList(){

        Snacks s1 = new Snacks("Haribo","Food",2.00);

        Snacks s2 = new Snacks("Coke","Drink",1.70);

        Snacks s3 = new Snacks("Fanta","Drink",1.50);

        Snacks s4 = new Snacks("PopCorn","Drink",1.50);

        food.add(s1);
        drink.add(s2);
        drink.add(s3);
        food.add(s4);
    }
}
