/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.components.custom;



import java.awt.event.ActionListener;
import java.util.List;
import org.biz.app.ui.util.Command;
import org.components.containers.CPanel;
import org.components.controls.CTextField;

/**
 *
 * @author d
 */
public class TextFieldWithPopUP<T>  extends CPanel {


    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cTextField1 = new org.components.controls.CTextField();

        setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 132, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(cTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 132, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 23, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(cTextField1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 23, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.components.controls.CTextField cTextField1;
    // End of variables declaration//GEN-END:variables

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author d
 */
//public class TextFieldWithPopUP<T> extends CPanel {

    PagedPopUpPanel<T> pagedPopUpPanel;
    private CTextField fieldWithPopUP;
    ActionTask searchActionTask;
    ActionTask actionActionTask;

    public TextFieldWithPopUP() {
        super();
        initComponents();
        fieldWithPopUP = cTextField1;
        pagedPopUpPanel = new PagedPopUpPanel<T>(fieldWithPopUP) {
            @Override
            public void action() {
                if (actionActionTask != null) {
                    actionActionTask.actionCall();
                }

            }

            @Override
            public void search(String qry) {
                if (searchActionTask != null) {
                    searchActionTask.actionCall(qry);
                }
            }
        };
        addToFocus(fieldWithPopUP);
    }

    public void setSearchResult(Object objs) {
        pagedPopUpPanel.setSearchResult(objs);
        
    }
    public void setCommand(Command command) {
        pagedPopUpPanel.setCommand(command);
    }
    
    
    public void setPagedPopUpPanel(PagedPopUpPanel<T> pagedPopUpPanel) {
        this.pagedPopUpPanel = pagedPopUpPanel;
    }

    public PagedPopUpPanel<T> getPagedPopUpPanel() {
        return pagedPopUpPanel;
    }

    public ActionTask getActionActionTask() {
        return actionActionTask;
    }

    public void setActionActionTask(ActionTask actionActionTask) {
        this.actionActionTask = actionActionTask;
    }

    public ActionTask getSearchActionTask() {
        return searchActionTask;
    }

    public void setSearchActionTask(ActionTask searchActionTask) {
        this.searchActionTask = searchActionTask;
    }

    public void setPropertiesEL(String[] propertiesEL) {
        pagedPopUpPanel.setPropertiesEL(propertiesEL);
    }

    public void setTextItem(String txt) {
        pagedPopUpPanel.setPopDesable(true);
        fieldWithPopUP.setText(txt);
        pagedPopUpPanel.setPopDesable(false);
    }

    public T getSelectedObject() {
        return pagedPopUpPanel.getSelectedObject();
    }

    public void setTitle(String[] title) {
        pagedPopUpPanel.setTitle(title);
    }

    public void setSelectedProperty(String property) {
        pagedPopUpPanel.setSelectedProperty(property);
    }

    public String getSelectedID() {
        return pagedPopUpPanel.getSelectedID();
    }

    public void setSelectedObject(T it) {
        pagedPopUpPanel.setPopDesable(true);
        pagedPopUpPanel.setSelectedObject(it);
        pagedPopUpPanel.setSelectedText();
        pagedPopUpPanel.setPopDesable(false);
    }

    public void setObjectToTable(List<T> listCust) {
        pagedPopUpPanel.setObjectToTable(listCust);
        pagedPopUpPanel.showPopUp();
    }

    public void clear() {
        fieldWithPopUP.clear();
        setSelectedObject(null);
        pagedPopUpPanel.setSelectedID(null);
    }

    public void initPopup(Class cls, Class[] columnsType, String[] columns, String selectedProp, PopupListner listner) {
        pagedPopUpPanel.setPoplistener(listner);
        pagedPopUpPanel.setTableType(cls);
        pagedPopUpPanel.setTitle(columnsType, columns);
        pagedPopUpPanel.setSelectedProperty(selectedProp);
    }

    public void setText(String text) {
        fieldWithPopUP.setText(text);

    }

    public void setDocAction(ActionListener action) {

        fieldWithPopUP.setDocAction(action);
    }

    public void addActionListener(ActionListener e) {
        fieldWithPopUP.addActionListener(e);
    }

    public void setActionTask(ActionTask actionTask) {
        fieldWithPopUP.addActionListener(actionTask);
    }

    public void addaction(int idx, ActionTask action) {
        fieldWithPopUP.addaction(idx, action);
    }

    public void setValue(Object val) {
        fieldWithPopUP.setValue(val);
    }

    public void setValue(String val) {
        fieldWithPopUP.setValue(val);
    }
    
    public String getText(){
    return fieldWithPopUP.getText(); 
    }

    @Override
    public void requestFocus() {
        fieldWithPopUP.requestFocus();
    }
    public boolean hasFocus() {

    return fieldWithPopUP.hasFocus();
    }

   
   public void setEditable(boolean isEditable){
       fieldWithPopUP.setEditable(isEditable);
   } 
    
//}

}
