/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * CDatePicker.java
 *
 * Created on Jun 28, 2010, 9:17:22 PM
 */

package org.components.controls;

import java.util.Date;
import org.components.parent.controls.PDatePicker;

/**
 *
 * @author nano
 */
public class CDatePicker extends PDatePicker {

    /** Creates new form BeanForm */
    public CDatePicker() {
        initComponents();
        setDate(new Date());
        setFormats("dd/MM/yyyy");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

}
