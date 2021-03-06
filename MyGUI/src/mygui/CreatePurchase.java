/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygui;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Administrator
 */
public class CreatePurchase extends javax.swing.JFrame {

    /**
     * Creates new form CreatePurchase
     */
    ResultSet results;
    public static int recieptIDIncrement = 1;

    public CreatePurchase() {
        initComponents();
        showData();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jCheckBox1 = new javax.swing.JCheckBox();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        searchByList = new javax.swing.JComboBox<>();
        searchBox = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        chooseButton = new javax.swing.JButton();
        searchList = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        chooseTable = new javax.swing.JTable();
        deleteButton = new javax.swing.JButton();
        nextButton = new javax.swing.JButton();
        backButton = new javax.swing.JButton();

        jCheckBox1.setText("jCheckBox1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setForeground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 600));

        jLabel1.setFont(new java.awt.Font("supermarket", 1, 44)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CREATE PURCHASE");

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        jLabel2.setFont(new java.awt.Font("Sukhumvit Set", 0, 16)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Search");

        searchByList.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "...", "ID", "Name", "Type", "Amount", "Price" }));
        searchByList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByListActionPerformed(evt);
            }
        });

        searchBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchBoxActionPerformed(evt);
            }
        });

        searchButton.setBackground(javax.swing.UIManager.getDefaults().getColor("Button.darkShadow"));
        searchButton.setFont(new java.awt.Font("Sukhumvit Set", 0, 14)); // NOI18N
        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        chooseButton.setBackground(new java.awt.Color(255, 255, 255));
        chooseButton.setFont(new java.awt.Font("Sukhumvit Set", 0, 14)); // NOI18N
        chooseButton.setText("Choose");
        chooseButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chooseButtonActionPerformed(evt);
            }
        });

        searchList.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchListActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Sukhumvit Set", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Purchase List");

        chooseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Type", "Price", "Quantity"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(chooseTable);

        deleteButton.setBackground(new java.awt.Color(255, 255, 255));
        deleteButton.setFont(new java.awt.Font("Sukhumvit Set", 0, 14)); // NOI18N
        deleteButton.setText("Delete");
        deleteButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteButtonActionPerformed(evt);
            }
        });

        nextButton.setBackground(new java.awt.Color(255, 255, 255));
        nextButton.setFont(new java.awt.Font("Sukhumvit Set", 0, 14)); // NOI18N
        nextButton.setText("Next");
        nextButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextButtonActionPerformed(evt);
            }
        });

        backButton.setBackground(new java.awt.Color(255, 255, 255));
        backButton.setFont(new java.awt.Font("Sukhumvit Set", 0, 14)); // NOI18N
        backButton.setText("Back");
        backButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(300, 300, 300)
                .addComponent(jLabel3)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(jLabel2)
                        .addGap(28, 28, 28)
                        .addComponent(searchByList, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(searchBox)
                        .addGap(18, 18, 18)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(89, 89, 89))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(46, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(searchList, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(chooseButton)
                                .addGap(18, 18, 18)
                                .addComponent(deleteButton))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel2Layout.createSequentialGroup()
                                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 620, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(34, 34, 34))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(searchByList, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(searchList, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chooseButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deleteButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 276, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(backButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nextButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(150, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void searchBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchBoxActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        this.setForSearch((String) searchByList.getSelectedItem(), searchBox.getText());
    }//GEN-LAST:event_searchButtonActionPerformed

    private void backButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backButtonActionPerformed
        this.dispose();
        new Menu().setVisible(true);
    }//GEN-LAST:event_backButtonActionPerformed

    private void chooseButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chooseButtonActionPerformed
        String chooseId = "";
        chooseId = (String) searchList.getSelectedItem();
        int end = 0;
        for (int i = 0; i < chooseId.length(); i++) {
            if (chooseId.charAt(i) == 32) {
                end = i;
                break;
            }
        }
        chooseId = chooseId.substring(0, end);
        this.addToTable(chooseId);
    }//GEN-LAST:event_chooseButtonActionPerformed

    private void deleteButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteButtonActionPerformed
        this.removeSelectedRows();
    }//GEN-LAST:event_deleteButtonActionPerformed
    /*
    private void moveUpButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveUpButtonActionPerformed
        //this.moveUpwards();
    }//GEN-LAST:event_moveUpButtonActionPerformed

    private void moveDownButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_moveDownButtonActionPerformed
        //this.moveDownwards();
    }//GEN-LAST:event_moveDownButtonActionPerformed
*/
    private void nextButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextButtonActionPerformed
        try {
            new PurchaseConfirmation((DefaultTableModel) this.getTable()).show();
        } catch (ParseException ex) {
            Logger.getLogger(CreatePurchase.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_nextButtonActionPerformed

    private void searchByListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchByListActionPerformed

    private void searchListActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchListActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_searchListActionPerformed

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
            java.util.logging.Logger.getLogger(CreatePurchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreatePurchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreatePurchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreatePurchase.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CreatePurchase().setVisible(true);
            }
        });
    }

    public void addToTable(String data) {
        DefaultTableModel model = (DefaultTableModel) chooseTable.getModel();
        int tmp = 0;
        while (tmp < model.getRowCount()) {
            if (model.getValueAt(tmp, 0).equals(data)) {
                int input = 0;
                try {
                    input = Integer.parseInt(JOptionPane.showInputDialog("Please input the quantity"));
                } catch (NumberFormatException n) {
                    JOptionPane.showMessageDialog(null, "Valid input! Please input number", "Error!", JOptionPane.ERROR_MESSAGE);
                    return;
                }
                int newInput = (int) model.getValueAt(tmp, 4) + input;
                chooseTable.setValueAt(newInput, tmp, 4);
                return;
            }
            tmp++;
        }
        int input = 0;
        try {
            input = Integer.parseInt(JOptionPane.showInputDialog(null, "Insert quantity", "Quantity", JOptionPane.DEFAULT_OPTION));
        } catch (NumberFormatException n) {
            JOptionPane.showMessageDialog(null, "Valid input! Please input number", "Error!", JOptionPane.ERROR_MESSAGE);
            return;
        }
        String sql = "select * from APP.STOCK where productID = '" + data + "'";
        System.out.println(sql);
        model.addRow(new Object[]{"", "", "", "", ""});
        int showRow = model.getRowCount() - 1;
        try {
            Connection con = StockAndAccountSystem.getConnect();
            Statement stm = con.createStatement();
            results = stm.executeQuery(sql);
            String proId, proName, price, type;
            while (results.next()) {
                int j = 0;
                proId = results.getString(1);
                proName = results.getString(2);
                price = results.getString(4);
                type = results.getString(5);

                chooseTable.setValueAt(proId, showRow, j);
                j++;
                chooseTable.setValueAt(proName, showRow, j);
                j++;
                chooseTable.setValueAt(type, showRow, j);
                j++;
                chooseTable.setValueAt(price, showRow, j);
                j++;
                chooseTable.setValueAt(input, showRow, j);
                j++;
                //System.out.println(chooseTable.getValueAt(showRow,0));
            }

            //JOptionPane.showMessageDialog(null, "Record Inserted Successfully");
        } catch (SQLException ex) {
            
        }

        showRow++;
    }

    public TableModel getTable() {
        return chooseTable.getModel();
    }

    public void removeSelectedRows() {
        DefaultTableModel model = (DefaultTableModel) chooseTable.getModel();
        int[] rows = chooseTable.getSelectedRows();
        for (int i = 0; i < rows.length; i++) {
            model.removeRow(rows[i] - i);
        }
    }

    public static void clearTable(JTable table) {
        for (int i = 0; i < table.getRowCount(); i++) {
            for (int j = 0; j < table.getColumnCount(); j++) {
                table.setValueAt("", i, j);
            }
        }
    }

    public void showData() {
        searchList.removeAllItems();
        String sql = "select * from APP.STOCK";
        try {
            Connection con = StockAndAccountSystem.getConnect();
            Statement stm = con.createStatement();
            results = stm.executeQuery(sql);
            String proId, proName, amount, price, type;
            while (results.next()) {
                proId = results.getString(1);
                proName = results.getString(2);
                amount = results.getString(3);
                price = results.getString(4);
                type = results.getString(5);
                searchList.addItem(proId + "    " + proName);
            }
        } catch (Exception e) {
            System.out.println("Connect failed ! ");
        }
    }

    String proId, proName, amount, price, type;

    public void setForSearch(String searchBy, String word) {
        searchList.removeAllItems();
        String sql = "";
        if (searchBy.equalsIgnoreCase("All")) {
            sql = "select * from APP.STOCK";
        } else if (searchBy.equalsIgnoreCase("ID")) {
            sql = "select * from APP.STOCK where productID like '%" + word + "%' order by productID";
        } else if (searchBy.equalsIgnoreCase("Name")) {
            sql = "select * from APP.STOCK where productName like '%" + word + "%' order by productID";
        } else if (searchBy.equalsIgnoreCase("Type")) {
            sql = "select * from APP.STOCK where productType like '%" + word + "%' order by productID";
        } else if (searchBy.equalsIgnoreCase("Amount")) {
            int wordInt = Integer.parseInt(word);
            sql = "select * from APP.STOCK where amount = " + wordInt + " order by productID";
        } else if (searchBy.equalsIgnoreCase("Price")) {
            double wordDb = Double.parseDouble(word);
            sql = "select * from APP.STOCK where price = " + wordDb + " order by productID";
        }

        try {
            Connection con = StockAndAccountSystem.getConnect();
            Statement stm = con.createStatement();
            results = stm.executeQuery(sql);
            String proId, proName, amount, price, type;
            while (results.next()) {
                proId = results.getString(1);
                proName = results.getString(2);
                amount = results.getString(3);
                price = results.getString(4);
                type = results.getString(5);
                searchList.addItem(proId + "    " + proName + "    " + amount + "    " + price + "    " + type);
            }
        } catch (Exception e) {
            System.out.println("Connection failed ! ");
        }
    }

    public String getCurrentDate() {
        LocalDate localDate = LocalDate.now();
        return DateTimeFormatter.ofPattern("dd-MM-yyyy").format(localDate);
    }

    public void addToDatabase() {
        String sql;
        for (int i = 0; i < chooseTable.getRowCount(); i++) {
            int j = 0;
            String receiptIdAsString = new Integer(recieptIDIncrement).toString();
            while (j < chooseTable.getColumnCount()) {
                String proID;
                proID = "" + chooseTable.getValueAt(i, j += 3).toString();
                String proPrice;
                proPrice = "" + chooseTable.getValueAt(i, j++).toString();
                String purQuan;
                purQuan = "" + chooseTable.getValueAt(i, j++).toString();
                sql = "insert into APP.CREATEPURCHASE values ('"
                        + receiptIdAsString + "', '" + proID + "', '" + proPrice + "', '"
                        + purQuan + "', '" + getCurrentDate() + "')";
                try {
                    Connection con = StockAndAccountSystem.getConnect();
                    Statement stm = con.createStatement();
                    stm.executeUpdate(sql);
                    JOptionPane.showMessageDialog(null, "Record Inserted Successfully");
                } catch (SQLException ex) {
                    Logger.getLogger(CreatePurchase.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }

        //System.out.println(sql);
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton backButton;
    private javax.swing.JButton chooseButton;
    private javax.swing.JTable chooseTable;
    private javax.swing.JButton deleteButton;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton nextButton;
    private javax.swing.JTextField searchBox;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox<String> searchByList;
    private javax.swing.JComboBox<String> searchList;
    // End of variables declaration//GEN-END:variables
}
