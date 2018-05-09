/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mygui;

import com.itextpdf.text.BaseColor;
import com.itextpdf.text.Chunk;
import com.itextpdf.text.PageSize;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import com.itextpdf.text.pdf.PdfWriter;
import java.io.File;
import com.itextpdf.text.Document;
import com.itextpdf.text.Element;
import com.itextpdf.text.FontFactory;
import com.itextpdf.text.Image;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfPCell;
import com.itextpdf.text.pdf.PdfPTable;
import com.itextpdf.text.Font;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.text.StyleConstants.FontFamily;

//import com.itextpdf.text.pdf.PdfWriter;
/**
 *
 * @author Dell
 */
public class PurchaseConfirmation extends javax.swing.JFrame {

    /**
     * Creates new form PurchaseConfirmation
     */
    DefaultTableModel tableFromCreatePurcahse;
    public double payable;
    //===================== PDF ===============================
    public String DEST;
    public static final String REGULAR = "C:\\Windows\\Fonts\\ccalibri.ttf";
    public static final String BOLD = "C:\\Windows\\Fonts\\calibrib.ttf";
    public static final String NEWLINE = "\n";
    String recieptID;

    //=========================================================
    //public PurchaseConfirmation() {
    //  initComponents();
    //}
    public PurchaseConfirmation(DefaultTableModel model) {
        initComponents();
        this.tableFromCreatePurcahse = model;
        DefaultTableModel table = tableFromCreatePurcahse;
        System.out.println(table.getRowCount());
        DefaultTableModel conTable = (DefaultTableModel) purchaseTable.getModel();
        conTable.setRowCount(table.getRowCount());
        int row = 0;
        payable = 0.0;
        while (row < table.getRowCount()) {
            String id = (String) table.getValueAt(row, 0);
            String name = (String) table.getValueAt(row, 1);
            double price = Double.parseDouble((String) table.getValueAt(row, 3));
            int quan = (Integer) table.getValueAt(row, 4);
            double totalPrice = price * quan;
            payable += totalPrice;
            conTable.setValueAt(id, row, 0);
            conTable.setValueAt(name, row, 1);
            conTable.setValueAt(price, row, 2);
            conTable.setValueAt(quan, row, 3);
            conTable.setValueAt(totalPrice, row, 4);

            row++;
        }
        payableAmount.setText("" + payable);
        Date date = new Date();
        recieptID = "" + date.getDay() + "" + date.getMonth() + "" + date.getYear() + "" + CreatePurchase.recieptIDIncrement;
        purchaseID.setText(recieptID);
        System.out.println(payable);
        //System.out.println(model.getValueAt(0,0));
    }

    public double getPayable() {
        return payable;
    }

    public void insertIntoSaleReport() {
        DefaultTableModel table = this.tableFromCreatePurcahse;
        int row = 0;
        Date date = new Date();
        try {
            Connection con = StockAndAccountSystem.getConnect();
            Statement stm = con.createStatement();
            while (row < table.getRowCount()) {
                int id =  Integer.parseInt(table.getValueAt(row,0).toString());
                //String name = (String) table.getValueAt(row, 1);
                double price = Double.parseDouble(table.getValueAt(row, 3).toString());
                int quan = (Integer) table.getValueAt(row, 4);
                double totalPrice = price * quan;
                String sql = "insert into salereport values( " + recieptID + ", "
                        + "" + id + ", " + quan + ", " + price + ", " + totalPrice + " , "
                        + "" + payable + ", " + date + ")" ; 
                stm.executeUpdate(sql);
                System.out.println("sql = "+sql);
                System.out.println("insert saleReport id = " + recieptID + "and stock id = " + id + " inserted");
                row++;
            }    //JOptionPane.showMessageDialog(null, "Record Inserted Successfully");
            System.out.println("SALE REPORT ID " + recieptID + "INSERTED");
        } catch (SQLException ex) {
                System.out.println("Connection fails");
            Logger.getLogger(AddProduct.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    public void kuy(){
    
    }
    public void updateStock(){
        //code complited
    DefaultTableModel confTable = this.tableFromCreatePurcahse;
        int row = 0;
        try {
            Connection con = StockAndAccountSystem.getConnect();
            Statement stm = con.createStatement();
            while (row < confTable.getRowCount()) {
                String id = (String) confTable.getValueAt(row, 0);
                int quan = Integer.parseInt(confTable.getValueAt(row,4).toString());
                String sql = "update stock set amount = amount - " + quan + " where productid = " + "'" + id +"'" ;
                stm.executeUpdate(sql);
                
                System.out.println("stock id = " + id + " amount updated");
                row++;
            }    //JOptionPane.showMessageDialog(null, "Record Inserted Successfully");
        } catch (SQLException ex) {
                System.out.println("Connection failed");
            Logger.getLogger(AddProduct.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        purchaseID = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        purchaseTable = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        confirmButton = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        payableAmount = new javax.swing.JLabel();

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 153, 153));

        jPanel1.setBackground(new java.awt.Color(0, 102, 102));
        jPanel1.setPreferredSize(new java.awt.Dimension(700, 600));

        jLabel4.setFont(new java.awt.Font("Sukhumvit Set", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Purchase ID :");

        purchaseID.setFont(new java.awt.Font("Sukhumvit Set", 0, 14)); // NOI18N
        purchaseID.setForeground(new java.awt.Color(255, 255, 255));
        purchaseID.setText("------------");

        jLabel1.setFont(new java.awt.Font("supermarket", 1, 36)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("PURCHASE CONFIRMATION");

        purchaseTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Product ID", "Name", "Price per unit", "Quantity", "Total price"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(purchaseTable);

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Sukhumvit Set", 0, 14)); // NOI18N
        jButton1.setText("Back");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        confirmButton.setBackground(new java.awt.Color(153, 153, 153));
        confirmButton.setFont(new java.awt.Font("Sukhumvit Set", 0, 14)); // NOI18N
        confirmButton.setText("Confirm");
        confirmButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                confirmButtonMouseClicked(evt);
            }
        });
        confirmButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                confirmButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(confirmButton)
                .addGap(50, 50, 50))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(confirmButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jLabel2.setFont(new java.awt.Font("Sukhumvit Set", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Payable amount :");

        payableAmount.setFont(new java.awt.Font("Sukhumvit Set", 0, 14)); // NOI18N
        payableAmount.setForeground(new java.awt.Color(255, 255, 255));
        payableAmount.setText("......................");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(purchaseID, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(8, 8, 8))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 621, Short.MAX_VALUE))
                        .addGap(48, 48, 48))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(payableAmount, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(purchaseID))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(payableAmount))
                .addGap(28, 28, 28)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 601, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void confirmButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_confirmButtonMouseClicked
        // TODO add your handling code here:
        // ดึงข้อมูลจาก createPurchase มา สร้าง sql แล้ว insert ลง data base
        updateStock();
        System.out.println("update stock completed");
        //insertIntoSaleReport();
        System.out.println("insert sale report completed");
      
        //updateSaleReport();
        String reciptID = recieptID;
        CreatePurchase.recieptIDIncrement++;
        DefaultTableModel conTable = (DefaultTableModel) purchaseTable.getModel();
        int row = 0;
        Date date = new Date();
        //===================== PDF ===============================
        DEST = "F:\\CS Year2\\receiptID" + reciptID + ".pdf";
        try {
            FileOutputStream out = new FileOutputStream(DEST);
            Document doc = new Document();
            PdfWriter writer = PdfWriter.getInstance(doc, out);
            doc.open();
            Font font14pt = FontFactory.getFont(BOLD, 14, com.itextpdf.text.Font.NORMAL, BaseColor.BLACK);
            Font font10pt = FontFactory.getFont(REGULAR, 10, com.itextpdf.text.Font.NORMAL, BaseColor.BLACK);
            Font font8pt = FontFactory.getFont(REGULAR, 8, com.itextpdf.text.Font.NORMAL, BaseColor.BLACK);
            Font font8ptB = FontFactory.getFont(REGULAR, 8, com.itextpdf.text.Font.BOLD, BaseColor.BLACK);
            Font th = FontFactory.getFont(BOLD, 14, com.itextpdf.text.Font.NORMAL, BaseColor.WHITE);
            Font td = FontFactory.getFont(REGULAR, 10, com.itextpdf.text.Font.NORMAL, BaseColor.BLACK);

            Image logo = Image.getInstance("F:\\CS Year2\\dodo.jpg");
            logo.setAlignment(Image.ALIGN_RIGHT);
            logo.setAbsolutePosition(450f, 10f);
            logo.scalePercent(13, 13);
            Chunk pic = new Chunk(logo, 350, -70);
            Paragraph receiptID = new Paragraph();
            receiptID.add(new Phrase("RECEIPT", font14pt));
            receiptID.add(new Phrase("\t\t\t\t\t\t\t\t\t\t\t"));
            receiptID.add(new Phrase("\t\t\t\t\t\t\t\t\t\t\t"));
            receiptID.add(new Phrase("No: " + reciptID, font10pt));
            receiptID.add(pic);

            Paragraph storeAddress = new Paragraph();
            storeAddress.add(NEWLINE);
            storeAddress.add("DEE CHAROEN CO.,LTD");
            storeAddress.add(NEWLINE);
            storeAddress.add(new Phrase("364-366  Charoenruk Rd.  "
                    + "Klong tonsai  Klongsan\n"
                    + "Bangkok  10600", font8pt));
            storeAddress.add(NEWLINE);
            storeAddress.add(new Phrase("Tel: 02-457-1455\n"
                    + "Phone: 085-155-9313\n"
                    + "Fax: 02-438-1290", font8pt));
            storeAddress.add(NEWLINE);
            storeAddress.add(new Phrase("LINE: Kritboonchai"
                    + "E-mail: Kritboonchai@gmail.com", font8ptB));
            storeAddress.add(NEWLINE);
            storeAddress.add(NEWLINE);
            storeAddress.add(NEWLINE);
            storeAddress.add(NEWLINE);

            PdfPTable table = new PdfPTable(2);
            table.setTotalWidth(new float[]{380, 150});
            table.setLockedWidth(true);
            // first row
            PdfPCell cell = new PdfPCell(new Phrase("Description", th));
            cell.setFixedHeight(30);
            cell.setColspan(1);
            cell.setVerticalAlignment(Element.ALIGN_CENTER);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setBackgroundColor(BaseColor.BLACK);
            cell.setBorderColor(BaseColor.WHITE);
            table.addCell(cell);
            cell = new PdfPCell(new Phrase("Amount", th));
            cell.setFixedHeight(30);
            cell.setColspan(1);
            cell.setVerticalAlignment(Element.ALIGN_CENTER);
            cell.setHorizontalAlignment(Element.ALIGN_CENTER);
            cell.setBackgroundColor(BaseColor.BLACK);
            cell.setBorderColor(BaseColor.WHITE);
            table.addCell(cell);

            //=========================================================
            while (row < purchaseTable.getRowCount()) {
                String proid = (String) conTable.getValueAt(row, 0);
                String name = (String) conTable.getValueAt(row, 1);
                double price = (double) Double.parseDouble(conTable.getValueAt(row, 2).toString());
                int quan = (Integer) conTable.getValueAt(row, 3);
                double totalPrice = (double) Double.parseDouble(conTable.getValueAt(row, 4).toString());
                //===================== PDF ===============================
                String descrp = String.format("%-20s%-40s%d %-20s%s", proid,name,quan,"@",
                                               conTable.getValueAt(row, 2).toString());
                String amount = "" + totalPrice;

                cell = new PdfPCell(new Phrase(descrp, td));
                cell.setFixedHeight(30);
                cell.setColspan(1);
                cell.setVerticalAlignment(Element.ALIGN_CENTER);
                cell.setHorizontalAlignment(Element.ALIGN_LEFT);
                cell.setBackgroundColor(BaseColor.GRAY);
                cell.setBorderColor(BaseColor.WHITE);
                table.addCell(cell);

                cell = new PdfPCell(new Phrase(amount, td));
                cell.setFixedHeight(30);
                cell.setColspan(1);
                cell.setVerticalAlignment(Element.ALIGN_CENTER);
                cell.setHorizontalAlignment(Element.ALIGN_CENTER);
                cell.setBackgroundColor(BaseColor.GRAY);
                cell.setBorderColor(BaseColor.WHITE);
                table.addCell(cell);
                //=========================================================
                String sql = "insert into SALEREPORT values ('"
                        + reciptID + "', '" + proid + "', '" + price + "', '" + totalPrice + "', '" + payable + "', '" + quan + "', '" + date + "')";
                try {
                    Connection con = StockAndAccountSystem.getConnect();
                    Statement stm = con.createStatement();
                    stm.executeUpdate(sql);
                    //Statement results = stm.executeQuery(sql);
                } catch (Exception e) {
                    System.out.println("Connect failed ! ");
                }
                row++;
            }
            //===================== PDF ===============================
            Paragraph total = new Paragraph();
            String totalAmnt = "" + getPayable();
            total.setAlignment(Element.ALIGN_CENTER);
            total.add(NEWLINE);
            total.add(NEWLINE);
            total.add(new Phrase("\t\t\t\t\t\t\t\t\t\t\t"));
            total.add(new Phrase("\t\t\t\t\t\t\t\t\t\t\t"));
            total.add(new Phrase("Total Amount: ", font10pt));
            total.add(new Phrase("\t\t\t\t\t\t\t\t\t\t\t"));
            total.add(new Phrase("\t\t\t\t\t\t\t\t\t\t\t"));
            total.add(new Phrase("\t\t"));
            total.add(new Phrase(totalAmnt, font10pt));

            Paragraph dateNow = new Paragraph();
            dateNow.add(NEWLINE);
            dateNow.add(NEWLINE);
            dateNow.add(new Phrase("" + date.getDay() + "/" + date.getMonth() + "/" + date.getYear(), font10pt));

            doc.add(receiptID);
            doc.add(storeAddress);
            doc.add(table);
            doc.add(total);
            doc.add(dateNow);
            doc.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        //=========================================================
       
    }//GEN-LAST:event_confirmButtonMouseClicked

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        // TODO add your handling code here:
        this.dispose();
        purchaseTable.clearSelection();
    }//GEN-LAST:event_jButton1MouseClicked

    private void confirmButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_confirmButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_confirmButtonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(PurchaseConfirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PurchaseConfirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PurchaseConfirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PurchaseConfirmation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {

                //new PurchaseConfirmation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton confirmButton;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel payableAmount;
    private javax.swing.JLabel purchaseID;
    private javax.swing.JTable purchaseTable;
    // End of variables declaration//GEN-END:variables
}
