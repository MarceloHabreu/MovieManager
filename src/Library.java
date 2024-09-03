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
        else {System.out.println("Don't possible to complete the addition!");}
    }

    public boolean removeUser(User user){
        return users.remove(user);
    }

    public void listUsers(){
        System.out.println("Listing all users in the library:");
        for (User u : users){
            System.out.println(u);
        }
    }

    public User findUserById(String userId) {
        for (User user: users){
            if (user.getUserId().equals(userId)){
                return user;
            }
        }
        return null;
    }

    public boolean registerLoan(User user, Movie movie){
            if (movies.contains(movie) && !user.getBorrowedMovies().contains(movie)) {
                user.borrowMovie(movie);
                movies.remove(movie);
                System.out.println("Loan registered: " + user.getName() + " borrowed the movie " + movie.getTitle());
                return true;
            } else {
                System.out.println("Loan failed: Movie not available or has already been borrowed.");
                return false;
            }
    }

    public boolean registerReturn(User user, Movie movie){
        if (user.getBorrowedMovies().contains(movie)){
            user.returnMovie(movie);
            movies.add(movie);
            System.out.println("Return registered: " + user.getName() + " returned the movie " +  movie.getTitle() + ".");
            return true;
        } else {
            System.out.println("Return failed: Movie is not in the user's loan list.");
            return false;
        }
    }
}
