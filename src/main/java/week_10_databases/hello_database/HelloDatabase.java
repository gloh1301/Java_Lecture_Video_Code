package week_10_databases.hello_database;

import java.sql.*;

public class HelloDatabase {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:sqlite:hello.sqlite";

        Connection connection = DriverManager.getConnection(url);
        Statement statement = connection.createStatement();

//        String createTableSQL = "CREATE TABLE cats (name TEXT, age INTEGER)";
//        statement.execute(createTableSQL);

//        String insertDataSQL = "INSERT INTO cats VALUES ('Maru', 10)";
//        statement.execute(insertDataSQL);

//        String insertData2SQL = "INSERT INTO cats VALUES ('Hello Kitty', 40)";
//        statement.execute(insertData2SQL);

        String getAllDataSQL = "SELECT * FROM cats";
        ResultSet allCats = statement.executeQuery(getAllDataSQL);

        while (allCats.next()) {
            String name = allCats.getString("name");
            int age = allCats.getInt("age");
            System.out.println(name + " is " + age + " years old");
        }
    }
}
