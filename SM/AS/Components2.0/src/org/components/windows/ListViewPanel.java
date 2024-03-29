/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.components.windows;

import app.utils.SystemUtil;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import org.biz.dao.service.Service;
import org.components.controls.CxTable;

/**
 *
 * @author d
 */
public class ListViewPanel<T> extends TabPanelUI implements ListSelectionListener{

    protected ListViewUI listUI;
    protected SearchQueryUIPanel searchQueryUI;
    
    /**
     * Creates new form ListViewPanel
     */
    public ListViewPanel() {
        super();
//        initComponents();
    }

    @Override
    public void init() {
//        initComponents();
        super.init();
        if(listUI==null)return;
        listUI.setSearchQueryUI(searchQueryUI);
        searchQueryUI.setListView(listUI);
        init(listUI.getTable());
    }

    @Override
    public void setService(Service service) {
        super.setService(service);
        if (searchQueryUI != null) {
            searchQueryUI.setServiceForQuery(service);
            
        }
    }

    private DetailPanel dp;
    
    public void setDetailPanel(DetailPanel de){        
    this.dp=de;
    }
    
    public DetailPanel getDetailPanel(){
    return dp;
    }
            
    
    public void init(final CxTable tbl) {
        if (tbl == null) {
            return;
        }
        tbl.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                if (e.getClickCount() == 2) {
                    Object obj = tbl.getSelectedObject();
                    if (obj == null) {
                        return;
                    }
                   if(dp!=null){
                    dp.setSelectedBusObj(obj);
                    dp.setBusObject(obj);
                    SystemUtil.bringTabToFront(dp);
                }
                }
            }
        });
        
    }

    @Override
    public void updateEntityUI() {
    
        SystemUtil.setTools(null);
        
    }
  
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        searchQueryUIPanel1 = new org.components.windows.SearchQueryUIPanel();
        listViewUI1 = new org.components.windows.ListViewUI();

        javax.swing.GroupLayout searchQueryUIPanel1Layout = new javax.swing.GroupLayout(searchQueryUIPanel1);
        searchQueryUIPanel1.setLayout(searchQueryUIPanel1Layout);
        searchQueryUIPanel1Layout.setHorizontalGroup(
            searchQueryUIPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        searchQueryUIPanel1Layout.setVerticalGroup(
            searchQueryUIPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 94, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchQueryUIPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(listViewUI1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(searchQueryUIPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(listViewUI1, javax.swing.GroupLayout.DEFAULT_SIZE, 342, Short.MAX_VALUE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.components.windows.ListViewUI listViewUI1;
    private org.components.windows.SearchQueryUIPanel searchQueryUIPanel1;
    // End of variables declaration//GEN-END:variables

    @Override
    public void valueChanged(ListSelectionEvent e) {
      
       
       
    }
}
