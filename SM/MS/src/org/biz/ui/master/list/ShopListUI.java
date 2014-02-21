/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.biz.ui.master.list;

import java.util.Date;
import org.biz.app.ui.util.QueryManager;
import org.biz.invoicesystem.entity.master.Shop;
import org.components.controls.CxTable;
import org.components.parent.controls.editors.TableInteractionListner;
import org.components.windows.ListViewPanel;

/**
 *
 * @author d
 */
public class ShopListUI extends ListViewPanel<Shop> {

    /**
     * Creates new form ShopListUI
     */
    public ShopListUI() {
        super();
    }

  @Override
    public void init() {
        initComponents();
        super.init();
    }

    @Override
    public void init(CxTable tbl) {
        super.init(tbl);
        tbl.init(Shop.class, new Class[]{String.class, String.class, Date.class, Date.class},
                 new String[]{"id", "code", "savedDate", "editedDate"});
        tbl.setTableInteractionListner(tableInteractionListner);
        listUI.getPagePanel().init(service, searchListener, tbl);
    }

    private TableInteractionListner tableInteractionListner = new TableInteractionListner() {
        @Override
        public Object[] getTableData(Object row) {
            Shop item = (Shop) row;
            return new Object[]{item, item.getId(), item.getCode(), item.getSavedDate(), item.getEditedDate()};
        }
    };
    private QueryManager searchListener = new QueryManager() {
//        @Override
        public String getQuery() {
            String qry = "  c.code " + " like " + " ?1 ";//" where c."+myfield+" "+ myoperator +" ?1 ";
            return qry;
        }

//        @Override
        public Object[] getParams() {
            return new Object[]{"%"};
        }
    };
  
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
