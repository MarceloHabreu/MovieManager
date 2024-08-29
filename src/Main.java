import java.util.ArrayList;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Movie movie1 = new Movie(1,"Avengers", "Joss Whedon", 2012, "Action", "Description Avengers");

        List<Movie> movies = new ArrayList<>();
        Library library = new Library(movies, new ArrayList<>());
        library.addMovie(movie1);
        library.listMoviesByGenre("Action");
        System.out.println("Find the attributes movie by title: " + library.searchMovieByTitle("Avengers"));
    }
}