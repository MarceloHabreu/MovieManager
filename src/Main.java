import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie(1,"Avengers", "Joss Whedon", 2012, "Action", "Description Avengers");
        Movie movie2 = new Movie(2,"The Matrix", "Lilly e Lana Wachowski", 1999,"Sci-Fi", "Description Matrix");

        // Adding movies in library, removing and listing
        List<Movie> movies = new ArrayList<>();
        Library library = new Library(movies, new ArrayList<>());
        library.addMovie(movie1);
        library.listMoviesByGenre("Action");
        System.out.println("Find the attributes movie by title: " + library.searchMovieByTitle("Avengers"));
        System.out.println("------Displaying some movies items Movie 1-----");
        System.out.println(movie1.getDirector());
        System.out.println(movie1.getDescription());
        System.out.println(movie1.getYearRelease());
        System.out.println(movie1.getGenre());

        // Adding users, removing and listing
        User user1 = new User("Marcelo", "001");
        User user2 = new User("Ana", "002");
        user1.borrowMovie(movie1);
        user1.borrowMovie(movie2);
        user2.borrowMovie(movie2);
        library.registerUser(user1);
        library.registerUser(user2);
        System.out.println("------Show user by id-----");
        System.out.println(library.findUserById("002"));
        System.out.println("------Listing users-----");
        library.listUsers();
        System.out.println("------Listing borrowed movies-----");
        user1.listBorrowedMovies();
        user2.listBorrowedMovies();
        System.out.println("------Listing borrowed movies after return movies-----");
        user1.returnMovie(movie1);
        user2.returnMovie(movie2);
        user1.listBorrowedMovies();
        user2.listBorrowedMovies();
        System.out.println("------Listing borrowed movies made by library-----");
        library.registerLoan(user1,movie1);
    }
}