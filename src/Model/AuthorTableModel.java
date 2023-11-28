package Model;

import javax.swing.table.AbstractTableModel;

import java.util.ArrayList;
import java.util.List;

public class AuthorTableModel extends AbstractTableModel {

    private List<AuthorModel> authors = new ArrayList<>();

    private String[] columnNames = {"ID Author", "Name", "Address", "Contact"};

    public AuthorTableModel(List<AuthorModel> authors) {
        this.authors = authors;
        fireTableDataChanged();

    }

    public void refresh(List<AuthorModel> updatedAuthors) {
        this.authors = updatedAuthors;
        fireTableDataChanged();
    }

    public void insert(AuthorModel author) {
        authors.add(author);
        fireTableDataChanged();
    }

    public void update(int row, AuthorModel author) {
        authors.add(author);
        fireTableDataChanged();
    }

    public void delete(int row) {
        authors.remove(row);
        fireTableDataChanged();
    }

    public AuthorModel get(int row) {
        return authors.get(row);
    }

    @Override
    public int getRowCount() {
        return authors.size();
    }

    @Override
    public int getColumnCount() {
        return columnNames.length;
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        AuthorModel author = authors.get(rowIndex);
        switch (columnIndex) {
            case 0:
                return author.getIdAuthor(); 
            case 1:
                return author.getName();
            case 2:
                return author.getAddress();
            case 3:
                return author.getContact();

            default:
                return null;
        }
    }

    public String getColumnName(int column) {
        return columnNames[column];
    }

    public void setValueAt(Object value, int rowIndex, int colIndex) {
        AuthorModel author = authors.get(rowIndex);

        switch (colIndex) {
            case 0:
                author.setIdAuthor((String) value);
                break;
            case 1:
                author.setName((String) value);
                break;
            case 2:
                author.setAddress((String) value);
                break;
            case 3:
                author.setContact((String) value);
                break;
            default:
                throw new AssertionError();
        }
    }

}
