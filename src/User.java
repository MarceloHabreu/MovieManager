import java.util.List;
import java.util.UUID;

public class User {
    // Attributes
    private String name;
    private UUID id;
    List<Loan> loansHistory;

    //Constructor
    public User(String name, UUID id, List<Loan> loansHistory) {
        this.name = name;
        this.id = id;
        this.loansHistory = loansHistory;
    }

    //Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public List<Loan> getLoansHistory() {
        return loansHistory;
    }

    public void setLoansHistory(List<Loan> loansHistory) {
        this.loansHistory = loansHistory;
    }

    // Methods
    public void addLoan(Loan loan){
        if (!loansHistory.contains(loan)){
            this.loansHistory.add(loan);
        } else {
            System.out.println("This movie has already been borrowed: " + loan);
        }
    }

    public boolean removeLoan(Loan loan){
        return loansHistory.remove(loan);
    }
}
