/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package research.prototype.transaction;

import org.biz.invoicesystem.entity.master.Item;

/**
 *
 * @author yy
 */
public class InvoicePro extends javax.swing.JPanel {

    /**
     * Creates new form Invoice
     */
    public InvoicePro() {
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

        jScrollPane2 = new javax.swing.JScrollPane();
        tblInvoiceLine1 = new org.components.controls.ModelEditableTable();
        cButton1 = new org.components.controls.CButton();
        tinv = new org.components.controls.CTextField();
        cButton9 = new org.components.controls.CButton();
        ttotal = new org.components.controls.CLabel();
        tdiscount = new org.components.controls.CLabel();
        cLabel1 = new org.components.controls.CLabel();
        cLabel2 = new org.components.controls.CLabel();
        cLabel3 = new org.components.controls.CLabel();
        tpnlLineDetail = new org.components.containers.CPanel();
        tqty = new org.components.controls.CTextField();
        tprice = new org.components.controls.CTextField();
        titem = new com.components.custom.TextFieldWithPopUP<Item>();
        tline = new org.components.controls.CLabel();
        controlPanel1 = new com.components.custom.ControlPanel();
        gridControllerPanel1 = new com.components.custom.GridControllerPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();

        setLayout(null);

        tblInvoiceLine1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tblInvoiceLine1);

        add(jScrollPane2);
        jScrollPane2.setBounds(20, 170, 720, 210);

        cButton1.setText("Find");
        cButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cButton1ActionPerformed(evt);
            }
        });
        add(cButton1);
        cButton1.setBounds(110, 0, 25, 19);
        add(tinv);
        tinv.setBounds(10, 0, 93, 25);

        cButton9.setText("Top");
        cButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cButton9ActionPerformed(evt);
            }
        });
        add(cButton9);
        cButton9.setBounds(750, 120, 54, 19);

        ttotal.setText("Total");
        add(ttotal);
        ttotal.setBounds(445, 448, 235, 38);

        tdiscount.setText("Discount");
        add(tdiscount);
        tdiscount.setBounds(445, 497, 235, 41);

        cLabel1.setText("Paid");
        add(cLabel1);
        cLabel1.setBounds(248, 450, 171, 34);

        cLabel2.setText("Tax");
        add(cLabel2);
        cLabel2.setBounds(248, 505, 104, 25);

        cLabel3.setText("Sub Total");
        add(cLabel3);
        cLabel3.setBounds(445, 405, 235, 32);

        tpnlLineDetail.setLayout(null);

        tqty.setText("Qty");
        tpnlLineDetail.add(tqty);
        tqty.setBounds(200, 10, 160, 30);

        tprice.setText("Price");
        tpnlLineDetail.add(tprice);
        tprice.setBounds(370, 10, 130, 30);

        titem.setText("Item");
        tpnlLineDetail.add(titem);
        titem.setBounds(10, 10, 180, 30);

        tline.setText("Line Amount");
        tpnlLineDetail.add(tline);
        tline.setBounds(510, 10, 104, 30);

        add(tpnlLineDetail);
        tpnlLineDetail.setBounds(20, 110, 650, 50);
        add(controlPanel1);
        controlPanel1.setBounds(20, 390, 410, 30);
        add(gridControllerPanel1);
        gridControllerPanel1.setBounds(750, 170, 90, 230);

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Address");
        jScrollPane1.setViewportView(jTextArea1);

        add(jScrollPane1);
        jScrollPane1.setBounds(190, 10, 166, 96);
    }// </editor-fold>//GEN-END:initComponents

    private void cButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cButton1ActionPerformed
    
    }//GEN-LAST:event_cButton1ActionPerformed

    private void cButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cButton9ActionPerformed

    }//GEN-LAST:event_cButton9ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.components.controls.CButton cButton1;
    private org.components.controls.CButton cButton9;
    private org.components.controls.CLabel cLabel1;
    private org.components.controls.CLabel cLabel2;
    private org.components.controls.CLabel cLabel3;
    private com.components.custom.ControlPanel controlPanel1;
    private com.components.custom.GridControllerPanel gridControllerPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private org.components.controls.ModelEditableTable tblInvoiceLine1;
    private org.components.controls.CLabel tdiscount;
    private org.components.controls.CTextField tinv;
    private com.components.custom.TextFieldWithPopUP<Item> titem;
    private org.components.controls.CLabel tline;
    private org.components.containers.CPanel tpnlLineDetail;
    private org.components.controls.CTextField tprice;
    private org.components.controls.CTextField tqty;
    private org.components.controls.CLabel ttotal;
    // End of variables declaration//GEN-END:variables
}
