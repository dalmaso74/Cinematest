package sample;

/**
 * Created by U1863558 on 11/03/2019.
 */
public class Showing {
    private static long count;
    private long idNumber;
    private Movie movie;
    private Theater theater;
    private String week;
    private String showingTime;

    public Showing(Movie movie, Theater theater, String week, String showingTime) {
        this.idNumber = setIdNumber();
        this.movie = movie;
        this.theater = theater;
        this.week = week;
        this.showingTime = showingTime;
    }

    public static long setIdNumber() {
//        return newIdNumber = count;
        count++;
        long newIdNumber =  count;
        return newIdNumber;
    }

    public long getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(long idNumber) {
        this.idNumber = idNumber;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
    }

    public String getShowingTime() {
        return showingTime;
    }

    public void setShowingTime(String showingTime) {
        this.showingTime = showingTime;
    }

    @Override
    public String toString() {
        return "Showing{," +
                idNumber +
                "," + movie +
                "," + theater +
                "," + week + '\'' +
                "," + showingTime + '\'' +
                '}';
    }
}
