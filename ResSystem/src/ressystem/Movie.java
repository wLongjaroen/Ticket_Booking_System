
package ressystem;

public class Movie {
    // Field    
    private String name;
    private String lang;
    private String length;
    
    // Constructor
    public Movie(String name, String lang, String length) {
        this.name = name;
        this.lang = lang;
        this.length = length;
    }

    // Method
    public String getName() {
        return name;
    }

    public String getLang() {
        return lang;
    }

    public String getLength() {
        return length;
    }
    
    @Override
    public String toString(){
        System.out.println("Movie name     : "+name);
        System.out.println("      language : "+lang);
        System.out.print("      length   : "+length);
        return "";
    }
    
}
