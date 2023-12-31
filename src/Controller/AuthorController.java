/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.AuthorModel;
import Model.AuthorTableModel;
import View.DashboardView;
import static View.DashboardView.authorScrollPane;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class AuthorController {

    AuthorTableModel authorTable;
    DashboardView dashboardView;
    AuthorModel authorModel;

    private String IDAuthor;

    public AuthorController(DashboardView dashboardView) {
        this.dashboardView = dashboardView;
        this.authorModel = new AuthorModel();
        table.TableCustom.apply(authorScrollPane, table.TableCustom.TableType.MULTI_LINE);

    }

    public void loadData() {
        try {
            
            String getSearch = dashboardView.fieldSearchAuthor.getText(); 
            authorModel.setSearch(getSearch);
            
            
            AuthorTableModel authorTable = new AuthorTableModel(authorModel.getAuthor());
            dashboardView.authorTable.setModel(authorTable);
        } catch (Exception e) {
        }
    }

    public void insertOperation() {
        dashboardView.fieldAuthorName.setText("");
        dashboardView.fieldAuthorAddress.setText("");
        dashboardView.fieldAuthorContact.setText("");

        dashboardView.authorLabel.setText("Create Author");
        dashboardView.authorOperationButton.setText("Create");

        dashboardView.authorOperationCancel.setText("Cancel");

        dashboardView.authorOperationCancel.setBackground(new Color(204, 204, 204));
        
        dashboardView.setActivePanel(dashboardView.CreateAuthorPanel);

    }

    public void insertData() {

        String nama = dashboardView.fieldAuthorName.getText();
        String contact = dashboardView.fieldAuthorContact.getText();
        String address = dashboardView.fieldAuthorAddress.getText();

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
        authorModel.setEmail(contact);

        if (authorModel.insertData()) {
            JOptionPane.showMessageDialog(null, "Succesfully");
            loadData();
            dashboardView.setActivePanel(dashboardView.authorPanel);
        }

    }

    public void editData() {

        String nama = dashboardView.fieldAuthorName.getText();
        String contact = dashboardView.fieldAuthorContact.getText();
        String address = dashboardView.fieldAuthorAddress.getText();

        authorModel.setName(nama);
        authorModel.setAddress(address);
        authorModel.setEmail(contact);
        authorModel.setIdAuthor(IDAuthor);

        if (authorModel.updateData()) {
            JOptionPane.showMessageDialog(null, "Succesfully");
            loadData();
            dashboardView.setActivePanel(dashboardView.authorPanel);
        }

    }

    public void deleteData() {

        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure to perform this action?");

        if (confirm == JOptionPane.YES_OPTION) {
            authorModel.setIdAuthor(IDAuthor);

            if (authorModel.deleteData()) {
                JOptionPane.showMessageDialog(null, "Succesfully");
                loadData();
                dashboardView.setActivePanel(dashboardView.authorPanel);
            }
        }

    }

    public void doOperation() {
        if (dashboardView.authorOperationButton.getText().equals("Create")) {
            insertData();
        } else if (dashboardView.authorOperationButton.getText().equals("Edit")) {
            editData();
        }

    }

    public void doOperationCancel() {
        if (dashboardView.authorOperationCancel.getText().equals("Delete")) {
            deleteData();
        } else if (dashboardView.authorOperationCancel.getText().equals("Cancel")) {
            dashboardView.setActivePanel(dashboardView.authorPanel);
        }
    }

    public void fillData() {
    
        int row = dashboardView.authorTable.getSelectedRow();
        this.IDAuthor = dashboardView.authorTable.getModel().getValueAt(row, 0).toString();
        String name = dashboardView.authorTable.getModel().getValueAt(row, 1).toString();
        String address = dashboardView.authorTable.getModel().getValueAt(row, 2).toString();
        String contact = dashboardView.authorTable.getModel().getValueAt(row, 3).toString();

        dashboardView.setActivePanel(dashboardView.CreateAuthorPanel);
        dashboardView.authorLabel.setText("Edit Author");

        dashboardView.fieldAuthorName.setText(name);
        dashboardView.fieldAuthorAddress.setText(address);
        dashboardView.fieldAuthorContact.setText(contact);

        dashboardView.authorOperationButton.setText("Edit");

        dashboardView.authorOperationCancel.setText("Delete");

        dashboardView.authorOperationCancel.setBackground(Color.YELLOW);

    }

}
