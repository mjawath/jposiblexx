/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.biz;

import java.util.ArrayList;
import java.util.EventObject;
import java.util.List;
import javax.swing.DefaultCellEditor;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.event.ChangeEvent;
import org.biz.invoicesystem.entity.transactions.SalesInvoiceLineItem;
import org.components.parent.controls.editors.DoubleCellEditor;

/**
 *
 * @author d
 */
public class InoviceV1 extends javax.swing.JPanel {

    
    List<SalesInvoiceLineItem> lineItems;
    /**
     * Creates new form InoviceV1
     */
    public InoviceV1() {
        initComponents();
        lineItems= new ArrayList<>();
        UIManager.put("JTable.autoStartsEdit", Boolean.TRUE);
        DefaultCellEditor singleclick = new DefaultCellEditor(new JTextField());
        singleclick.setClickCountToStart(1);

        //set the editor as default on every column
        for (int i = 0; i < tblInvoiceLine.getColumnCount(); i++) {
            tblInvoiceLine.setDefaultEditor(tblInvoiceLine.getColumnClass(i), singleclick);
        }
        tblInvoiceLine1.setModelCollection(lineItems);
        tblInvoiceLine1.setModelClass(SalesInvoiceLineItem.class);
        tblInvoiceLine1.setPropertiesEL(new String[]{"id","qty","price","lineAmount","item"});       
        tblInvoiceLine1.setColumnHeader(new String[]{"ID","QTY","Price","Amount","Item"});        
        tblInvoiceLine1.setCellEditor(2,new DoubleCellEditor(tblInvoiceLine1));
        tblInvoiceLine1.setCellEditor(3,new DoubleCellEditor(tblInvoiceLine1));
        tblInvoiceLine1.setCellEditor(4,new DoubleCellEditor(tblInvoiceLine1));
        //customer selector
        //in  table , item selector
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ttext = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInvoiceLine = getTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblInvoiceLine1 = new org.components.controls.ModelEditableTable();

        jLabel1.setText("jLabel1");

        jButton1.setText("Add");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("remove");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Clear");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Copy");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        tblInvoiceLine.setModel(new javax.swing.table.DefaultTableModel(
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
        tblInvoiceLine.setCellSelectionEnabled(true);
        tblInvoiceLine.setRowHeight(34);
        jScrollPane1.setViewportView(tblInvoiceLine);

        jScrollPane2.setViewportView(tblInvoiceLine1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jButton1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton4))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(32, 32, 32)
                                .addComponent(ttext, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(ttext, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        tblInvoiceLine1.addModelToTable(new SalesInvoiceLineItem());        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        tblInvoiceLine1.removeSelectedRow();        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        tblInvoiceLine1.clear();
        
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //duplicate element
        tblInvoiceLine1.copySelectedElement();
    }//GEN-LAST:event_jButton4ActionPerformed

    public JTable getTable(){
    return new JTable(){

            @Override
            public void changeSelection(int rowIndex, int columnIndex, boolean toggle, boolean extend) {
                System.out.println("cselection going to changing " + tblInvoiceLine.getSelectedColumn() + " " + tblInvoiceLine.getSelectedRow());

                super.changeSelection(rowIndex, columnIndex, toggle, extend);
                System.out.println("cselection changed " + tblInvoiceLine.getSelectedColumn() + " " + tblInvoiceLine.getSelectedRow());

            }

            @Override
            public boolean editCellAt(int row, int column, EventObject e) {
                System.out.println(e);
                boolean x= super.editCellAt(row, column, e);
                System.out.println("         %%%%%%%%%%Editing started " + tblInvoiceLine.getEditingColumn() + " " + tblInvoiceLine.getEditingRow());
                return x;
            }

            @Override
            public void editingStopped(ChangeEvent e) {
                System.out.println("         %%%%%%%%%%Editing going to stop  " + tblInvoiceLine.getEditingColumn() + " " + tblInvoiceLine.getEditingRow());

                super.editingStopped(e);
                System.out.println("@@@@@@@@@Editing stopped "+tblInvoiceLine.getSelectedColumn()+ " "+tblInvoiceLine.getSelectedRow());
            }
    
    
    };
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tblInvoiceLine;
    private org.components.controls.ModelEditableTable tblInvoiceLine1;
    private javax.swing.JTextField ttext;
    // End of variables declaration//GEN-END:variables
}
