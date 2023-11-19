/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;
import java.sql.Connection; 

/**
 *
 * @author kahfi
 */
public class RoleModel {

    Connection connection; 
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    private String name; 
    
    
}
