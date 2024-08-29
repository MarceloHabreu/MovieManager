import java.util.List;

public class Library {
    // Attributes
    private List<Movie> movies;
    private List<User> users;

    // Constructor
    public Library(List<Movie> movies, List<User> users) {
        this.movies = movies;
        this.users = users;
    }

    // Getters and Setters
    public List<Movie> getMovies() {
        return movies;
    }

    public void setMovies(List<Movie> movies) {
        this.movies = movies;
    }

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    // Methods
    public boolean addMovie(Movie movie){
        if (!movies.contains(movie)) {
            this.movies.add(movie);
            return true;
        }
        return false;
    }

    public boolean removeMovie(Movie movie){
        return movies.remove(movie);
    }

    public Movie searchMovieByTitle(String title) {
        for (Movie movie : movies) {
            if (movie.getTitle().equalsIgnoreCase(title)) {
                return movie;
            }
        }
        return null; // Movie don't find
    }

    public void listMoviesByGenre(String genre) {
        System.out.println("Movies of genre " + genre + ":");
        for (Movie movie : movies) {
            if (movie.getGenre().equalsIgnoreCase(genre)) {
                System.out.println(movie);
            }
        }
    }

    public void registerUser(User user){
        if (!users.contains(user)){
            this.users.add(user);
        }
        System.out.println("This user already exist: " + user);
    }

    public boolean removeUser(User user){
        return users.remove(user);
    }

    public void listUsers(){
        System.out.println("List user by movies library");
        for (User u : users){
            System.out.println(u);
        }
    }
}
