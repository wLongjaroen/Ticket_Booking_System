package ressystem;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

public class MainTable {

    private ArrayList<Theatre> theatreList = new ArrayList<>();

    public void addTheatre() throws FileNotFoundException {

        FileReader file = new FileReader("theatre.txt");
        Scanner input = new Scanner(file);
        
        while(input.hasNext()){
            String[] data = input.nextLine().split(":");
            this.theatreList.add(new Theatre(data[0], Integer.parseInt(data[1])));
        }

    }
    
    public void buyTicket(int tID, int sID){
        this.theatreList.get(tID-1).booking(sID-1);
    }

    public void printTheatreDetial(int id){
        System.out.println(theatreList.get(id-1));
    }
    
    public void listTheatre() {
        for (Theatre theatre : theatreList) {
            System.out.println(theatre);
        }
    }
}
