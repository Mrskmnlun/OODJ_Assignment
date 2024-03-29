/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package online_shopping_mangement;

/**
 *
 * @author ASUS
 */
public class AdminMainPage extends javax.swing.JFrame {

    /**
     * Creates new form AdminMainPage
     */
    public AdminMainPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nav = new javax.swing.JPanel();
        resortroombookingsystem = new javax.swing.JLabel();
        logoutbutton = new javax.swing.JButton();
        manageuser = new javax.swing.JButton();
        managecategory = new javax.swing.JButton();
        manageproduct = new javax.swing.JButton();
        vieworder = new javax.swing.JButton();
        delivery = new javax.swing.JButton();
        welcome = new javax.swing.JLabel();
        welcome1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Admin Main Page");

        nav.setBackground(new java.awt.Color(255, 204, 51));

        resortroombookingsystem.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        resortroombookingsystem.setForeground(new java.awt.Color(255, 255, 255));
        resortroombookingsystem.setText("Admin Main Page");

        logoutbutton.setBackground(new java.awt.Color(255, 255, 204));
        logoutbutton.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        logoutbutton.setForeground(new java.awt.Color(51, 51, 51));
        logoutbutton.setText("Log Out");
        logoutbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logoutbuttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navLayout = new javax.swing.GroupLayout(nav);
        nav.setLayout(navLayout);
        navLayout.setHorizontalGroup(
            navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navLayout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addComponent(resortroombookingsystem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(logoutbutton)
                .addGap(59, 59, 59))
        );
        navLayout.setVerticalGroup(
            navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resortroombookingsystem)
                    .addComponent(logoutbutton))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        manageuser.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        manageuser.setText("Manage User");
        manageuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageuserActionPerformed(evt);
            }
        });

        managecategory.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        managecategory.setText("Manage Category");
        managecategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                managecategoryActionPerformed(evt);
            }
        });

        manageproduct.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        manageproduct.setText("Manage Product");
        manageproduct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                manageproductActionPerformed(evt);
            }
        });

        vieworder.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        vieworder.setText("View Order & Payment");
        vieworder.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                vieworderActionPerformed(evt);
            }
        });

        delivery.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        delivery.setText("Delivery");
        delivery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deliveryActionPerformed(evt);
            }
        });

        welcome.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        welcome.setText("Welcome !");

        welcome1.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        welcome1.setText("Please select a function:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(156, 156, 156)
                        .addComponent(delivery, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(vieworder))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(manageuser, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(managecategory, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56)
                        .addComponent(manageproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(232, 232, 232)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(68, 68, 68)
                                .addComponent(welcome))
                            .addComponent(welcome1))))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(nav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(welcome)
                .addGap(26, 26, 26)
                .addComponent(welcome1)
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(managecategory, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageproduct, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(manageuser, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 60, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(delivery, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(vieworder, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void logoutbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logoutbuttonActionPerformed
        AdminLogin sp = new AdminLogin();
        sp.setVisible(true);
        dispose();
    }//GEN-LAST:event_logoutbuttonActionPerformed

    private void manageuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageuserActionPerformed
        ManageUser mu = new ManageUser();
        mu.setVisible(true);
        dispose();
    }//GEN-LAST:event_manageuserActionPerformed

    private void managecategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_managecategoryActionPerformed
        ManageCategory mc = new ManageCategory();
        mc.setVisible(true);
        dispose();
    }//GEN-LAST:event_managecategoryActionPerformed

    private void manageproductActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_manageproductActionPerformed
        ManageProduct mp = new ManageProduct();
        mp.setVisible(true);
        dispose();
    }//GEN-LAST:event_manageproductActionPerformed

    private void vieworderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_vieworderActionPerformed
        ViewOrderAndPayment vo = new ViewOrderAndPayment();
        vo.setVisible(true);
        dispose();
    }//GEN-LAST:event_vieworderActionPerformed

    private void deliveryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deliveryActionPerformed
        AssignDelivery ad = new AssignDelivery();
        ad.setVisible(true);
        dispose();
    }//GEN-LAST:event_deliveryActionPerformed

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
            java.util.logging.Logger.getLogger(AdminMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AdminMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AdminMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AdminMainPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AdminMainPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delivery;
    private javax.swing.JButton logoutbutton;
    private javax.swing.JButton managecategory;
    private javax.swing.JButton manageproduct;
    private javax.swing.JButton manageuser;
    private javax.swing.JPanel nav;
    private javax.swing.JLabel resortroombookingsystem;
    private javax.swing.JButton vieworder;
    private javax.swing.JLabel welcome;
    private javax.swing.JLabel welcome1;
    // End of variables declaration//GEN-END:variables
}
