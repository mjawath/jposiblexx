/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package research.prototype.transaction;

/**
 *
 * @author yy
 */
public class TableViewUIx extends javax.swing.JPanel {

    /**
     * Creates new form TableViewUI
     */
    public TableViewUIx() {
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

        cButton1 = new org.components.controls.CButton();
        cButton2 = new org.components.controls.CButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        cButton3 = new org.components.controls.CButton();
        cTextField1 = new org.components.controls.CTextField();
        cButton4 = new org.components.controls.CButton();

        setLayout(null);

        cButton1.setText("Close");
        add(cButton1);
        cButton1.setBounds(839, 11, 85, 68);

        cButton2.setText("All Tables");
        add(cButton2);
        cButton2.setBounds(840, 80, 80, 80);

        jPanel1.setLayout(null);

        cButton3.setText("My Table");
        jPanel1.add(cButton3);
        cButton3.setBounds(10, 10, 80, 80);

        jScrollPane1.setViewportView(jPanel1);

        add(jScrollPane1);
        jScrollPane1.setBounds(90, 80, 500, 370);
        add(cTextField1);
        cTextField1.setBounds(80, 20, 200, 25);

        cButton4.setText("Find");
        add(cButton4);
        cButton4.setBounds(290, 20, 25, 20);
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.components.controls.CButton cButton1;
    private org.components.controls.CButton cButton2;
    private org.components.controls.CButton cButton3;
    private org.components.controls.CButton cButton4;
    private org.components.controls.CTextField cTextField1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
