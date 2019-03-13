package sample;

import java.io.File;

public class Movie {
    public String title = "";
    public String genre = "";
    public String rating = "";
    public float length; // In minutes
    public double price;
    public File image;



    public Movie( String title,String genre,String rating,float length, double price,File image) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.length = length;
        this.price = price;
        this.image = image;
    }

    public String getTitle() { return title;  }

    public String getGenre() {
        return genre;
    }

    public String getRating() {
        return rating;
    }

    public float getLength() {
        return length;
    }

    public double getPrice() {
        return price;
    }

    public File getImage() { return image; }
};
