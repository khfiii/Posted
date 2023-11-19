package Controller;

import Model.LoginModel;
import View.LoginView;
import javax.swing.JOptionPane;

public class LoginController {

    private LoginView data;
    private LoginModel model;

    public LoginController(LoginView data) {
        this.data = data;
        this.model = new LoginModel();
    }

    // Metode untuk mengisi comboBoxRole dengan data roles dari model
    public void setRolesToComboBox() {
        // Ambil data roles dari model
        model = new LoginModel();
        data.comboBoxRole.removeAllItems(); // Hapus semua item sebelum menambahkan yang baru
        for (String role : model.getRoles()) {
            // Tambahkan setiap role ke comboBoxRole
            data.comboBoxRole.addItem(role);
        }
    }

    public void checkLogin() {
        String username = data.getFieldUsername().getText();
        String password = data.getFieldPassword().getText();
        int roleId = data.comboBoxRole.getSelectedIndex() + 1; // Ambil role id dari index combo box
        
        System.out.println(roleId);

        model.setUsername(username);
        model.setPassword(password);
        model.setRoleID(roleId);

        model.tryToLogin();
    }
}
