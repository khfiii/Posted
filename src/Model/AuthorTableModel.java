package Model;

import javax.swing.table.AbstractTableModel; 

import java.util.ArrayList;
import java.util.List;

public class AuthorTableModel extends AbstractTableModel {

private List<AuthorModel> authors = new ArrayList<>(); 

public void insert(AuthorModel author)
{
    authors.add(author); 
    fireTableDataChanged();
}

public void update(int row, AuthorModel author)
{
    authors.add(author); 
    fireTableDataChanged();
}

public void delete(int row)
{
    authors.remove(row);
    fireTableDataChanged();
}

public AuthorModel get(int row)
{
    return authors.get(row); 
}

public void setList(List<AuthorModel> authors)
{
    this.authors = authors; 
    fireTableDataChanged();
}

@Override
public int getRowCount()
{
    return authors.size(); 
}

    @Override
    public int getColumnCount() {
       return 4; 
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        switch (columnIndex) {
            case 0:
                return rowIndex + 1; 
            case 1: 
                return authors.get(rowIndex).getName();
            case 2:
                return authors.get(rowIndex).getAddress(); 
            case 3: 
                return authors.get(rowIndex).getContact(); 
    
            default:
                return null;
        }
    }
    
    public String getColumnName(int column)
    {
        switch (column) {
            case 0:
                return "No"; 
            case 1:
                return "Name"; 
            case 2:
                return "Address"; 
            case 3:
                return "Contact"; 
            default:
                return null; 
        }
    }



    



 
}

