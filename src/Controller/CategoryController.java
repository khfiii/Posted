/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.AuthorTableModel;
import Model.CategoryModel;
import Model.CategoryTableModel;
import View.DashboardView;
import static View.DashboardView.authorScrollPane;
import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author openjournaltheme
 */
public class CategoryController {

    DashboardView dashboardView;
    CategoryModel category;

    private String IDCategory;

    public CategoryController(DashboardView dashboardView) {
        this.dashboardView = dashboardView;
        this.category = new CategoryModel();
        table.TableCustom.apply(dashboardView.categoryScrollPanel, table.TableCustom.TableType.MULTI_LINE);

    }

    public void loadData() {
        try {
            CategoryTableModel categoryTableModel = new CategoryTableModel(category.getCategory());
            dashboardView.categoryTable.setModel(categoryTableModel);
        } catch (Exception e) {
        }
    }

    public void insertOperation() {
        dashboardView.fieldCategoryName.setText("");
        dashboardView.fieldCategoryDesciption.setText("");

        dashboardView.categoryLabel.setText("Create Category");
        dashboardView.categoryOperationButton.setText("Create");

        dashboardView.categoryOperationCancel.setText("Cancel");

        dashboardView.categoryOperationCancel.setBackground(new Color(204, 204, 204));

        dashboardView.setActivePanel(dashboardView.CreateCategoryPanel);

    }

    public void doOperationCancel() {
        if (dashboardView.categoryOperationCancel.getText().equals("Delete")) {
            deleteData();
        } else if (dashboardView.categoryOperationCancel.getText().equals("Cancel")) {
            dashboardView.setActivePanel(dashboardView.categoryPanel);
        }
    }

    public void insertData() {

        String nama = dashboardView.fieldCategoryName.getText();
        String description = dashboardView.fieldCategoryDesciption.getText();

        if (nama.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Field name is required");
            return;

        }
        if (description.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Field description is required");
            return;

        }

        category.setName(nama);
        category.setDescription(description);

        if (category.insertData()) {
            JOptionPane.showMessageDialog(null, "Succesfully");
            loadData();
            dashboardView.setActivePanel(dashboardView.categoryPanel);
        }

    }

    public void fillData() {
        int row = dashboardView.categoryTable.getSelectedRow();
        this.IDCategory = dashboardView.categoryTable.getModel().getValueAt(row, 0).toString();
        String name = dashboardView.categoryTable.getModel().getValueAt(row, 1).toString();
        String description = dashboardView.categoryTable.getModel().getValueAt(row, 2).toString();

        dashboardView.setActivePanel(dashboardView.CreateCategoryPanel);
        dashboardView.categoryLabel.setText("Edit Category");

        dashboardView.fieldCategoryName.setText(name);
        dashboardView.fieldCategoryDesciption.setText(description);

        dashboardView.categoryOperationButton.setText("Edit");

        dashboardView.categoryOperationCancel.setText("Delete");

        dashboardView.categoryOperationCancel.setBackground(Color.YELLOW);

    }

    public void editData() {

        String nama = dashboardView.fieldCategoryName.getText();
        String description = dashboardView.fieldCategoryDesciption.getText();

        category.setName(nama);
        category.setDescription(description);
        category.setIDCategory(IDCategory);

        if (category.updateData()) {
            JOptionPane.showMessageDialog(null, "Succesfully");
            loadData();
            dashboardView.setActivePanel(dashboardView.categoryPanel);
        }

    }

    public void doOperation() {
        if (dashboardView.categoryOperationButton.getText().equals("Create")) {
            insertData();
        } else if (dashboardView.categoryOperationCancel.getText().equals("Edit")) {
            editData();
        }

    }

    public void deleteData() {

        int confirm = JOptionPane.showConfirmDialog(null, "Are you sure to perform this action?");

        if (confirm == JOptionPane.YES_OPTION) {
            category.setIDCategory(IDCategory);

            if (category.deleteData()) {
                JOptionPane.showMessageDialog(null, "Succesfully");
                loadData();
                dashboardView.setActivePanel(dashboardView.categoryPanel);
            }
        }

    }

}
