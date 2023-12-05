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
 * @author J
 */
public class JournalTableModel extends AbstractTableModel {

    private List<JournalModel> journals = new ArrayList<>();

    private String[] columnNames = {"ID", "Title", "Author", "Category", "Publication Date"};

    public JournalTableModel(List<JournalModel> journals) {
        this.journals = journals;
        fireTableDataChanged();
    }

    public void refresh(List<JournalModel> journals) {
        this.journals = journals;
        fireTableDataChanged();
    }

    public void insert(JournalModel journals) {
        this.journals.add(journals);
        fireTableDataChanged();
    }

    public void update(int row, JournalModel journals) {
        this.journals.add(journals);
        fireTableDataChanged();
    }

    public void delete(int row) {
        this.journals.remove(row);
        fireTableDataChanged();
    }

    public JournalModel get(int row) {
        return journals.get(row);
    }

    @Override
    public int getRowCount() {
        return journals.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        JournalModel journal = journals.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return journal.getId();
            case 1:
                return journal.getTitle();
            case 2:
                return journal.getAuthor_id();
            case 3:
                return journal.getCategory_id();
            case 4:
                return journal.getPublication_date();
            default:
                return null;
        }
    }
    
      public String getColumnName(int column) {
        return columnNames[column];
    }



}
