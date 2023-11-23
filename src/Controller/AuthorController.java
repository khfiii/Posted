/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controller;

import Model.AuthorModel;
import Model.AuthorTableModel;
import View.AuthorView;
import View.DashboardView;
import static View.DashboardView.authorScrollPane;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class AuthorController {

    AuthorTableModel authorTable;
    DashboardView dashboardView;

    public AuthorController(DashboardView dashboardView) {
        this.dashboardView = dashboardView;
        table.TableCustom.apply(authorScrollPane, table.TableCustom.TableType.MULTI_LINE);

    }

    public void loadData() {
        try {
            PreparedStatement statement;
            ResultSet result;
            String query = "select * from author order by name asc";

            statement = koneksi.getConnection().prepareStatement(query);

            result = statement.executeQuery(query);

            List<AuthorModel> list = new ArrayList<>();

            while (result.next()) {

                AuthorModel author = new AuthorModel();
                author.setName(result.getString("name"));
                author.setAddress(result.getString("address"));
                author.setContact(result.getString("contact"));
                list.add(author);
            }

            AuthorTableModel authorTable = new AuthorTableModel(list);
            dashboardView.authorTable.setModel(authorTable);
            

        } catch (Exception e) {
        }
    }

    public void saveData(AuthorView authorView) {
        String nama = authorView.fieldAuthor.getText();
        String address = authorView.fieldAddress.getText();
        String contact = authorView.fieldContact.getText();

        AuthorModel model = new AuthorModel();

        model.setName(nama);
        model.setAddress(address);
        model.setContact(contact);

        model.insertData();

        authorView.dispose();
       

    }



}
