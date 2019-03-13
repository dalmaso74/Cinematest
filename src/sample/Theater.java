package sample;

/**
 * Created by u1863558 on 09/03/2019.
 */
public class Theater {
    private String theaterName;
    private int numberOfSeats;
    private String roomNumber;
    private int numberOfRows;
    private int numberOfSeatsPerRow;

    public Theater(String theaterName, int numberOfSeats, String roomNumber, int numberOfRows, int numberOfSeatsPerRow) {
        this.theaterName = theaterName;
        this.numberOfSeats = numberOfSeats;
        this.roomNumber = roomNumber;
        this.numberOfRows = numberOfRows;
        this.numberOfSeatsPerRow = numberOfSeatsPerRow;

    }

    public String getTheaterName() {
        return theaterName;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public int getNumberOfRows() {
        return numberOfRows;
    }

    public int getNumberOfSeatsPerRow() {
        return numberOfSeatsPerRow;

    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public void setNumberOfRows(int numberOfRows) {
        this.numberOfRows = numberOfRows;
    }

    public void setNumberOfSeatsPerRow(int numberOfSeatsPerRow) {
        this.numberOfSeatsPerRow = numberOfSeatsPerRow;

    }

    @Override
    public String toString() {
        return "Theater{" +
                "," + theaterName +
                "," + numberOfSeats +
                "," + roomNumber +
                "," + numberOfRows +
                "," + numberOfSeatsPerRow +
                ",}";
    }
}


