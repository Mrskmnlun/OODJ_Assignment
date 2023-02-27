/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package online_shopping_mangement;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ASUS
 */
public class ManageProduct extends javax.swing.JFrame {

    /**
     * Creates new form ManageProduct
     */
    public ManageProduct() {
        initComponents();
        try{
            BufferedReader br = new BufferedReader(new FileReader("Product.txt"));
            String productdata = br.readLine();
            DefaultTableModel tblModel = (DefaultTableModel)ProductTable.getModel();
            int no=0;
            ArrayList<String> proid = new ArrayList<String>();
            while ((productdata = br.readLine())!= null){
                String[] data = productdata.split("/"); 
                tblModel.addRow(data);
                proid.add(data[0]);
            }
            
            int i=0,noid=1; String id;
            
            while(i<1){
                
                id = "P"+Integer.toString(noid);
                
                if (!proid.contains(id)){
                    productid.setText(id);
                    i=i+1;
                }
                noid++;
            }
            
            br.close();
            
            try{
                BufferedReader br2 = new BufferedReader(new FileReader("Category.txt"));
                String categorydata = br2.readLine();
                
                ArrayList<String> catename = new ArrayList<String>();
                catename.add("Select");
                while ((categorydata = br2.readLine())!= null){
                    String[] data = categorydata.split("/"); 
                    catename.add(data[1]);
                }
                
                Object[] name = catename.toArray();
                category.setModel(new javax.swing.DefaultComboBoxModel(name));
                
                br2.close();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "Error occurs while reading file.", "System Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Error occurs while reading file.", "System Error", JOptionPane.ERROR_MESSAGE);
        }

    }
    
    private void filter(String query){
        DefaultTableModel tblModel = (DefaultTableModel)ProductTable.getModel();
        TableRowSorter<DefaultTableModel> tr=new TableRowSorter<DefaultTableModel>(tblModel);
        ProductTable.setRowSorter(tr);
        
        tr.setRowFilter(RowFilter.regexFilter(query));
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
        backbtn = new javax.swing.JButton();
        productname = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        category = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        productid = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        subcategory = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        stock = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        updatebtn = new javax.swing.JButton();
        deletebtn = new javax.swing.JButton();
        clearbtn = new javax.swing.JButton();
        addbtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ProductTable = new javax.swing.JTable();
        jLabel11 = new javax.swing.JLabel();
        search = new javax.swing.JTextField();
        price = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Manage Product");

        nav.setBackground(new java.awt.Color(255, 204, 51));

        resortroombookingsystem.setFont(new java.awt.Font("Tw Cen MT", 1, 24)); // NOI18N
        resortroombookingsystem.setForeground(new java.awt.Color(255, 255, 255));
        resortroombookingsystem.setText("Manage Product");

        backbtn.setBackground(new java.awt.Color(255, 255, 204));
        backbtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        backbtn.setForeground(new java.awt.Color(51, 51, 51));
        backbtn.setText("Back");
        backbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout navLayout = new javax.swing.GroupLayout(nav);
        nav.setLayout(navLayout);
        navLayout.setHorizontalGroup(
            navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navLayout.createSequentialGroup()
                .addGap(78, 78, 78)
                .addComponent(resortroombookingsystem)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(backbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(84, 84, 84))
        );
        navLayout.setVerticalGroup(
            navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(navLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(navLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(resortroombookingsystem)
                    .addComponent(backbtn))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        productname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Category:");

        category.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        category.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                categoryActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Product Name:");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setText("Product ID: ");

        productid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        productid.setEnabled(false);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Sub Category:");

        subcategory.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        subcategory.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-" }));
        subcategory.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subcategoryActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setText("Stock:");

        stock.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        stock.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                stockKeyPressed(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                stockKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel9.setText("Price:");

        updatebtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        updatebtn.setText("Update");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
            }
        });

        deletebtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        deletebtn.setText("Delete");
        deletebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deletebtnActionPerformed(evt);
            }
        });

        clearbtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        clearbtn.setText("Clear");
        clearbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearbtnActionPerformed(evt);
            }
        });

        addbtn.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        addbtn.setText("Add");
        addbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addbtnActionPerformed(evt);
            }
        });

        ProductTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Product ID", "Product Name", "Category", "Sub Category", "Price", "Stock"
            }
        ));
        ProductTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ProductTableMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(ProductTable);

        jLabel11.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel11.setText("Search:");

        search.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        search.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });

        price.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));
        price.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                priceKeyTyped(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(nav, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7))
                                .addGap(45, 45, 45)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(subcategory, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(productname, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(productid, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(stock, javax.swing.GroupLayout.DEFAULT_SIZE, 169, Short.MAX_VALUE)
                                    .addComponent(price)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(updatebtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 61, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addGap(31, 31, 31)
                        .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(nav, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(productid, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(productname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(category, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(subcategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(39, 39, 39)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(stock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(price, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(addbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(clearbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(deletebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1))
                .addContainerGap(41, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void categoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_categoryActionPerformed
        String categoryname = category.getSelectedItem().toString();
        
        if (!categoryname.equals("Select")){
            try{
                BufferedReader br = new BufferedReader(new FileReader("Category.txt"));
                String categorydata = br.readLine();
                String[] Subcategory = null;
                while ((categorydata = br.readLine())!= null){
                    String[] data = categorydata.split("/"); 
                    if (categoryname.equals(data[1])){
                        if (data[2].contains(",")){
                            Subcategory = data[2].split(",");
                            System.out.println(Subcategory[1]);
                        }
                        else{
                            Subcategory = new String[1];
                            Subcategory[0] = data[2];
                            System.out.println("yes");

                        }
                    }
                }
                
                subcategory.setModel(new javax.swing.DefaultComboBoxModel(Subcategory));
                br.close();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "Error occurs while reading file.", "System Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        else{
            String[] def = new String[1];
            def[0]="-";
            subcategory.setModel(new javax.swing.DefaultComboBoxModel(def));
        }
    }//GEN-LAST:event_categoryActionPerformed

    private void subcategoryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subcategoryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_subcategoryActionPerformed

    private void clearbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearbtnActionPerformed
        try{
            BufferedReader br = new BufferedReader(new FileReader("Product.txt"));
            String productdata = br.readLine();
            
            int no=0;
            ArrayList<String> proid = new ArrayList<String>();
            while ((productdata = br.readLine())!= null){
                String[] data = productdata.split("/");
                proid.add(data[0]);
            }
            
            int i=0,noid=1; String id;
            
            while(i<1){
                
                id = "P"+Integer.toString(noid);
                
                if (!proid.contains(id)){
                    productid.setText(id);
                    i=i+1;
                }
                noid++;
            }
            
            br.close();
            
            productname.setText("");
            category.setSelectedIndex(0);
            subcategory.setSelectedIndex(0);
            stock.setText("");
            price.setText("");
            

        }
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Error occurs while reading file.", "System Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_clearbtnActionPerformed

    private void stockKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_stockKeyPressed

    private void stockKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_stockKeyTyped
        char ch = evt.getKeyChar();
        
        if (!Character.isDigit(ch)){
            evt.consume();
        }
    }//GEN-LAST:event_stockKeyTyped

    private void priceKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_priceKeyTyped
        
    }//GEN-LAST:event_priceKeyTyped

    private void addbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addbtnActionPerformed
        
        String ProductID = productid.getText();
        String ProductName = productname.getText();
        String CategoryName = category.getSelectedItem().toString();
        String SubCategoryName = subcategory.getSelectedItem().toString();
        String Stock = stock.getText();
        String Price = price.getText();
        
        if (ProductID.equals("") || ProductName.equals("") || CategoryName.equals("Select") || SubCategoryName.equals("-") || Stock.equals("") || Price.equals("")){
            JOptionPane.showMessageDialog(null, "Please fill up all the details!", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try{
                PrintWriter appenddata =new PrintWriter(new BufferedWriter(new FileWriter("Product.txt", true)));
                appenddata.println(ProductID+"/"+ProductName+"/"+CategoryName+"/"+SubCategoryName+"/"+Price+"/"+Stock);
                appenddata.close();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "Error occurs while reading file.", "System Error", JOptionPane.ERROR_MESSAGE);
            }
        }
        
        JOptionPane.showMessageDialog(rootPane, "The data was added.", "Add Product", JOptionPane.INFORMATION_MESSAGE);
        
        DefaultTableModel tblModel = (DefaultTableModel)ProductTable.getModel();
        tblModel.setNumRows(0);
        try{
            BufferedReader br = new BufferedReader(new FileReader("Product.txt"));
            String productdata = br.readLine();
            int no=0;
            ArrayList<String> proid = new ArrayList<String>();
            while ((productdata = br.readLine())!= null){
                String[] data = productdata.split("/"); 
                tblModel.addRow(data);
                proid.add(data[0]);
            }
            int i=0,noid=1; String id;
            
            while(i<1){
                
                id = "P"+Integer.toString(noid);
                
                if (!proid.contains(id)){
                    productid.setText(id);
                    i=i+1;
                }
                noid++;
            }
            
            productname.setText("");
            category.setSelectedIndex(0);
            subcategory.setSelectedIndex(0);
            stock.setText("");
            price.setText("");
            br.close();
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "Error occurs while reading file.", "System Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_addbtnActionPerformed

    private void deletebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deletebtnActionPerformed
        try{
            DefaultTableModel tblModel = (DefaultTableModel)ProductTable.getModel();
            String ProductID = tblModel.getValueAt(ProductTable.getSelectedRow(), 0).toString();
            
            File productrecord = new File("Product.txt");
            File tempfile = new File("temp.txt");
            BufferedReader br = new BufferedReader(new FileReader("Product.txt"));
            PrintWriter appenddata =new PrintWriter(new BufferedWriter(new FileWriter("temp.txt", true)));
            String line = null;
            while ((line = br.readLine())!= null){
                String[] data = line.split("/");
                if (!data[0].equals(ProductID)){
                    appenddata.println(line);
                    appenddata.flush();
                }
                
            }
            appenddata.close();
            br.close();
            
            if (!productrecord.delete()){
                JOptionPane.showMessageDialog(rootPane, "Could not delete the file.", "System Error", JOptionPane.ERROR_MESSAGE);
            }
            
            if (!tempfile.renameTo(productrecord)){
                JOptionPane.showMessageDialog(rootPane, "Could not rename the file", "System Error", JOptionPane.ERROR_MESSAGE);
            }
            
            JOptionPane.showMessageDialog(rootPane, "The data was deleted.", "Delete Product", JOptionPane.INFORMATION_MESSAGE);
            
            tblModel.setNumRows(0);
            try{
                BufferedReader br2 = new BufferedReader(new FileReader("Product.txt"));
                String productdata = br2.readLine();
                int no=0;
                ArrayList<String> proid = new ArrayList<String>();
                while ((productdata = br2.readLine())!= null){
                    String[] data = productdata.split("/"); 
                    tblModel.addRow(data);
                    proid.add(data[0]);
                }
                int i=0,noid=1; String id;
                
                while(i<1){
                    
                    id = "P"+Integer.toString(noid);
                    
                    if (!proid.contains(id)){
                        productid.setText(id);
                        i=i+1;
                    }
                    noid++;
                }
                
                productname.setText("");
                category.setSelectedIndex(0);
                subcategory.setSelectedIndex(0);
                stock.setText("");
                price.setText("");
                br.close();
            }
            catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "Error occurs while reading file.", "System Error", JOptionPane.ERROR_MESSAGE);
            }
                
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(rootPane, "The data is not selected!", "System Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_deletebtnActionPerformed

    private void ProductTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ProductTableMouseClicked
        DefaultTableModel tblModel = (DefaultTableModel)ProductTable.getModel();
        String ProductID = tblModel.getValueAt(ProductTable.getSelectedRow(), 0).toString();
        String ProductName = tblModel.getValueAt(ProductTable.getSelectedRow(), 1).toString();
        String Category = tblModel.getValueAt(ProductTable.getSelectedRow(), 2).toString();
        String Subcategory = tblModel.getValueAt(ProductTable.getSelectedRow(), 3).toString();
        String Price = tblModel.getValueAt(ProductTable.getSelectedRow(), 4).toString();
        String Stock = tblModel.getValueAt(ProductTable.getSelectedRow(), 5).toString();

        productid.setText(ProductID);
        productname.setText(ProductName);
        category.setSelectedItem(Category);
        subcategory.setSelectedItem(Subcategory);
        stock.setText(Stock);
        price.setText(Price);
    }//GEN-LAST:event_ProductTableMouseClicked

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
        String ProductID = productid.getText();
        String ProductName = productname.getText();
        String CategoryName = category.getSelectedItem().toString();
        String SubCategoryName = subcategory.getSelectedItem().toString();
        String Stock = stock.getText();
        String Price = price.getText();
        
        if (ProductID.equals("") || ProductName.equals("") || CategoryName.equals("Select") || SubCategoryName.equals("-") || Stock.equals("") || Price.equals("")){
            JOptionPane.showMessageDialog(null, "Please fill up all the details!", "Error Message", JOptionPane.ERROR_MESSAGE);
        }
        else{
            try{
                DefaultTableModel tblModel = (DefaultTableModel)ProductTable.getModel();
                String Productid = tblModel.getValueAt(ProductTable.getSelectedRow(), 0).toString();
                
                File productrecord = new File("Product.txt");
                File tempfile = new File("temp.txt");
                BufferedReader br = new BufferedReader(new FileReader("Product.txt"));
                PrintWriter appenddata =new PrintWriter(new BufferedWriter(new FileWriter("temp.txt", true)));
                String line = null;
                while ((line = br.readLine())!= null){
                    String[] data = line.split("/");
                    if (data[0].equals(Productid)){
                        appenddata.println(ProductID+"/"+ProductName+"/"+CategoryName+"/"+SubCategoryName+"/"+Price+"/"+Stock);
                        appenddata.flush();
                    }
                    else{
                        appenddata.println(line);
                        appenddata.flush();
                    }
                }
                appenddata.close();
                br.close();
                
                if (!productrecord.delete()){
                    JOptionPane.showMessageDialog(rootPane, "Could not delete the file.", "System Error", JOptionPane.ERROR_MESSAGE);
                }
                
                if (!tempfile.renameTo(productrecord)){
                    JOptionPane.showMessageDialog(rootPane, "Could not rename the file", "System Error", JOptionPane.ERROR_MESSAGE);
                }
                
                JOptionPane.showMessageDialog(rootPane, "Update Successful", "Update Success", JOptionPane.INFORMATION_MESSAGE);
                
                tblModel.setNumRows(0);
                try{
                    BufferedReader br2 = new BufferedReader(new FileReader("Product.txt"));
                    String productdata = br2.readLine();
                    int no=0;
                    ArrayList<String> proid = new ArrayList<String>();
                    while ((productdata = br2.readLine())!= null){
                        String[] data = productdata.split("/"); 
                        tblModel.addRow(data);
                        proid.add(data[0]);
                    }
                    int i=0,noid=1; String id;
                    
                    while(i<1){
                           
                        id = "P"+Integer.toString(noid);
                        
                        if (!proid.contains(id)){
                            productid.setText(id);
                            i=i+1;
                        }
                        noid++;
                    }
                       
                    productname.setText("");
                    category.setSelectedIndex(0);
                    subcategory.setSelectedIndex(0);
                    stock.setText("");
                    price.setText("");
                    br.close();
                }
                catch(Exception e){
                    JOptionPane.showMessageDialog(rootPane, "Error occurs while reading file.", "System Error", JOptionPane.ERROR_MESSAGE);
                }
                
         }
            catch(Exception e){
                JOptionPane.showMessageDialog(rootPane, "The data is not selected!", "System Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_updatebtnActionPerformed

    private void backbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backbtnActionPerformed
        AdminMainPage am = new AdminMainPage();
        am.setVisible(true);
        dispose();
    }//GEN-LAST:event_backbtnActionPerformed

    private void searchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_searchKeyReleased
        String query=search.getText();
        
        filter(query);
    }//GEN-LAST:event_searchKeyReleased

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
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ManageProduct.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ManageProduct().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ProductTable;
    private javax.swing.JButton addbtn;
    private javax.swing.JButton backbtn;
    private javax.swing.JComboBox<String> category;
    private javax.swing.JButton clearbtn;
    private javax.swing.JButton deletebtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel nav;
    private javax.swing.JFormattedTextField price;
    private javax.swing.JTextField productid;
    private javax.swing.JTextField productname;
    private javax.swing.JLabel resortroombookingsystem;
    private javax.swing.JTextField search;
    private javax.swing.JTextField stock;
    private javax.swing.JComboBox<String> subcategory;
    private javax.swing.JButton updatebtn;
    // End of variables declaration//GEN-END:variables
}
