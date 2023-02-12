package MySQLConnect;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import static java.sql.DriverManager.getConnection;

public class MySQLConnect {
    //set MySQL connection parameters
    private static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/bookdb";
    private static final String DB_USERNAME = "root";
    private static final String DB_PASSWORD = "root";

    //main method for testing
    public static void main(String args[]) {
        try {
            // connect to database
            Connection con = getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            /* System.out.println("Connection to DB succeed !"); */
            // create statement
            Statement stm = con.createStatement();
            // create SQL query
            String query = "SELECT * FROM book";
            // execute SQL query
            ResultSet rs = stm.executeQuery(query);
            // display data to console
            while (rs.next()) {
                System.out.println("Book ID: " + rs.getInt(1));
                System.out.println("Book Title:  " + rs.getString(2));
                System.out.println("Book Author: " + rs.getString(3));
                System.out.println("Book Price: " + rs.getString(4));
                System.out.println("------------------------");
            }
            // close JDBC connection
            con.close();
        } catch (Exception ex) {
            ex.printStackTrace();
            /* System.err.println("Connection to DB failed !"); */
        }
    }
}