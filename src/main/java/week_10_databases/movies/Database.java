package week_10_databases.movies;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class Database {
    private String databasePath;
    Database(String databasePath) {
        this.databasePath = databasePath;

        try (Connection connection = DriverManager.getConnection(databasePath);
        Statement statement = connection.createStatement()) {

            statement.execute("CREATE TABLE IF NOT EXISTS movies (" +
                    "id INTEGER PRIMARY KEY, " +
                    "name TEXT UNIQUE CHECK(length(name) >= 1), " +
                    "stars INTEGER CHECK(stars >= 1 AND stars <= 5), " +
                    "watched BOOLEAN)");

        } catch (SQLException e) {
            System.out.println("Error creating movie DB table: " + e);
        }
    }

    public void addNewMovie(Movie movie) {
        String insertSQL = "INSERT INTO movies (name, stars, watched) VALUES (?, ?, ?)";
        try (Connection connection = DriverManager.getConnection(databasePath);
             PreparedStatement preparedStatement = connection.prepareStatement(insertSQL)) {

            preparedStatement.setString(1, movie.getName());
            preparedStatement.setInt(2, movie.getStars());
            preparedStatement.setBoolean(3, movie.isWatched());

            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println("Error adding movie " + movie + ": " + e);
        }
    }

    public List<Movie> getAllMovies() {
        try (Connection connection = DriverManager.getConnection(databasePath);
        Statement statement = connection.createStatement()) {

            ResultSet movieResults = statement.executeQuery("SELECT * FROM movies ORDER BY name");
            List<Movie> movies = new ArrayList<>();

            while (movieResults.next()) {
                int id = movieResults.getInt("id");
                String name = movieResults.getString("name");
                int stars = movieResults.getInt("stars");
                boolean watched = movieResults.getBoolean("watched");

                Movie movie = new Movie(id, name, stars, watched);
                movies.add(movie);
            }
            return movies;

        } catch (SQLException e) {
            System.out.println("Error fetching all movies: " + e);
            return null;
        }
    }

    public List<Movie> getAllMoviesByWatched(boolean watchedStatus) {
        try (Connection connection = DriverManager.getConnection(databasePath);
             PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM movies WHERE watched = ?")) {
            preparedStatement.setBoolean(1, watchedStatus);
            ResultSet movieResults = preparedStatement.executeQuery();
            List<Movie> movies = new ArrayList<>();

            while (movieResults.next()) {
                int id = movieResults.getInt("id");
                String name = movieResults.getString("name");
                int stars = movieResults.getInt("stars");
                boolean watched = movieResults.getBoolean("watched");
                Movie movie = new Movie(id, name, stars, watched);
                movies.add(movie);
            }
            return movies;

        } catch (SQLException e) {
            System.out.println("Error getting movies: " + e);
            return null;
        }
    }

    public void updateMovie(Movie movie) {
        String sql = "UPDATE movies SET stars = ?, watched = ? WHERE id = ?";
        try (Connection connection = DriverManager.getConnection(databasePath);
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, movie.getStars());
            preparedStatement.setBoolean(2, movie.isWatched());
            preparedStatement.setInt(3, movie.getId());

            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println("Error updating movie " + movie + ": " + e);
        }
    }

    public void deleteMovie(Movie movie) {
        try (Connection connection = DriverManager.getConnection(databasePath);
        PreparedStatement preparedStatement = connection.prepareStatement("DELETE FROM movies WHERE id = ?")) {
            preparedStatement.setInt(1, movie.getId());
            preparedStatement.execute();
        } catch (SQLException e) {
            System.out.println("Error deleting movie " + movie + ": " + e);
        }
    }

    public List<Movie> search(String searchTerm) {
        String searchSQL = "SELECT * FROM movies WHERE UPPER(name) LIKE UPPER(?)";
        try (Connection connection = DriverManager.getConnection(databasePath);
        PreparedStatement preparedStatement = connection.prepareStatement(searchSQL)) {
            preparedStatement.setString(1, "%" + searchTerm + "%");
            ResultSet movieResults = preparedStatement.executeQuery();

            List<Movie> movies = new ArrayList<>();
            while (movieResults.next()) {
                int id = movieResults.getInt("id");
                String name = movieResults.getString("name");
                int stars = movieResults.getInt("stars");
                boolean watched = movieResults.getBoolean("watched");
                Movie movie = new Movie(id, name, stars, watched);
                movies.add(movie);
            }
            return movies;
        } catch (SQLException e) {
            System.out.println("Error searching for " + searchTerm + ": " + e);
            return null;
        }
    }
}
