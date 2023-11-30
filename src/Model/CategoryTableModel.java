/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author openjournaltheme
 */
public class CategoryTableModel extends AbstractTableModel {
    
    private List<CategoryModel> categories = new ArrayList<>();

    private String[] columnNames = {"ID Category", "Name"};

    public CategoryTableModel(List<CategoryModel> Categories) {
        this.categories = Categories;
        fireTableDataChanged();

    }

    public void refresh(List<CategoryModel> categories) {
        this.categories = categories;
        fireTableDataChanged();
    }

    public void insert(CategoryModel category) {
        categories.add(category);
        fireTableDataChanged();
    }

    public void update(int row, CategoryModel category) {
        categories.add(category);
        fireTableDataChanged();
    }

    public void delete(int row) {
        categories.remove(row);
        fireTableDataChanged();
    }

    public CategoryModel get(int row) {
        return categories.get(row);
    }

    @Override
    public int getRowCount() {
        return categories.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        CategoryModel category = categories.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return category.getIDCategory(); 
            case 1:
                return category.getName();
            default:
                return null;
        }
    }

    public String getColumnName(int column) {
        return columnNames[column];
    }

    public void setValueAt(Object value, int rowIndex, int colIndex) {
        CategoryModel category = categories.get(rowIndex);

        switch (colIndex) {
            case 0:
                category.setIDCategory((String) value);
                break;
            case 1:
                category.setName((String) value);
                break;
            default:
                throw new AssertionError();
        }
    }
    
}
