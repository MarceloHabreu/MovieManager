import java.util.ArrayList;
import java.util.List;

public class User {
    // Attributes
    private String userId;
    private String name;
    List<Movie> borrowedMovies;

    //Constructor
    public User(String name, String userId) {
        this.name = name;
        this.userId = userId;
        this.borrowedMovies = new ArrayList<>();
    }

    //Getters and Setters
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Movie> getBorrowedMovies() {
        return borrowedMovies;
    }

    public void setBorrowedMovies(List<Movie> borrowedMovies) {
        this.borrowedMovies = borrowedMovies;
    }

    // Methods
    public void borrowMovie(Movie movie){
        if (!borrowedMovies.contains(movie)){
            this.borrowedMovies.add(movie);
        } else {
            System.out.println("This movie has already been borrowed: " + movie);
        }
    }

    public void returnMovie(Movie movie){
        borrowedMovies.remove(movie);
    }

    public void listBorrowedMovies() {
        if (borrowedMovies.isEmpty()){
            System.out.println(name + " has not borrowed any movies!");
        }
        else {
            System.out.println(name + " borrowed movies:");
            for (Movie movie : borrowedMovies){
                System.out.println(movie);
            }
        }
    }

    // To string
    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", name='" + name +
                '}';
    }

}
