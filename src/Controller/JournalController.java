/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.JournalModel;
import Model.JournalTableModel;
import View.DashboardView;

/**
 *
 * @author J
 */
public class JournalController {
    
    DashboardView dashboardView; 
    JournalModel journal;
    
    public JournalController(DashboardView dashboardView)
    {
        this.dashboardView = dashboardView; 
        this.journal = new JournalModel();
        table.TableCustom.apply(dashboardView.journalScrollPanel, table.TableCustom.TableType.MULTI_LINE);
        
    }
    
    public void loadData()
    {
        try {
            JournalTableModel journalTableModel = new JournalTableModel(journal.getJournal()); 
            dashboardView.journalTable.setModel(journalTableModel);
        } catch (Exception e) {
        }
    }
    
}
