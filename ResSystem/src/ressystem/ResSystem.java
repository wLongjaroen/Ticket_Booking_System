
package ressystem;

import java.io.FileNotFoundException;
import java.util.Scanner;

public class ResSystem {

    public static void main(String[] args) throws FileNotFoundException {
        Scanner sn = new Scanner(System.in);
        int theatreID;
        MainTable mtable = new MainTable();
        mtable.addTheatre();
        System.out.print("Enter theatre ID to show detail : ");
        theatreID = sn.nextInt();
        mtable.printTheatreDetial(theatreID);
        System.out.println("Enter seat ID to book <1 - 100> : ");
        int seatID = sn.nextInt();
        mtable.buyTicket(theatreID, seatID);
        mtable.printTheatreDetial(theatreID);
    }
}
