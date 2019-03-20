package sample;

import java.io.File;

public class Movie {
    public String title = "";
    public String genre = "";
    public String rating = "";
    public float length; // In minutes
    public double price;
    public String theater;
    public String showtime;
    public File image;




    public Movie( String title,String genre,String rating,float length, double price,String theater,String showtime,File image) {
        this.title = title;
        this.genre = genre;
        this.rating = rating;
        this.length = length;
        this.price = price;
        this.theater = theater;
        this.showtime = showtime;
        this.image = image;
// TODO: seat limit

    }

    public String getTitle() { return title; }

    public String getGenre() {
        return genre;
    }

    public String getRating() {
        return rating;
    }

    public float getLength() {
        return length;
    }

    public String getTheater() {
        return theater;
    }
    public String getShowtime(){
        return showtime;
    }

    public double getPrice() {
        return price;
    }



    public File getImage() {
        return image; }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", rating='" + rating + '\'' +
                ", length=" + length +
                ", price=" + price +
                ", theater='" + theater + '\'' +
                ", showtime='" + showtime + '\'' +
                ", image=" + image +
                '}';
    }
}
