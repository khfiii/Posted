/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import Controller.koneksi;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import java.sql.*; 
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author J
 */
public class JournalModel {

    private String Title;
    private String Abstract;
    private int author_id;
    private int category_id;
    private String id;
    
    Connection connection; 

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    private Date publication_date;

    public String getTitle() {
        return Title;
    }

    public void setTitle(String Title) {
        this.Title = Title;
    }

    public String getAbstract() {
        return Abstract;
    }

    public void setAbstract(String Abstract) {
        this.Abstract = Abstract;
    }

    public int getAuthor_id() {
        return author_id;
    }

    public void setAuthor_id(int author_id) {
        this.author_id = author_id;
    }

    public int getCategory_id() {
        return category_id;
    }

    public void setCategory_id(int category_id) {
        this.category_id = category_id;
    }

    public Date getPublication_date() {
        return publication_date;
    }

    public void setPublication_date(Date publication_date) {
        this.publication_date = publication_date;
    }

    public boolean insertData() {
        this.connection = koneksi.getConnection();
        PreparedStatement statement = null;

        try {
            statement = connection.prepareStatement("INSERT INTO journals (title, abstract, author_id, category_id, publication_date ) VALUES (?, ?, , ?, ?, ?)");
            statement.setString(1, getTitle());
            statement.setString(2, getAbstract());
            statement.setInt(3, getAuthor_id());
            statement.setInt(4, getCategory_id());

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
    
       public List<JournalModel> getJournal() {
        List<JournalModel> journal = new ArrayList<>();

        try {
            this.connection = koneksi.getConnection();

            // Tentukan query dasar tanpa kondisi pencarian
            String query = "SELECT * FROM journals";

            // Jika getSearch() tidak kosong, tambahkan kondisi pencarian
            
//            if (getSearch() != null && !getSearch().isEmpty()) {
//                query += " WHERE name LIKE ?";
//            }

            PreparedStatement statement = connection.prepareStatement(query);

            // Jika getSearch() tidak kosong, set nilai parameter pencarian
//            if (getSearch() != null && !getSearch().isEmpty()) {
//                statement.setString(1, "%" + getSearch() + "%");
//            }

            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                JournalModel journals = new JournalModel();
                journals.setId(resultSet.getString("id"));
                journals.setTitle(resultSet.getString("title"));
                journals.setAbstract(resultSet.getString("abstract"));
                journals.setAuthor_id(resultSet.getInt("author_id"));
                journals.setCategory_id(resultSet.getInt("category_id"));
                journals.setPublication_date(resultSet.getDate("publication_date"));
                journal.add(journals); 
//                
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return journal;
    }

}
