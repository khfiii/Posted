/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author kahfi
 */
public class koneksi {
      private static final String URL = "jdbc:mysql://localhost:3306/absensi";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "coklatmanis";
    private static Connection connection;
    
       public static Connection getConnection() {
        try {
            if (connection == null) {
                // Membuat koneksi ke database
                connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }
       
      public static void closeConnection() {
        try {
            if (connection != null && !connection.isClosed()) {
                connection.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
