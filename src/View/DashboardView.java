/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package View;


import Controller.AuthorController;
import Controller.koneksi;
import Model.AuthorTableModel;
import java.sql.*; 
import dynamic_subjtable.TableCustom;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author kahfi
 */
public class DashboardView extends javax.swing.JFrame {

    
    public DashboardView() {
        initComponents();
        authorData();
  

    }
   
    
    
    private void setPanelAndButton(View.Button activeButton, JPanel activePanel) {
    // Mengatur panel-panel yang terlibat
    dashboardPanel.setVisible(activePanel == dashboardPanel);
    jurnalPanel.setVisible(activePanel == jurnalPanel);
    categoryPanel.setVisible(activePanel == categoryPanel);
    authorPanel.setVisible(activePanel == authorPanel);
    settingPanel.setVisible(activePanel == settingPanel);

    // Mengatur warna tombol-tombol
    dashboardButton.setBackground(activeButton == dashboardButton ? new Color(153, 153, 255) : new Color(255, 255, 255));
    jurnalButton.setBackground(activeButton == jurnalButton ? new Color(153, 153, 255) : new Color(255, 255, 255));
    categoryButton.setBackground(activeButton == categoryButton ? new Color(153, 153, 255) : new Color(255, 255, 255));
    authorButton.setBackground(activeButton == authorButton ? new Color(153, 153, 255) : new Color(255, 255, 255));
    settingButton.setBackground(activeButton == settingButton ? new Color(153, 153, 255) : new Color(255, 255, 255));
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
        SidePanel = new javax.swing.JPanel();
        dashboardButton = new View.Button();
        jurnalButton = new View.Button();
        categoryButton = new View.Button();
        settingButton = new View.Button();
        authorButton = new View.Button();
        mainPanel = new javax.swing.JPanel();
        dashboardPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jurnalPanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        categoryPanel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        authorPanel = new javax.swing.JPanel();
        authorScrollPane = new javax.swing.JScrollPane();
        authorTable = new dynamic_subjtable.TableCustom();
        newAuthorButton = new View.Button();
        newAuthorButton1 = new View.Button();
        settingPanel = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new java.awt.CardLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        SidePanel.setBackground(new java.awt.Color(255, 255, 255));
        SidePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        dashboardButton.setBackground(new java.awt.Color(153, 153, 255));
        dashboardButton.setForeground(new java.awt.Color(0, 0, 0));
        dashboardButton.setIcon(new javax.swing.ImageIcon("/home/kahfi/Downloads/home.png")); // NOI18N
        dashboardButton.setText("   Home");
        dashboardButton.setSelected(true);
        dashboardButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dashboardButtonMouseClicked(evt);
            }
        });
        dashboardButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dashboardButtonActionPerformed(evt);
            }
        });
        SidePanel.add(dashboardButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(6, 155, 160, -1));

        jurnalButton.setForeground(new java.awt.Color(0, 0, 0));
        jurnalButton.setIcon(new javax.swing.ImageIcon("/home/kahfi/Downloads/pen.png")); // NOI18N
        jurnalButton.setText("  Journals");
        jurnalButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jurnalButtonMouseClicked(evt);
            }
        });
        jurnalButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jurnalButtonActionPerformed(evt);
            }
        });
        SidePanel.add(jurnalButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 210, 140, -1));

        categoryButton.setForeground(new java.awt.Color(0, 0, 0));
        categoryButton.setIcon(new javax.swing.ImageIcon("/home/kahfi/Downloads/category.png")); // NOI18N
        categoryButton.setText("  Category");
        categoryButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                categoryButtonMouseClicked(evt);
            }
        });
        categoryButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryButtonActionPerformed(evt);
            }
        });
        SidePanel.add(categoryButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(16, 265, 140, -1));

        settingButton.setForeground(new java.awt.Color(0, 0, 0));
        settingButton.setIcon(new javax.swing.ImageIcon("/home/kahfi/Downloads/setting.png")); // NOI18N
        settingButton.setText(" Settings");
        settingButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                settingButtonMouseClicked(evt);
            }
        });
        settingButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                settingButtonActionPerformed(evt);
            }
        });
        SidePanel.add(settingButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 370, 150, -1));

        authorButton.setForeground(new java.awt.Color(0, 0, 0));
        authorButton.setIcon(new javax.swing.ImageIcon("/home/kahfi/Downloads/author.png")); // NOI18N
        authorButton.setText("  Authors");
        authorButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                authorButtonMouseClicked(evt);
            }
        });
        authorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                authorButtonActionPerformed(evt);
            }
        });
        SidePanel.add(authorButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 320, 150, -1));

        jPanel1.add(SidePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 170, 600));

        mainPanel.setLayout(new java.awt.CardLayout());

        jLabel1.setText("Dashboard");

        javax.swing.GroupLayout dashboardPanelLayout = new javax.swing.GroupLayout(dashboardPanel);
        dashboardPanel.setLayout(dashboardPanelLayout);
        dashboardPanelLayout.setHorizontalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addGap(0, 374, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(0, 374, Short.MAX_VALUE))
        );
        dashboardPanelLayout.setVerticalGroup(
            dashboardPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dashboardPanelLayout.createSequentialGroup()
                .addGap(0, 291, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(0, 292, Short.MAX_VALUE))
        );

        mainPanel.add(dashboardPanel, "card2");

        jLabel2.setText("Journal");

        javax.swing.GroupLayout jurnalPanelLayout = new javax.swing.GroupLayout(jurnalPanel);
        jurnalPanel.setLayout(jurnalPanelLayout);
        jurnalPanelLayout.setHorizontalGroup(
            jurnalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jurnalPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jurnalPanelLayout.setVerticalGroup(
            jurnalPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jurnalPanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        mainPanel.add(jurnalPanel, "card3");

        jLabel3.setText("Category");

        javax.swing.GroupLayout categoryPanelLayout = new javax.swing.GroupLayout(categoryPanel);
        categoryPanel.setLayout(categoryPanelLayout);
        categoryPanelLayout.setHorizontalGroup(
            categoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
            .addGroup(categoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(categoryPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        categoryPanelLayout.setVerticalGroup(
            categoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(categoryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(categoryPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel3)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        mainPanel.add(categoryPanel, "card4");

        authorPanel.setBackground(new java.awt.Color(255, 255, 255));

        authorTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        authorScrollPane.setViewportView(authorTable);

        newAuthorButton.setBackground(new java.awt.Color(153, 153, 255));
        newAuthorButton.setText("New Author");
        newAuthorButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAuthorButtonActionPerformed(evt);
            }
        });

        newAuthorButton1.setBackground(new java.awt.Color(153, 153, 255));
        newAuthorButton1.setText("Refresh");
        newAuthorButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newAuthorButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout authorPanelLayout = new javax.swing.GroupLayout(authorPanel);
        authorPanel.setLayout(authorPanelLayout);
        authorPanelLayout.setHorizontalGroup(
            authorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, authorPanelLayout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(authorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(authorPanelLayout.createSequentialGroup()
                        .addComponent(newAuthorButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(newAuthorButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(authorScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 745, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        authorPanelLayout.setVerticalGroup(
            authorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, authorPanelLayout.createSequentialGroup()
                .addContainerGap(90, Short.MAX_VALUE)
                .addGroup(authorPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(newAuthorButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(newAuthorButton1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(authorScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );

        mainPanel.add(authorPanel, "card5");

        jLabel5.setText("Setting");

        javax.swing.GroupLayout settingPanelLayout = new javax.swing.GroupLayout(settingPanel);
        settingPanel.setLayout(settingPanelLayout);
        settingPanelLayout.setHorizontalGroup(
            settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 810, Short.MAX_VALUE)
            .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(settingPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        settingPanelLayout.setVerticalGroup(
            settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
            .addGroup(settingPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(settingPanelLayout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        mainPanel.add(settingPanel, "card6");

        jPanel1.add(mainPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 0, 810, 600));

        getContentPane().add(jPanel1, "card2");

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void dashboardButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dashboardButtonActionPerformed
       
    }//GEN-LAST:event_dashboardButtonActionPerformed

    private void jurnalButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jurnalButtonActionPerformed
      
    }//GEN-LAST:event_jurnalButtonActionPerformed

    private void categoryButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryButtonActionPerformed
     
    }//GEN-LAST:event_categoryButtonActionPerformed

    private void settingButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_settingButtonActionPerformed
     

    }//GEN-LAST:event_settingButtonActionPerformed

    private void authorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_authorButtonActionPerformed
       

    }//GEN-LAST:event_authorButtonActionPerformed

    private void dashboardButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dashboardButtonMouseClicked

        setPanelAndButton(dashboardButton, dashboardPanel);
       
    }//GEN-LAST:event_dashboardButtonMouseClicked

    private void jurnalButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jurnalButtonMouseClicked

       setPanelAndButton(jurnalButton, jurnalPanel);
    
    }//GEN-LAST:event_jurnalButtonMouseClicked

    private void categoryButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_categoryButtonMouseClicked
        setPanelAndButton(categoryButton, categoryPanel);
       
    }//GEN-LAST:event_categoryButtonMouseClicked

    private void authorButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_authorButtonMouseClicked
        setPanelAndButton(authorButton, authorPanel);
    }//GEN-LAST:event_authorButtonMouseClicked

    private void settingButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_settingButtonMouseClicked
        setPanelAndButton(settingButton, settingPanel);
    }//GEN-LAST:event_settingButtonMouseClicked

    private void newAuthorButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAuthorButtonActionPerformed
       new AuthorView().setVisible(true);
    }//GEN-LAST:event_newAuthorButtonActionPerformed

    private void newAuthorButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newAuthorButton1ActionPerformed
 
    }//GEN-LAST:event_newAuthorButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel SidePanel;
    private View.Button authorButton;
    private javax.swing.JPanel authorPanel;
    public static javax.swing.JScrollPane authorScrollPane;
    public static dynamic_subjtable.TableCustom authorTable;
    private View.Button categoryButton;
    private javax.swing.JPanel categoryPanel;
    private View.Button dashboardButton;
    private javax.swing.JPanel dashboardPanel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private View.Button jurnalButton;
    private javax.swing.JPanel jurnalPanel;
    private javax.swing.JPanel mainPanel;
    public View.Button newAuthorButton;
    public View.Button newAuthorButton1;
    private View.Button settingButton;
    private javax.swing.JPanel settingPanel;
    // End of variables declaration//GEN-END:variables

      public void authorData()
    {
        
       new AuthorController(this).loadData(); 
        
    }


}
