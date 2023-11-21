/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.AuthorModel;
import Model.AuthorTableModel;
import View.DashboardView;
import static View.DashboardView.authorScrollPane;
import java.sql.*; 
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;




public class AuthorController {
    
AuthorTableModel authorTable; 

public AuthorController(AuthorTableModel authorTable)
{
    this.authorTable = authorTable; 
}



 
    
    public void setCostumTable()
   {
       table.TableCustom.apply(authorScrollPane, table.TableCustom.TableType.MULTI_LINE);
       
   }
    
    
    public void loadData(DashboardView view)
    {
        try {
            PreparedStatement statement;
            ResultSet result; 
            String query = "select * from author"; 
            
            statement = koneksi.getConnection().prepareStatement(query); 
            
            result = statement.executeQuery(query); 
            
            List<AuthorModel> list = new ArrayList<>(); 
            
            while(result.next()){
                
                AuthorModel author = new AuthorModel(); 
                author.setName(result.getString("name"));
                author.setAddress(result.getString("address"));
                author.setContact(result.getString("contact"));
                list.add(author); 
            }
            
            authorTable.setList(list);
        } catch (Exception e) {
        }
    }
    
}
