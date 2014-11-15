package ressystem;

public class Schedule {

    // Field
    private Movie movie;
    private String dateTime;
    
    // Constructor
    public Schedule(String dateTime, String name, String lang, String length){
        this.dateTime = dateTime;
        this.movie = new Movie(name, lang, length);
    }
    
    // Method

    public String getDateTime() {
        return dateTime;
    }
    
    
    @Override
    public String toString(){
        System.out.print("On : ");
        System.out.println(this.getDateTime());
        System.out.print(movie);
        return "";
    }
}
