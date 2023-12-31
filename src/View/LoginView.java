/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;

import Controller.LoginController;
import Model.LoginModel;
import java.util.ArrayList;
import textfield.PasswordField;
import textfield.TextField;

/**
 *
 * @author kahfi
 */
public class LoginView extends javax.swing.JFrame {

    LoginController login = new LoginController(this);

    /**
     * Creates new form Login
     */
    public LoginView() {
        initComponents();
        login.setRolesToComboBox();
    }
    

    public TextField getFieldUsername() {
        return fieldUsername;
    }

    public PasswordField getFieldPassword() {
        return fieldPassword;
    }
    
     public static void clearFieldIfMatch(javax.swing.JTextField textField) {
        if (textField.getText().equals(textField.getText())) {
            textField.setText("");
        }
    }
     
      public static void setDefaultTextIfEmpty(javax.swing.JTextField textField, String defaultText) {
        if (textField.getText().equals("")) {
            textField.setText(defaultText);
        }                                 
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        fieldUsername = new textfield.TextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        fieldPassword = new textfield.PasswordField();
        buttonGradient2 = new View.ButtonGradient();
        comboBoxRole = new combobox.Combobox();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setIcon(new javax.swing.ImageIcon("/home/kahfi/Downloads/holidays.png")); // NOI18N
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 110, 260, 350));
        jLabel1.getAccessibleContext().setAccessibleName("");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Lohit Devanagari", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(108, 146, 229));
        jLabel2.setText("Hi, Welcome!");

        jLabel3.setFont(new java.awt.Font("Lohit Devanagari", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("<html>\nTo keep connected with us please login with your personal <br>\ninformation by username, password and access controll\n</html>");

        fieldUsername.setText("Username");
        fieldUsername.setFont(new java.awt.Font("Lohit Devanagari", 0, 13)); // NOI18N
        fieldUsername.setLabelText("");
        fieldUsername.setLineColor(new java.awt.Color(35, 81, 251));
        fieldUsername.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldUsernameFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldUsernameFocusLost(evt);
            }
        });
        fieldUsername.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fieldUsernameKeyReleased(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon("/home/kahfi/Downloads/user.png")); // NOI18N

        jLabel5.setIcon(new javax.swing.ImageIcon("/home/kahfi/Downloads/padlock.png")); // NOI18N

        fieldPassword.setText("passwordField1");
        fieldPassword.setLabelText("");
        fieldPassword.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                fieldPasswordFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                fieldPasswordFocusLost(evt);
            }
        });

        buttonGradient2.setBackground(new java.awt.Color(0, 51, 255));
        buttonGradient2.setText("Login ");
        buttonGradient2.setColor2(new java.awt.Color(108, 146, 229));
        buttonGradient2.setFocusable(false);
        buttonGradient2.setFont(new java.awt.Font("Liberation Mono", 1, 13)); // NOI18N
        buttonGradient2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonGradient2ActionPerformed(evt);
            }
        });

        comboBoxRole.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Login as" }));
        comboBoxRole.setAlignmentX(0.0F);
        comboBoxRole.setAlignmentY(0.0F);
        comboBoxRole.setLabeText("");
        comboBoxRole.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                comboBoxRoleMouseClicked(evt);
            }
        });

        jLabel7.setIcon(new javax.swing.ImageIcon("/home/kahfi/Downloads/management (1).png")); // NOI18N

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(63, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4)
                                .addComponent(jLabel5))
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(comboBoxRole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fieldUsername, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(fieldPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)))
                    .addComponent(buttonGradient2, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(119, 119, 119)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(fieldUsername, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fieldPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(comboBoxRole, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(37, 37, 37)
                .addComponent(buttonGradient2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(140, Short.MAX_VALUE))
        );

        jPanel1.add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 10, 460, 590));

        getContentPane().add(jPanel1, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonGradient2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonGradient2ActionPerformed
        // TODO add your handling code here:
        login.checkLogin();
    }//GEN-LAST:event_buttonGradient2ActionPerformed

    private void fieldUsernameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fieldUsernameKeyReleased

    }//GEN-LAST:event_fieldUsernameKeyReleased

    private void fieldUsernameFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldUsernameFocusGained
        clearFieldIfMatch(fieldUsername);
    }//GEN-LAST:event_fieldUsernameFocusGained

    private void fieldUsernameFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldUsernameFocusLost
        setDefaultTextIfEmpty(fieldUsername, "Username");
    }//GEN-LAST:event_fieldUsernameFocusLost

    private void fieldPasswordFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldPasswordFocusGained
        clearFieldIfMatch(fieldPassword);
    }//GEN-LAST:event_fieldPasswordFocusGained

    private void fieldPasswordFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_fieldPasswordFocusLost
        setDefaultTextIfEmpty(fieldPassword, "Password");
    }//GEN-LAST:event_fieldPasswordFocusLost

    private void comboBoxRoleMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_comboBoxRoleMouseClicked
      String roles =  comboBoxRole.getSelectedItem().toString(); 
    }//GEN-LAST:event_comboBoxRoleMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private View.ButtonGradient buttonGradient2;
    public combobox.Combobox comboBoxRole;
    public textfield.PasswordField fieldPassword;
    public static textfield.TextField fieldUsername;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
