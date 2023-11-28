/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Controller.AuthorController;
import Controller.koneksi;
import View.DashboardView;
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
    private String idAuthor;
    
    private String search; 

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }

    public String getIdAuthor() {
        return idAuthor;
    }

    public void setIdAuthor(String idAuthor) {
        this.idAuthor = idAuthor;
    }

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

    public boolean insertData() {
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
                return true;
            }

            JOptionPane.showMessageDialog(null, "Failed to insert author.");
            return false; // Explicitly return false if the insertion fails
        } catch (SQLException e) {
            e.printStackTrace(); // Ini akan mencetak informasi kesalahan ke konsol
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            return false; // Return false in case of SQLException
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

    public boolean updateData() {
        this.connection = koneksi.getConnection();
        PreparedStatement statement = null;

        try {
            statement = connection.prepareStatement("update author set name=?, address=?, contact=? where id=?");
            statement.setString(1, getName());
            statement.setString(2, getAddress());
            statement.setString(3, getContact());
            statement.setString(4, getIdAuthor());

            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                return true;
            }

            JOptionPane.showMessageDialog(null, "Failed to insert author.");
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            return false;

        }

    }

    public boolean deleteData() {
        this.connection = koneksi.getConnection();
        PreparedStatement statement = null;

        try {
            statement = connection.prepareStatement("delete from author where id=?");
            statement.setString(1, getIdAuthor());

            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                return true;
            }

            JOptionPane.showMessageDialog(null, "Failed to delete author.");
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            return false;

        }

    }

   public List<AuthorModel> getAuthor() {
    List<AuthorModel> authors = new ArrayList<>();

    try {
        this.connection = koneksi.getConnection();

        // Tentukan query dasar tanpa kondisi pencarian
        String query = "SELECT * FROM author order by name asc";

        // Jika getSearch() tidak kosong, tambahkan kondisi pencarian
        if (getSearch() != null && !getSearch().isEmpty()) {
            query += " WHERE name LIKE ? or address like? or contact like?";
        }

        PreparedStatement statement = connection.prepareStatement(query);

        // Jika getSearch() tidak kosong, set nilai parameter pencarian
        if (getSearch() != null && !getSearch().isEmpty()) {
            statement.setString(1, "%" + getSearch() + "%");
            statement.setString(2, "%" + getSearch() + "%");
            statement.setString(3, "%" + getSearch() + "%");
        }

        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            AuthorModel author = new AuthorModel();
            author.setName(resultSet.getString("name"));
            author.setAddress(resultSet.getString("address"));
            author.setContact(resultSet.getString("contact"));
            author.setIdAuthor(resultSet.getString("id"));
            authors.add(author);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }

    return authors;
}

}
