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

/**
 *
 * @author openjournaltheme
 */
public class CategoryController {
    
    DashboardView view; 
    CategoryModel category; 
    
    public CategoryController(DashboardView view){
        this.view = view; 
        this.category = new CategoryModel(); 
        table.TableCustom.apply(view.categoryScrollPanel, table.TableCustom.TableType.MULTI_LINE);
        
    }
    
     public void loadData() {
        try {
            
//            String getSearch = dashboard.fieldSearchAuthor.getText(); 
//            authorModel.setSearch(getSearch);
            
            
            CategoryTableModel categoryTableModel = new CategoryTableModel(category.getCategory());
            view.categoryTable.setModel(categoryTableModel);
        } catch (Exception e) {
        }
    }

    
}
