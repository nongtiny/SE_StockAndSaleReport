/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygui;

import static java.awt.Color.BLACK;
import static java.awt.Color.BLUE;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import jxl.*;
import jxl.write.*;
import java.io.*;
import jxl.format.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTable;
import java.util.Date; 
import java.sql.DriverManager;
import jxl.write.biff.RowsExceededException;
import java.io.IOException;
import java.util.Date;
import javax.swing.JComboBox;
import jxl.write.WritableWorkbook;
import jxl.read.biff.File;





/**
 *
 * @author Diamond
 */
public class SaleReport extends javax.swing.JFrame {
    
    /**
     * Creates new form SaleReport
     */
    public SaleReport() {
        System.out.println("preconcon");
        initComponents();
        showData();
//        searchByComboBox.addActionListener(new ActionListener() {
//            public void actionPerformed(ActionEvent event) {
//                //
//                // Get the source of the component, which is our combo
//                // box.
//                //
//                JComboBox comboBox = (JComboBox) event.getSource();
//
//                Object selected = comboBox.getSelectedItem();
//                if(selected.toString().equals("item1"))
//                field.setText("30");
//                else if(selected.toString().equals("item2"))
//                    field.setText("40");
//
//            }
//        });
        System.out.println("concon");
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox6 = new javax.swing.JComboBox();
        jLabel7 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        searchButton = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        SaleReportTable = new javax.swing.JTable();
        SealReportButton = new javax.swing.JToggleButton();
        FlieReport = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        dayBox = new javax.swing.JComboBox();
        monthBox = new javax.swing.JComboBox();
        yearBox = new javax.swing.JComboBox();
        searchByComboBox = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        jComboBox6.setFont(new java.awt.Font("supermarket", 0, 14)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "...", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        jLabel7.setFont(new java.awt.Font("supermarket", 0, 16)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("End Date");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 600));

        jLabel1.setFont(new java.awt.Font("supermarket", 1, 44)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SALE REPORT");

        jPanel2.setBackground(new java.awt.Color(0, 102, 102));

        searchButton.setBackground(new java.awt.Color(255, 255, 255));
        searchButton.setFont(new java.awt.Font("supermarket", 0, 14)); // NOI18N
        searchButton.setText("Search");
        searchButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                searchButtonMouseClicked(evt);
            }
        });
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        SaleReportTable.setBackground(new java.awt.Color(0, 102, 102));
        SaleReportTable.setFont(new java.awt.Font("Sukhumvit Set", 0, 16)); // NOI18N
        SaleReportTable.setForeground(new java.awt.Color(255, 255, 255));
        SaleReportTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "No.", "ID", "Name", "Price/Unit", "Sale Amount", "Total Sale"
            }
        ));
        SaleReportTable.setToolTipText("");
        SaleReportTable.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SaleReportTable.setDoubleBuffered(true);
        SaleReportTable.setEnabled(false);
        SaleReportTable.setGridColor(new java.awt.Color(102, 102, 102));
        SaleReportTable.setRowHeight(20);
        SaleReportTable.setSelectionBackground(new java.awt.Color(0, 0, 0));
        jScrollPane1.setViewportView(SaleReportTable);

        SealReportButton.setBackground(new java.awt.Color(255, 255, 255));
        SealReportButton.setFont(new java.awt.Font("supermarket", 0, 14)); // NOI18N
        SealReportButton.setText("Back");
        SealReportButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SealReportButtonMouseClicked(evt);
            }
        });
        SealReportButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SealReportButtonActionPerformed(evt);
            }
        });

        FlieReport.setBackground(new java.awt.Color(255, 255, 255));
        FlieReport.setFont(new java.awt.Font("supermarket", 0, 14)); // NOI18N
        FlieReport.setText("Export to Excel");
        FlieReport.setMaximumSize(new java.awt.Dimension(65, 25));
        FlieReport.setMinimumSize(new java.awt.Dimension(65, 25));
        FlieReport.setOpaque(false);
        FlieReport.setPreferredSize(new java.awt.Dimension(65, 25));
        FlieReport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FlieReportActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("supermarket", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Search by");

        dayBox.setFont(new java.awt.Font("supermarket", 0, 14)); // NOI18N
        dayBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        dayBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dayBoxActionPerformed(evt);
            }
        });

        monthBox.setFont(new java.awt.Font("supermarket", 0, 14)); // NOI18N
        monthBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "01", "02", "03", "04", "05", "06", "07", "08", "09", "10", "11", "12" }));
        monthBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                monthBoxActionPerformed(evt);
            }
        });

        yearBox.setFont(new java.awt.Font("supermarket", 0, 14)); // NOI18N
        yearBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "-", "2016", "2017", "2018" }));
        yearBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearBoxActionPerformed(evt);
            }
        });

        searchByComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Day", "Month", "Year" }));
        searchByComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchByComboBoxActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Date");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Month");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Year");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(searchByComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(dayBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(monthBox, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(15, 15, 15)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)
                        .addComponent(yearBox, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(SealReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(FlieReport, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 637, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(yearBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dayBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(searchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(searchByComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FlieReport, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SealReportButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void SealReportButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SealReportButtonActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_SealReportButtonActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        
            //this.showData();
            this.setForSearch();
        
    }//GEN-LAST:event_searchButtonActionPerformed

    private void FlieReportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FlieReportActionPerformed
         this.InfoToExcel();
    }//GEN-LAST:event_FlieReportActionPerformed

    private void dayBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dayBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_dayBoxActionPerformed

    private void monthBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_monthBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_monthBoxActionPerformed

    private void yearBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearBoxActionPerformed

    private void searchButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_searchButtonMouseClicked
        //setForSearch();
    }//GEN-LAST:event_searchButtonMouseClicked

    private void SealReportButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SealReportButtonMouseClicked
        this.setVisible(false);
        new Menu().setVisible(true);
    }//GEN-LAST:event_SealReportButtonMouseClicked

    private void searchByComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchByComboBoxActionPerformed
        
    }//GEN-LAST:event_searchByComboBoxActionPerformed

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
            java.util.logging.Logger.getLogger(SaleReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SaleReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SaleReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SaleReport.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SaleReport().setVisible(true);
                //new InfoToExcel.setVisible(true);
            }
        });
    }
    
    ResultSet results;
    public void showData() {
        
        String sql = "select * from APP.SALEREPORT ";    //order by receiptid
        System.out.println("eieiei after search");
        try{
            Connection con = StockAndAccountSystem.getConnect();
            Statement stm =con.createStatement();
            results=stm.executeQuery(sql);
            String receiptID, proID, Date;
            
            double proPrice, totalEachPro, totalPurchase;
            int purQuantity;
            int i=0;
            while(results.next() && i<20){
                int j=0;
                receiptID = results.getString(1);       
                
                proID=results.getString(2);             
                proPrice =results.getDouble(4);         
                totalEachPro = results.getDouble(5);
                totalPurchase =results.getDouble(6);
                purQuantity = results.getInt(3);
                Date=results.getString(7);
                SaleReportTable.setValueAt(receiptID, i, j); j++;
                SaleReportTable.setValueAt(Date, i, j); j++;
                SaleReportTable.setValueAt(proID, i, j); j++;
                SaleReportTable.setValueAt(new Integer(purQuantity), i, j); j++;
                SaleReportTable.setValueAt(new Double(proPrice), i, j); j++;
                SaleReportTable.setValueAt(new Double(totalEachPro), i, j); j++;
                SaleReportTable.setValueAt(new Double(totalPurchase), i, j); j++;
                i++;
            }
            System.out.println("sus");
        } catch (Exception e) {
            e.printStackTrace();
        } 
        
    } 
    
    public void InfoToExcel(){
        
         String sql = "select * from APP.SALEREPORT";
         
         try{
             Connection con = StockAndAccountSystem.getConnect();
             Statement stm =con.createStatement();
             results=stm.executeQuery(sql);
             
                //*** for Excel Report ***//
            String fileName = "C:\\Users\\PS\\Desktop\\report\\saleReport.xls";
 
            
            WritableWorkbook workbook = Workbook.createWorkbook(new java.io.File(fileName));
                //*** Create Font ***//
            WritableFont fontBlue = new WritableFont(WritableFont.TIMES, 10);
            WritableFont fontRed = new WritableFont(WritableFont.TIMES, 10);
                //*** Sheet 1 ***//
            WritableSheet ws1 = workbook.createSheet("mySheet1", 0);
 
                //*** Header ***//
            WritableCellFormat cellFormat1 = new WritableCellFormat(fontRed);
            //*** Data ***//
            WritableCellFormat cellFormat2 = new WritableCellFormat(fontBlue);
            
            ws1.mergeCells(0, 0, 5, 0);
            Label lable = new Label(0, 0,"Sale Report", cellFormat1);
            ws1.addCell(lable);
            ws1.addCell(new Label(0,1,"ReceiptID",cellFormat1));
            ws1.addCell(new Label(1,1,"Date",cellFormat1));
            ws1.addCell(new Label(2,1,"ID",cellFormat1));
            ws1.addCell(new Label(3,1,"Quatity",cellFormat1));
            ws1.addCell(new Label(4,1,"proPrice",cellFormat1));
            ws1.addCell(new Label(5,1,"TotalEachProduct",cellFormat1));
            ws1.addCell(new Label(6,1,"TotalPurchase",cellFormat1));
            
            
            int iRows = 2;
            while((results!=null) && (results.next()))
            {   
                
                ws1.addCell(new Label(0,iRows,results.getString("ReceiptID"),cellFormat2));
                ws1.addCell(new Label(1,iRows,results.getString("purchaseDate"),cellFormat2));
                ws1.addCell(new Label(2,iRows,results.getString("PRODUCTID"),cellFormat2));
                ws1.addCell(new Label(3,iRows,results.getString("purchaseQuantity"),cellFormat2));
                ws1.addCell(new Label(4,iRows,results.getString("productPrice"),cellFormat2));
                ws1.addCell(new Label(5,iRows,results.getString("TotalEachProduct"),cellFormat2));
                ws1.addCell(new Label(6,iRows,results.getString("TotalPurchase"),cellFormat2));
                
                ++iRows;
            }
 
            workbook.write();
            workbook.close();
 
            System.out.println("Excel file created.");
            
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
 
 
        
        
        
    }
    
    public static void clearTable(JTable table) {
        for (int i = 0; i < table.getRowCount(); i++)
            for(int j = 0; j < table.getColumnCount(); j++) {
              table.setValueAt("", i, j);
          }
    }
    
    public void setForSearch(){
        this.clearTable(SaleReportTable);
        
        String day,month;
        int year;
        
        day = (String) dayBox.getSelectedItem();
        month = (String) monthBox.getSelectedItem();
        year = Integer.parseInt((String) yearBox.getSelectedItem());
        String date = ""+year+"-"+month+"-"+day;
        
        String sql="";
        if(searchByComboBox.getSelectedItem() == "Day"){
            sql="select r.PRODUCTID, s.PRODUCTNAME, s.PRICE, sum(r.PURCHASEQUANTITY), sum(r.TOTALEACHPRODUCT) \n" +
                "from app.stock as s, app.saleReport as r \n" +
                "where s.PRODUCTID = r.PRODUCTID AND r.purchaseDate = '"+date+"' \n" +
                "group by r.productID";
        }else if(searchByComboBox.getSelectedItem() == "Month"){
            sql="select r.PRODUCTID, s.PRODUCTNAME, s.PRICE, sum(r.PURCHASEQUANTITY), sum(r.TOTALEACHPRODUCT) \n" +
                "from app.stock as s, app.saleReport as r \n" +
                "where s.PRODUCTID = r.PRODUCTID AND (DATEPART(yy, register_date) = "+year+" AND DATEPART(mm, register_date) = "+month+") \n" +
                "group by r.productID";
        }else if(searchByComboBox.getSelectedItem()== "Year"){
            sql="select r.PRODUCTID, s.PRODUCTNAME, s.PRICE, sum(r.PURCHASEQUANTITY), sum(r.TOTALEACHPRODUCT) \n" +
                "from app.stock as s, app.saleReport as r \n" +
                "where s.PRODUCTID = r.PRODUCTID AND (DATEPART(yy, register_date) = "+year+") \n" +
                "group by r.productID";
        }
        
        System.out.println(sql);
        try{
            Connection con = StockAndAccountSystem.getConnect();
            Statement stm =con.createStatement();
            ResultSet rs=stm.executeQuery(sql);
            System.out.println(sql);
            int i=0;
            String proID, proName;
            double proPrice, totalSale;
            int saleAmount;
            
            while(rs.next()){
                System.out.println(".......");
                int j=0;
                proID = rs.getString(1);                    
                proName=rs.getString(2);             
                proPrice =rs.getDouble(3);         
                saleAmount = rs.getInt(4);
                totalSale =rs.getDouble(5);
 
                System.out.println("proID ("+i+") :"+proID);
                SaleReportTable.setValueAt(i, i, j); j++;
                SaleReportTable.setValueAt(proID, i, j); j++;
                SaleReportTable.setValueAt(proName, i, j); j++;
                SaleReportTable.setValueAt(new Double(proPrice), i, j); j++;
                SaleReportTable.setValueAt(new Integer(saleAmount), i, j); j++;
                SaleReportTable.setValueAt(new Double(totalSale), i, j); j++;
                i++;
            }
            
        } catch (Exception e) {
            e.printStackTrace();
        } 
        System.out.println("the end");
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton FlieReport;
    private javax.swing.JTable SaleReportTable;
    private javax.swing.JToggleButton SealReportButton;
    private javax.swing.JComboBox dayBox;
    public javax.swing.JComboBox jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JComboBox monthBox;
    private javax.swing.JButton searchButton;
    private javax.swing.JComboBox<String> searchByComboBox;
    private javax.swing.JComboBox yearBox;
    // End of variables declaration//GEN-END:variables
}
