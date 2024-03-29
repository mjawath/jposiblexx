/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.components.parent.controls.editors;

import java.awt.Component;
import java.awt.event.ActionEvent;
import javax.swing.AbstractAction;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import org.biz.app.ui.util.ComponentFactory;
import org.components.controls.ModelEditableTable;

/**
 *
 * @author nnjj
 */
public class DoubleCellEditor extends BaseCellEditor {

    // This method is called when a cell value is edited by the user.

    public DoubleCellEditor(ModelEditableTable jt) {
        super(jt);
        table=jt;
        init();
    }

    public DoubleCellEditor() {
        super();        
    }

    public void init() {
        //specify
        component = new JTextField();
        ComponentFactory.createDoubleTextField((JTextField)component);
        ((JTextField)component).addActionListener(new AbstractAction() {

            @Override
            public void actionPerformed(ActionEvent e) {

                if (isCellValid()) {
                    stopCellEditing();
                }
            }
        });
        ((JTextField)component).getDocument().addDocumentListener(new DocumentListener() {

            @Override
            public void insertUpdate(DocumentEvent e) {
                changedUpdate(e);
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                changedUpdate(e);
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                TableInteractionListner til = table.getTableInteractionListner();
                if (til != null) {
                    //set the value to the table setvalue at pls 
                    // of the specified column           
                    int col = table.getEditingColumn();
                    int row = table.getEditingRow();
                    if (col > -1 && row > -1) {
                        Object value =getCellEditorValue();                        
                        table.setValueAt(value, row, col);
                        System.out.println("Table value " + value);
                        til.onCellEditing(table.getSelectedObject(), table.getEditingColumn());
                    }
                }
            }
        });
        

    }

    @Override
    public Component getTableCellEditorComponent(JTable table, Object value,
            boolean isSelected, int rowIndex, int vColIndex) {

        // 'value' is value contained in the cell located at (rowIndex, vColIndex)

        // Configure the component with the specified value
        ((JTextField) component).setText("" + value);
        ((JTextField) component).selectAll();
        ((JTextField) component).requestFocus();

        // Return the configured component
        return component;
    }

    // This method is called when editing is completed.
    // It must return the new value to be stored in the cell.
    @Override
    public Object getCellEditorValue() {
        String s = ((JTextField) component).getText();
        if (!"".equals(s)) {
            Double dd = new Double((s));
            return dd;
        }
        return null;
    }
   
}
