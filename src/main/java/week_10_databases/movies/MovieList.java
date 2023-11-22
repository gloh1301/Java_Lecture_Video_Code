package week_10_databases.movies;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.List;

import static input.InputUtils.*;

public class MovieList {

    private static final String DB_PATH = "jdbc:sqlite:movie_watchlist.sqlite";
    private static Database database;
    public static void main(String[] args) {
        database = new Database(DB_PATH);
        addNewMovie();
        checkIfWatchedAndRate();
        deleteWatchedMovies();
        searchMovie();
        displayAllMovies();
    }

    public static int getRating() {
        int rating = positiveIntInput("What would you rate the movie out of five?");
        while (rating < 1 || rating > 5) {
            System.out.println("Enter a rating between 1 and 5");
            rating = positiveIntInput("What would you rate the movie out of five?");
        }
        return rating;
    }

    public static String getMovieName() {
        String movieName = stringInput("Enter the movie name: ");
        while (movieName.isEmpty()) {
            System.out.println("Enter a name");
            movieName = stringInput("Enter the movie name: ");
        }
        return movieName;
    }

    public static void addNewMovie() {
        do {
            String movieName = getMovieName();
            boolean movieWatched = yesNoInput("Have you seen this movie? ");
            int movieStars = 0;
            if (movieWatched) {
                movieStars = getRating();
            }
            Movie movie = new Movie(movieName, movieStars, movieWatched);
            database.addNewMovie(movie);
        } while (yesNoInput("Add a movie to the watch list? "));
    }

    public static void displayAllMovies() {
        List<Movie> movies = database.getAllMovies();
        if (movies.isEmpty()) {
            System.out.println("No movies");
        } else {
            for (Movie movie: movies) {
                System.out.println(movie);
            }
        }
    }

    public static void checkIfWatchedAndRate() {
        List<Movie> unwatchedMovies = database.getAllMoviesByWatched(false);
        for (Movie movie: unwatchedMovies) {
            boolean hasWatched = yesNoInput("Have you watched " + movie.getName() + " yet?");
            if (hasWatched) {
                int stars = positiveIntInput("What is your rating for " + movie.getName() + " out of 5?");
                movie.setWatched(true);
                movie.setStars(stars);
                database.updateMovie(movie);
            }
        }
    }

    public static void deleteWatchedMovies() {
        System.out.println("Here are all the movies you have seen");
        List<Movie> watchedMovies = database.getAllMoviesByWatched(true);
        for (Movie movie: watchedMovies) {
            boolean delete = yesNoInput("Delete " + movie.getName() + "?");
            if (delete) {
                database.deleteMovie(movie);
            }
        }
    }

    public static void searchMovie() {
        String movieName = stringInput("Enter movie name to search: ");
        List<Movie> movieMatches = database.search(movieName);
        if (movieMatches.isEmpty()) {
            System.out.println("No matches");
        } else {
            for (Movie movie: movieMatches) {
                System.out.println(movie);
            }
        }
    }
}
