/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.AuthorModel;
import Model.AuthorTableModel;
import View.DashboardView;
import static View.DashboardView.authorScrollPane;
import java.awt.Dimension;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;
import raven.alerts.MessageAlerts;
import raven.popup.GlassPanePopup;

public class AuthorController {

    AuthorTableModel authorTable;
    DashboardView dashboardView;
    AuthorModel authorModel;

    public AuthorController(DashboardView dashboardView) {
        this.dashboardView = dashboardView;
        this.authorModel = new AuthorModel();
        table.TableCustom.apply(authorScrollPane, table.TableCustom.TableType.MULTI_LINE);

    }

    public void loadData() {
        try {
            AuthorTableModel authorTable = new AuthorTableModel(authorModel.getAuthor());
            dashboardView.authorTable.setModel(authorTable);
        } catch (Exception e) {
        }
    }
    
    public void cleanData()
    {
        dashboardView.fieldName.setText(""); 
        dashboardView.fieldAddress.setText(""); 
        dashboardView.fieldContact.setText("");
        
    }

    public void insertData() {

        String nama = dashboardView.fieldName.getText();
        String contact = dashboardView.fieldContact.getText();
        String address = dashboardView.fieldAddress.getText();
        

        if (nama.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Field name is required");
            return; 

        } 
        if (contact.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Field contact is required");
            return; 

        }
        if (address.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Field address is required");
            return; 
        }
        
        authorModel.setName(nama);
        authorModel.setAddress(address);   
        authorModel.setContact(contact);

        if (authorModel.insertData()) {
           JOptionPane.showMessageDialog(null, "Succesfully");
           loadData();
           dashboardView.setActivePanel(dashboardView.authorPanel);
        }

    }

}
