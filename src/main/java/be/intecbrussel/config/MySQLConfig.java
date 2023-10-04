package be.intecbrussel.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySQLConfig {
    public static Connection getConnection() {
        String url = "localhost"; // 127.0.0.1
        String port = "3306";
        String database = "accountdb";

        String username = "jeanjean";
        String password = "password";

        // jdbc:mysql://localhost:3306/accountdb
        String connectionString = String.format("jdbc:mysql://%s:%s/%s", url, port, database);

        try {
            Connection connection = DriverManager.getConnection(connectionString, username, password);
            return connection;
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }

    }
}








