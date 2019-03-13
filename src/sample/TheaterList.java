package sample;

import com.sun.javafx.collections.ObservableListWrapper;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

import javax.print.DocFlavor;
import java.io.*;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Created by u1863558 on 09/03/2019.
 */
public class TheaterList extends ObservableListWrapper<Theater> {

    public TheaterList() {
        super(FXCollections.observableArrayList());
    }

    public void addTheatre(Theater t) {
        super.add(t);

    }

    public Theater getTheatre() {
        return TheaterList.super.get(1);

    }

    public ObservableList<String> getTheatreNames() {
        ObservableList<String> theatreNames = FXCollections.observableArrayList();
        for (Theater t : loadTheatres()) {
            theatreNames.add(t.getTheaterName());
        }
        return theatreNames;

    }

// stores them in a Csv file, shows if empty
    public void saveTheaters() throws IOException {
        if (super.isEmpty()) {

            System.out.println("Empty");
        } else {
            File file = new File("list_theatres.csv");
            FileWriter fileW = new FileWriter(file);
            BufferedWriter bw = new BufferedWriter(fileW);
            for (int i = 0; i < super.size(); i++) {
                bw.write(super.get(i).toString());
                bw.newLine();
            }
            bw.close();
            fileW.close();
            System.out.println("Created");
        }
    }
//creates the theaters
    public static TheaterList loadTheatres() {
        TheaterList newTheaterList = new TheaterList();
        try (BufferedReader br = Files.newBufferedReader(Paths.get("list_theatres.csv"),
                StandardCharsets.US_ASCII)) {
            String line = br.readLine();
            while (line != null) {
                String[] attributes = line.split(",");
                Theater newTheater = createTheatre(attributes);
                newTheaterList.addTheatre(newTheater);
                line = br.readLine();

            }
        } catch (IOException e) {
            e.printStackTrace();

        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("try again.");
        }
        return newTheaterList;
    }

    public static Theater createTheatre(String[] attributes) {
        String theatreName = attributes[1];
        int numberOfSeats = Integer.parseInt(attributes[2]);
        String roomNumber = attributes[3];
        int numberOfRows = Integer.parseInt(attributes[4]);
        int numberOfSeatsPerRows = Integer.parseInt(attributes[5]);

        return (new Theater(theatreName,numberOfSeats,roomNumber,
                numberOfRows,numberOfSeatsPerRows));
    }

    public static void main(String[] args) throws IOException {
        TheaterList Annie;
        Annie = loadTheatres();
        Annie.addTheatre(new Theater("Bronze",2,"Bj69",7,3));
        Annie.saveTheaters();
        System.out.println(Annie);
        System.out.println(Annie.getTheatreNames());
    }


}
