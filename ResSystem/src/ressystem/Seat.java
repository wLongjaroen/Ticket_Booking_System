
package ressystem;

public class Seat {
    // Field
    private int id;
    private char row;
    private char col;
    private boolean book = false;
    
    // Constructor
    public Seat(char r, char c,int id){
        this.row = r;
        this.col = c;
        this.id = id;
    }
    
    // Method
    public void book(){
        this.book = true;
    }
    
    public char getRow() {
        return row;
    }

    public char getCol() {
        return col;
    }

    public boolean isBook() {
        return book;
    }
    
    @Override
    public String toString(){
        System.out.println(row+" "+col);
        return "";
    }
}
