package ressystem;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class Theatre {

    // Field
    private String name;
    private int id;
    private ArrayList<Seat> seatList = new ArrayList<>();
    private ArrayList<Schedule> scheduleList = new ArrayList<>();

    // Constructor
    public Theatre(String name, int id) throws FileNotFoundException {
        this.name = name;
        this.id = id;

        // Create 100 seat from A1 to J10
        int seatID = 1;
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++) {
                seatID++;
                seatList.add(new Seat((char) ('A' + i), Character.forDigit(j, 9), seatID));
            }
        }
        // End
        
        this.addNewSchedule();
    }

    // Method
    public void addNewSchedule() throws FileNotFoundException {

        FileReader file = new FileReader("input.txt");
        Scanner input = new Scanner(file);

        while (input.hasNext()) {
            String[] data = input.nextLine().split(":");
            this.scheduleList.add(new Schedule(data[0], data[1], data[2], data[3]));
        }
    }

    public int getEmptySeat() {
        int count = 0;
        for (Seat s : seatList) {
            if (!s.isBook()) {
                count++;
            }
        }
        return count;
    }

    public void booking(int id){
        this.seatList.get(id-1).book();
    }
    
    @Override
    public String toString() {
        System.out.println(id + " " + name);
        System.out.println("Movie program : ");
        for (Schedule s : scheduleList) {
            System.out.println(s);
        }
        return "Has " + this.getEmptySeat() + " seat left.";
    }
}
