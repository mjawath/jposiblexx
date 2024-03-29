/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.test.master;

import app.utils.SystemUtil;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JFrame;
import org.biz.invoicesystem.entity.master.Item;
import org.biz.invoicesystem.entity.transactions.SalesInvoiceLineItem;
import org.biz.invoicesystem.ui.list.master.ItemList;
import org.biz.master.ui.ItemMasterUI2;
import org.biz.master.ui.MasterDetailViewerUI;
import org.components.parent.controls.editors.DoubleCellEditor;
import org.components.parent.controls.editors.ObjectCellEditor;

/**
 *
 * @author d
 */
public class ItemMasterForm extends javax.swing.JPanel {

    List<SalesInvoiceLineItem> lineItems;
    /**
     * Creates new form ItemMasterForm
     */
    public ItemMasterForm() {
        initComponents();
        initTable();
    }
    
    private void initTable(){
        lineItems = new ArrayList<SalesInvoiceLineItem>();
        modelEditableTable1.initTable(SalesInvoiceLineItem.class,new String[]{"qty","item"},new String[]{"QTY","Item"});        
        
        modelEditableTable1.setModelCollection(lineItems);
        modelEditableTable1.setCellEditor(1,new DoubleCellEditor());
        ObjectCellEditor<Item> itemCell=new ObjectCellEditor<Item>();
        itemCell.initPopup( new String[]{},new String[]{},"code");        
        modelEditableTable1.setCellEditor(2, itemCell);
    }
        
    private  List  getItems(){
        ArrayList al=new ArrayList();
        for (int i = 0; i < 100; i++) {
            Item item=new Item();
            item.setId(i+"id ");
            item.setCode(i+"code ");
            al.add(item);
        }
        return al;
    } 

    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        modelEditableTable1 = new org.components.controls.ModelEditableTable();
        btnNew = new javax.swing.JButton();
        btnRemove = new javax.swing.JButton();
        btnClear = new javax.swing.JButton();
        btnCopy = new javax.swing.JButton();

        jScrollPane1.setViewportView(modelEditableTable1);

        btnNew.setText("New");
        btnNew.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNewActionPerformed(evt);
            }
        });

        btnRemove.setText("remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        btnClear.setText("Clear");
        btnClear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClearActionPerformed(evt);
            }
        });

        btnCopy.setText("Copy");
        btnCopy.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCopyActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(106, 106, 106)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(btnNew)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnRemove)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnClear)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCopy)))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnNew)
                    .addComponent(btnRemove)
                    .addComponent(btnClear)
                    .addComponent(btnCopy))
                .addGap(36, 36, 36)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnNewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNewActionPerformed
        modelEditableTable1.addModelToTable(new SalesInvoiceLineItem());
    }//GEN-LAST:event_btnNewActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        modelEditableTable1.removeSelectedRow();
    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClearActionPerformed
        modelEditableTable1.clear();

    }//GEN-LAST:event_btnClearActionPerformed

    private void btnCopyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCopyActionPerformed
        //duplicate element
        modelEditableTable1.copySelectedElement();
        System.out.println("table elements");
        for (int i = 0; i < modelEditableTable1.getModelCollection().size(); i++) {
            SalesInvoiceLineItem salesInvoiceLineItem = (SalesInvoiceLineItem) modelEditableTable1.getModelCollection().get(i);
            System.out.println(salesInvoiceLineItem.getId()+salesInvoiceLineItem.getItem());
        }
        
    }//GEN-LAST:event_btnCopyActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClear;
    private javax.swing.JButton btnCopy;
    private javax.swing.JButton btnNew;
    private javax.swing.JButton btnRemove;
    private javax.swing.JScrollPane jScrollPane1;
    private org.components.controls.ModelEditableTable modelEditableTable1;
    // End of variables declaration//GEN-END:variables
}
