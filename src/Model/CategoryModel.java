/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Controller.koneksi;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author openjournaltheme
 */
public class CategoryModel {

    private String name;
    private String IDCategory;
    private String description; 

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getSearch() {
        return search;
    }

    public void setSearch(String search) {
        this.search = search;
    }
    private String search;

    public String getIDCategory() {
        return IDCategory;
    }

    public void setIDCategory(String IDCategory) {
        this.IDCategory = IDCategory;
    }

    Connection connection;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean insertData() {
        this.connection = koneksi.getConnection();
        PreparedStatement statement = null;

        try {
            statement = connection.prepareStatement("INSERT INTO category (name, description) VALUES (?, ?)");
            statement.setString(1, getName());
            statement.setString(2, getDescription());

            // Menggunakan executeUpdate karena ini adalah operasi INSERT
            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                return true;
            }

            JOptionPane.showMessageDialog(null, "Failed to insert category.");
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
            statement = connection.prepareStatement("update category set name=?, description=? where id=?");
            statement.setString(1, getName());
            statement.setString(2, getDescription());
            statement.setString(3, getIDCategory());

            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                return true;
            }

            JOptionPane.showMessageDialog(null, "Failed to update category");
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
            statement = connection.prepareStatement("delete from category where id=?");
            statement.setString(1, getIDCategory());

            int rowsAffected = statement.executeUpdate();

            if (rowsAffected > 0) {
                return true;
            }

            JOptionPane.showMessageDialog(null, "Failed to delete category");
            return false;
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Error: " + e.getMessage());
            return false;

        }

    }
    
     public List<CategoryModel> getCategory() {
        List<CategoryModel> category = new ArrayList<>();

        try {
            this.connection = koneksi.getConnection();

            // Tentukan query dasar tanpa kondisi pencarian
            String query = "SELECT * FROM category";

            // Jika getSearch() tidak kosong, tambahkan kondisi pencarian
            if (getSearch() != null && !getSearch().isEmpty()) {
                query += " WHERE name LIKE ?";
            }

            PreparedStatement statement = connection.prepareStatement(query);

            // Jika getSearch() tidak kosong, set nilai parameter pencarian
            if (getSearch() != null && !getSearch().isEmpty()) {
                statement.setString(1, "%" + getSearch() + "%");
            }

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                CategoryModel categories = new CategoryModel(); 
                categories.setName(resultSet.getString("name"));
                categories.setDescription(resultSet.getString("description"));
                categories.setIDCategory(resultSet.getString("id"));
                category.add(categories); 
//                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return category;
    }
    
  


}
