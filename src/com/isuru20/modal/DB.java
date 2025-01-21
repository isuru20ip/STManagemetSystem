package com.isuru20.modal;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author isuru priyamntha
 */
public class DB {

    // DB Connection
    private static Connection connection;

    private static void setConnection() throws ClassNotFoundException, SQLException, IOException {
        if (connection == null) {
            // set Driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // set onnection 
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/adyapana_db", "root", "@ISURU9829ip");
        }
    }

    public static Integer IUD(String q) throws ClassNotFoundException, SQLException, IOException {
        setConnection();
        return connection.createStatement().executeUpdate(q);
    }

    public static ResultSet search(String q) throws ClassNotFoundException, SQLException, IOException {
        setConnection();
        return connection.createStatement().executeQuery(q);
    }

    public static void closeConnection() throws SQLException {
        connection.close();
    }
}
