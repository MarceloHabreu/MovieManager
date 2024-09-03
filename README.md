```mermaid
classDiagram
    class Library {
        -List~Movie~ movies
        -List~User~ users
        +addMovie(Movie movie) bool
        +removeMovie(Movie movie) bool
        +searchMovieByTitle(String title) String
        +listMoviesByGenre(String genre)
        +registrarEmprestimo(User user, Movie movie) bool
        +registrarDevolucao(User user, Movie movie) bool
        +gerarRelatorioDeEmprestimos()
    }

    class Movie {
        -String title
        -String director
        -int releaseYear
        -String genre
        -String description
        +Movie(String title, String director, int releaseYear, String genre, String description)
    }

    class User {
        -String name
        -String id
        -List~Movie~ borrowedMovies
        +User(String name, String id)
        +borrowMovie(Movie movie)
        +returnMovie(Movie movie)
        +listBorrowedMovies() List~Movie~
    }

    class Loan {
        -User user
        -Movie movie
        -Date loanDate
        +Loan(User user, Movie movie, Date loanDate)
    }

    class Main {
        +main(String[] args)
    }

    Library --> Movie : manages
    Library --> User : manages
    User --> Movie : borrows
    Library --> Loan : records
    Main --> Library : runs
