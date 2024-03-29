/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package research.prototype.transaction;

import com.components.custom.PopupListner;
import com.components.custom.TextFieldWithPopUP;
import java.util.List;
import org.biz.invoicesystem.entity.master.Item;
import org.biz.invoicesystem.entity.master.UOM;
import org.biz.invoicesystem.service.master.ItemService;

/**
 *
 * @author Jawad
 */
public class UOMPopup extends TextFieldWithPopUP<UOM> implements PopupListner{

    /**
     * Creates new form ItemPopup
     */
    public UOMPopup() {
//        initComponents();?
        super();
        initPopup(Item.class, new Class[]{UOM.class,String.class},new String[]{"Code"} ,"code",this);
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
            .addGap(0, 360, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 43, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

    @Override
    public List searchItem(Object searchQry) {
        return ItemService.getItemForPopup((String) searchQry);
    }

    @Override
    public Object[] getTableData(Object obj) {
        UOM item=(UOM)obj;
        return new Object[]{item,item.getCode()};
    }
}
