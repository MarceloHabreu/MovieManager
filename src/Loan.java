import java.time.LocalDate;

public class Loan {
    // Attributes
    private Movie movie;
    private User user;
    private LocalDate loanDate;

    // Constructor
    public Loan(Movie movie, User user, LocalDate loanDate) {
        this.movie = movie;
        this.user = user;
        this.loanDate = loanDate;
    }

    // Getters and Setters
    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public LocalDate getLoanDate() {
        return loanDate;
    }

    public void setLoanDate(LocalDate loanDate) {
        this.loanDate = loanDate;
    }
}
