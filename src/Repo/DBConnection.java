package Repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
    private final static String url = "jdbc:postgresql://localhost:5432/postgres";
    private static final String userName = "abdelrahmangaber";
    private final static String password = "382910";
    public void connect(){
        // connect the database
        try {
            Class.forName("com.postgresql.Driver");
            try (
                    // get connection
           Connection c = DriverManager.getConnection(url, userName, password);
            ) {
                // auto close in try-with-resource
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }catch (ClassNotFoundException ex ){
            System.err.println(ex.getMessage());
        }
    }
}
