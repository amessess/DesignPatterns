package singleton;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//Singleton database
public class Database {
    private static Database instance = null; //instance of database
    private Connection connection; //connection

    private Database() { //private constructor, to call it only in this class
        // here, creating connection with database
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/database", "root", "");
        } catch (SQLException | ClassNotFoundException throwables) {
            throwables.printStackTrace();
        }
    }

    public static Database getInstance() { //singleton method
        if (instance == null) { //check that, is there any instance of database created
            instance = new Database(); //if there is no, then creating the instance
        }
        return instance; //returning instance
    }

    public Connection getConnection() { //returning connection to database
        return connection;
    }
}
