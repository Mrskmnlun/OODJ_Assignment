/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package online_shopping_mangement;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author asus
 */
public class DeliverSelected extends javax.swing.JFrame {
    private String username;
    private String filePath = "Delivery.txt";
    private String[] columnNames = {"DeliveryID", "StaffName", "OrderId", "UserID", "ProductName", "Quantity","Address" ,"Status"};
    private DefaultTableModel tableModel;
    /**
     * Creates new form DeliverSelected
     */
    public DeliverSelected(String username) {
        initComponents();
        this.username = username;
        System.out.println("Username passed to View Order: " + username);
        tableModel = new DefaultTableModel(columnNames, 0);
        jTable1.setModel(tableModel);
        loadTableData();
    }
    private void loadTableData() {
        try {
            BufferedReader br = new BufferedReader(new FileReader(filePath));
            String line;
            while ((line = br.readLine()) != null) {
                String[] parts = line.split("/");
                if (parts.length == 10 && parts[7].equals("pending") && parts[1].equals(username)) {
                    Object[] row = { parts[0], parts[1], parts[2], parts[3], parts[4], parts[5], parts[6], parts[7] };
                    tableModel.addRow(row);
                }
            }
            br.close();
        } catch (Exception ex) {
            ex.printStackTrace();
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
        jButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        Feedback = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        DeliveryID = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        OrderID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        ProductName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        Quantity = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Delivered = new javax.swing.JButton();
        Rejected = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        Address = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Selected Order");

        jButton1.setBackground(new java.awt.Color(255, 255, 204));
        jButton1.setForeground(new java.awt.Color(0, 0, 0));
        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(46, 46, 46))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(53, Short.MAX_VALUE))
        );

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Delivery ID", "Order ID", "Product Name", "Quantity", "Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        Feedback.setColumns(20);
        Feedback.setRows(5);
        jScrollPane2.setViewportView(Feedback);

        jLabel2.setText("Delivery ID");

        DeliveryID.setEditable(false);

        jLabel3.setText("Order ID");

        OrderID.setEditable(false);

        jLabel4.setText("Product Name");

        ProductName.setEditable(false);

        jLabel5.setText("Quantity");

        Quantity.setEditable(false);

        jLabel6.setText("Feedback");

        Delivered.setText("Delivered");
        Delivered.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DeliveredActionPerformed(evt);
            }
        });

        Rejected.setText("Rejected");
        Rejected.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RejectedActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Had Delivered?");

        jLabel8.setText("Address");

        Address.setEditable(false);
        Address.setColumns(20);
        Address.setRows(5);
        jScrollPane3.setViewportView(Address);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 677, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 471, Short.MAX_VALUE)
                    .addComponent(jScrollPane3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel3)
                                    .addComponent(DeliveryID, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(OrderID, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(Quantity, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                                        .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jLabel4)
                                    .addComponent(ProductName, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jLabel7)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jLabel8))
                            .addComponent(jLabel6))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Rejected, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Delivered, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 418, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(ProductName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(Quantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DeliveryID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(OrderID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel7)
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(Rejected, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Delivered, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DeliveryMainPage Do = new DeliveryMainPage(username);
        Do.show();
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void RejectedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RejectedActionPerformed
    // Get the selected row in the table
    int selectedRow = jTable1.getSelectedRow();
    if (selectedRow == -1) {
        // No row is selected
        return;
    }

    // Get the delivery ID from the selected row
    String deliveryID = jTable1.getValueAt(selectedRow, 0).toString();

    // Read the contents of the file and store them in an ArrayList
    ArrayList<String> rows = new ArrayList<>();
    try {
        BufferedReader reader = new BufferedReader(new FileReader("Delivery.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            rows.add(line);
        }
        reader.close();
    } catch (IOException ex) {
        ex.printStackTrace();
        return;
    }

    // Loop through the rows and find the row with the matching delivery ID
    for (int i = 0; i < rows.size(); i++) {
        String row = rows.get(i);
        String[] parts = row.split("/");
        if (parts[0].equals(deliveryID)) {
            // Found the matching row, update the feedback and status fields
            parts[8] = Feedback.getText();  // Update feedback field
            parts[7] = "rejected";  // Update status field
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String localTime = LocalDateTime.now().format(formatter);
            parts[9] = localTime;  // Add local time field
            rows.set(i, String.join("/", parts));
        }
    }

    // Write the updated ArrayList back to the file
    try {
        PrintWriter writer = new PrintWriter(new FileWriter("Delivery.txt"));
        for (String row : rows) {
            writer.println(row);
        }
        writer.close();
    } catch (IOException ex) {
        ex.printStackTrace();
        return;
    }
    
    
    JOptionPane.showMessageDialog(this, "Status Update", "Success", JOptionPane.INFORMATION_MESSAGE);
    // Update the table with the new data
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);
    loadTableData();
    Feedback.setText("");
    DeliveryID.setText("");
    OrderID.setText("");
    ProductName.setText("");
    Quantity.setText("");
    Address.setText("");
    }//GEN-LAST:event_RejectedActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
     DefaultTableModel tblModel = (DefaultTableModel)jTable1.getModel();
     int SelectedRowIndex = jTable1.getSelectedRow();
     
     DeliveryID.setText(tblModel.getValueAt(SelectedRowIndex,0).toString());
     OrderID.setText(tblModel.getValueAt(SelectedRowIndex,2).toString());
     ProductName.setText(tblModel.getValueAt(SelectedRowIndex,4).toString());
     Quantity.setText(tblModel.getValueAt(SelectedRowIndex,5).toString());
     Address.setText(tblModel.getValueAt(SelectedRowIndex,6).toString());
    }//GEN-LAST:event_jTable1MouseClicked

    private void DeliveredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DeliveredActionPerformed
    // Get the selected row in the table
    int selectedRow = jTable1.getSelectedRow();
    if (selectedRow == -1) {
        // No row is selected
        return;
    }

    // Get the delivery ID from the selected row
    String deliveryID = jTable1.getValueAt(selectedRow, 0).toString();

    // Read the contents of the file and store them in an ArrayList
    ArrayList<String> rows = new ArrayList<>();
    try {
        BufferedReader reader = new BufferedReader(new FileReader("Delivery.txt"));
        String line;
        while ((line = reader.readLine()) != null) {
            rows.add(line);
        }
        reader.close();
    } catch (IOException ex) {
        ex.printStackTrace();
        return;
    }

    // Loop through the rows and find the row with the matching delivery ID
    for (int i = 0; i < rows.size(); i++) {
        String row = rows.get(i);
        String[] parts = row.split("/");
        if (parts[0].equals(deliveryID)) {
            // Found the matching row, update the feedback and status fields
            parts[8] = Feedback.getText();  // Update feedback field
            parts[7] = "delivered";  // Update status field
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
            String localTime = LocalDateTime.now().format(formatter);
            parts[9] = localTime;  // Add local time field
            rows.set(i, String.join("/", parts));
        }
    }

    // Write the updated ArrayList back to the file
    try {
        PrintWriter writer = new PrintWriter(new FileWriter("Delivery.txt"));
        for (String row : rows) {
            writer.println(row);
        }
        writer.close();
    } catch (IOException ex) {
        ex.printStackTrace();
        return;
    }
    JOptionPane.showMessageDialog(this, "Status Update", "Success", JOptionPane.INFORMATION_MESSAGE);
    // Update the table with the new data
    DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
    model.setRowCount(0);
    loadTableData();
    Feedback.setText("");
    DeliveryID.setText("");
    OrderID.setText("");
    ProductName.setText("");
    Quantity.setText("");
    Address.setText("");
    }//GEN-LAST:event_DeliveredActionPerformed

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
            java.util.logging.Logger.getLogger(DeliverSelected.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DeliverSelected.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DeliverSelected.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DeliverSelected.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DeliverSelected(User.getUsername()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextArea Address;
    private javax.swing.JButton Delivered;
    private javax.swing.JTextField DeliveryID;
    private javax.swing.JTextArea Feedback;
    private javax.swing.JTextField OrderID;
    private javax.swing.JTextField ProductName;
    private javax.swing.JTextField Quantity;
    private javax.swing.JButton Rejected;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
