/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Controller.koneksi;
import java.sql.*; 
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author kahfi
 */
public class AuthorModel {
    private String name; 
    private String address; 
    private String contact; 
    
    Connection connection; 
    

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }
    
  public void insertData() {
    this.connection = koneksi.getConnection();
    PreparedStatement statement = null;

    try {
        statement = connection.prepareStatement("INSERT INTO author (name, address, contact) VALUES (?, ?, ?)");
        statement.setString(1, getName());
        statement.setString(2, getAddress());
        statement.setString(3, getContact());

        // Menggunakan executeUpdate karena ini adalah operasi INSERT
        int rowsAffected = statement.executeUpdate();

        if (rowsAffected > 0) {
            JOptionPane.showMessageDialog(null, "Author successfully inserted!");
        } else {
            JOptionPane.showMessageDialog(null, "Failed to insert author.");
        }
    } catch (SQLException e) {
        e.printStackTrace(); // Ini akan mencetak informasi kesalahan ke konsol
        JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
    } finally {
        // Pastikan untuk menutup statement setelah digunakan
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}
  
  public List<AuthorModel> getAuthor()
  {
      List<AuthorModel> authors = null; 
      
      try {
          connection = koneksi.getConnection(); 
          PreparedStatement statement = connection.prepareStatement("select * from author");
          ResultSet resultSet = statement.executeQuery(); 
          
          while(resultSet.next()){
            AuthorModel author = new AuthorModel();
            author.setName(resultSet.getString("name"));
            author.setAddress(resultSet.getString("address"));
            author.setContact(resultSet.getString("contact"));
            authors.add(author); 
          }
      } catch (Exception e) {
             e.printStackTrace();
      }
      
      return authors; 
  }
  
  

}
