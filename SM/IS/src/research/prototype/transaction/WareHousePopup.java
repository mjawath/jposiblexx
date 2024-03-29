/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package research.prototype.transaction;

import com.components.custom.PopupListner;
import com.components.custom.TextFieldWithPopUP;
import java.util.List;

import org.biz.invoicesystem.entity.master.Warehouse;
import org.biz.invoicesystem.service.master.WareHouseService;

/**
 *
 * @author Jawad
 */
public class WareHousePopup extends TextFieldWithPopUP<Warehouse> implements PopupListner{

    /**
     * Creates new form ItemPopup
     */
    public WareHousePopup() {
//        initComponents();?
        super();
        initPopup(Warehouse.class, new Class[]{Warehouse.class,String.class},new String[]{"Code"} ,"code",this);
    }

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
            .addGap(0, 188, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 33, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    @Override
    public List searchItem(Object searchQry) {
        return WareHouseService.getDAO().getByCodeLike((String) searchQry);
    }

    @Override
    public Object[] getTableData(Object obj) {
        Warehouse item=(Warehouse)obj;
        return new Object[]{item,item.getCode()};
    }
}
