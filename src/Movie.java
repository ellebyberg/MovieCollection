public class Movie {

    // Attributes
    private String title;
    private String director;
    private int year;
    private boolean isInColor;
    private double lengthInMinutes;
    private String genre;

    // Constructor
    public Movie(String title, String director) {
        this.title = title;
        this.director = director;
    }

    // Getters
    public String getTitle() {return title;}
    public String getDirector() {return director;}
    public int getYear() {return year;}
    public boolean getIsInColor() {return isInColor;}
    public double getLengthInMinutes() {return lengthInMinutes;}
    public String getGenre() {return genre;}
}