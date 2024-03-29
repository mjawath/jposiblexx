/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * ItemInventorySummary.java
 *
 * Created on Jun 28, 2011, 4:50:00 PM
 */
package org.biz.erp.inventory.ui;

import org.biz.invoicesystem.service.inventory.InventoryJournalService;
import org.biz.invoicesystem.service.inventory.InventoryMonthlySummeryService;
import org.components.windows.ListViewPanel;

/**
 *
 * @author Administrator
 */
public class ItemInventorySummary extends ListViewPanel<Object> {

    private InventoryJournalService service;
    
    /** Creates new form ItemInventorySummary */
    public ItemInventorySummary() {
        super();        
    }
    
    
        @Override
    public void init() {
        initComponents();      
        listUI = itemSummeryLVUI1;
        searchQueryUI = itemSummerySQUI1;
        super.init();      
     
      
        //set query manager for pagination
    }

/*
    @Override
    public void init() {
        super.init();        
        initComponents();
//        selectitem();
         listUI = wareHoueLV1;
        searchQueryUI = wareHouseSearchQueryUIPanel1;
        listUI.setSearchQueryUI(searchQueryUI);
        init(listUI.getTable());
        
        
        tbtnFind.addActionListener(findAction);
        tbl.init(InventoryJournal.class, new Class[]{Item.class, String.class,  String.class, String.class},
                 new String[]{"Item", "code","uom","qty"});
        tbl.setTableInteractionListner(tableInteractionListner);
        cPaginatedPanel1.init(service, searchListener, tbl);

    }
    
    private QueryManager searchListener = new QueryManager() {
//        @Override
        public String getQuery() {

                    Shop seleShop=tshop.getSelectedObject();
        Warehouse warehouse=twarehouse.getSelectedObject();
        List lst = service.getDao().getSummery(
                seleShop==null?null: seleShop.getId(),warehouse==null?null:warehouse.getId());
//        tbl.setModelCollection(lst);



            String qry ="";// "  c.code " + " like " + " ?1 ";//" where c."+myfield+" "+ myoperator +" ?1 ";
            return qry;
        }

//        @Override
        public Object[] getParams() {
            return new Object[]{ };
        }
    };
    
    private TableInteractionListner tableInteractionListner = new TableInteractionListner(){

        @Override
        public Object[] getTableData(Object row) {
            Object [] item= (Object[])row;
            Item it=(Item)item[0];
            UOM uom=(UOM)item[1];
            Double qty=(Double) item[2];
            return new Object[]{it,it.getCode(),uom.getCode(),qty};
        }
    
    };
    
    private ButtonAction  findAction=new ButtonAction(){
    
        @Override
        public Object executeTask(Object objs  ) {
            return findItemForQuery();
        }

        @Override
        public void resultTask(Object objs) {
            
        }  
    };
   
    
    private List findItemForQuery() {
        //find the item for 
        // provided warehoue
        //provoided shop 
        //provided time period  ???!!??
        //normally current date is used
        Shop seleShop=tshop.getSelectedObject();
        Warehouse warehouse=twarehouse.getSelectedObject();
        List lst = service.getDao().getSummery(
                seleShop==null?null: seleShop.getId(),warehouse==null?null:warehouse.getId());
//        tbl.setModelCollection(lst);

        return null;  
    }
            
    
    */
    InventoryMonthlySummeryService summeryService;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        itemSummeryLVUI1 = new org.biz.erp.inventory.ui.ItemSummeryLVUI();
        itemSummerySQUI1 = new org.biz.erp.inventory.ui.ItemSummerySQUI();

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(itemSummeryLVUI1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(itemSummerySQUI1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(itemSummerySQUI1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(itemSummeryLVUI1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.biz.erp.inventory.ui.ItemSummeryLVUI itemSummeryLVUI1;
    private org.biz.erp.inventory.ui.ItemSummerySQUI itemSummerySQUI1;
    // End of variables declaration//GEN-END:variables
}
