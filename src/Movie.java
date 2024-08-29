public class Movie {
    //Attributes
    private int id;
    private String title;
    private String director;
    private int yearRelease;
    private String genre;
    private String description;

    //Constructor
    public Movie(int id, String title, String director, int yearRelease, String genre, String description) {
        this.id = id;
        this.title = title;
        this.director = director;
        this.yearRelease = yearRelease;
        this.genre = genre;
        this.description = description;
    }

    //Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getYearRelease() {
        return yearRelease;
    }

    public void setYearRelease(int yearRelease) {
        this.yearRelease = yearRelease;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", director='" + director + '\'' +
                ", yearRelease=" + yearRelease +
                ", genre='" + genre + '\'' +
                ", description='" + description + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Movie movie = (Movie) obj;
        return title.equalsIgnoreCase(movie.title);
    }

    @Override
    public int hashCode() {
        return title.toLowerCase().hashCode();
    }

}
