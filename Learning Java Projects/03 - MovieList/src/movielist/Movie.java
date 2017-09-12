package movielist;

/**
 *
 * @author youssefali
 */
public class Movie {
    private String title;
    private String rating;
    private int year;
    private double runTime;
    
    // constructor
    public Movie(String title, String rating, int year ,double runTime){
        this.title = title;
        this.rating = rating;
        this.year = year;
        this.runTime = runTime;
    }
    
    // getters and setters
    public String getTitle(){
        return this.title;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public String getRating(){
        return this.rating;
    }
    public void setRating(String rating){
        this.rating = rating;
    }
    public int getYear(){
        return this.year;
    }
    public void setYear(int year){
        this.year = year;
    }
    public double getRunTime(){
        return this.runTime;
    }
    public void setRunTime(double runTime){
        this.runTime = runTime;
    }
    
    // toString method
    public String toString(){
        return "Movie title: " + this.title + 
                "\n Rating: " + this.rating + 
                "\n Year: " + this.year + 
                "\n Total runtime in minutes: " + this.runTime + " min";
    }
}
