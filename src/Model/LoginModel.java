/*c
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import Controller.koneksi;
import View.LoginView;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet; 
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author kahfi
 */
public class LoginModel {
    private String username; 
    private String password;
    private int roleId; 


    Connection connection; 
    


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public int getRoleId() {
        return roleId;
    }

    public void setRoleID(int role) {
        this.roleId = role;
    }
    
    public void tryToLogin()
    {
        this.connection = koneksi.getConnection(); 
        PreparedStatement statement = null;
        ResultSet resultSet = null; 
        
        try {
            statement = connection.prepareStatement("SELECT user.id AS user_id, user.username, user.role_id, role.name AS role_name " +
                           "FROM user " +
                           "JOIN role ON user.role_id = role.id " +
                           "WHERE user.username = ? AND user.password = ? AND user.role_id = ?;"); 
            statement.setString(1, this.getUsername());
            statement.setString(2, this.getPassword());
            statement.setInt(3, this.getRoleId());

            resultSet = statement.executeQuery(); 
            
            if(!resultSet.next()){
                JOptionPane.showMessageDialog(null, "Login gagal");
                return; 
                
            }
            
            
            JOptionPane.showMessageDialog(null, "Login berhasil");
        } catch (SQLException e) {
            
        JOptionPane.showMessageDialog(null, e);
        }
    }

    
    public ArrayList<String> getRoles() {
        ArrayList<String> rolesList = new ArrayList<>();

        try {
            connection = koneksi.getConnection();
            PreparedStatement statement = connection.prepareStatement("SELECT name FROM role");
            ResultSet resultSet = statement.executeQuery();

            while (resultSet.next()) {
                rolesList.add(resultSet.getString("name"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }

        return rolesList;
    }

    
    
    
      
    
}
