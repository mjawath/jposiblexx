/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package org.biz.erp.inventory.dao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import org.biz.app.ui.util.StringUtility;
import org.biz.dao.service.GenericDAO;
import org.biz.dao.service.CQuery;
import org.biz.invoicesystem.entity.inventory.InventoryJournal;

/**
 *
 * @author mjawath
 */
public class InventoryJournalDAO extends GenericDAO<InventoryJournal>{

    
    public InventoryJournalDAO() {
    setCls(InventoryJournal.class);
    }
    
    public List<InventoryJournal> getForLastMonth(Date date) {
        String qry="select c from InventoryJournal c where c.summeriesedDate= ?1";
        List<InventoryJournal> list=ExecuteQuery(qry);
        return list;
    }
    
    public List getForLastMonthsummery(Date date,String sid,String wid) {
//        String qry="select i ,sum(l.qty)  "
//        + " from InventoryJournal c join c.lines l join l.item i  "
//                + " group by i ";
        /*
         select all line items within the month
         * create mothly summery object
         summery of shops ware houses qty
         * set the warehouse ,item , shop , qty ...etc....
         * 
         * 
         * 
         * 
         String qryx = "select i, ijls.uom ,ijls.qty   "
                + " from InventoryJournal  c left join c.lines ijls  join ijls.item i       ";
         */
       /* String qryx = "select c.shop ,c.warehouse, i, ijls.uom ,sum(ijls.qty)    "
                + " from InventoryJournal  c left join c.lines ijls left join  ijls.item i   "
                + " group by c.shop ,c.warehouse , i , ijls.uom  ";*/

//        String qryx = " select   i, ijls.uom, sum(ijls.qty)    "
//                    + " from InventoryJournal  c left join c.lines ijls left join  ijls.item i   "
//                    +"    "
//                    + " group by  i ,ijls.uom ";
//        
        
        String x= " where   "+ (StringUtility.isEmptyString(wid)?" ":" c.warehouse.id =?1 ") ;
         x +=  !StringUtility.isEmptyString(sid)?" ": " c.shop.id =?2  ";
        x+= " c.createdDate between ?3 and ?4 ";
//        Datea
         
         String qr = " select   i, ijls.uom, sum(ijls.qty)    "
                    + " from InventoryJournal  c left join c.lines ijls left join  ijls.item i   "
                + x
                    + " group by  i ,ijls.uom ";
        //
        List list = executeQuery(qr,new Object[]{date,sid,wid});
       
        return list;
    }
    
    public List getSummery(String sid, String wid) {
        return getSummery(sid, wid, null);
    }
    
    public List getSummery(String sid, String wid, List lst) {

        String sel = " select   i, ijls.uom, sum(ijls.qty)    "
                + " from InventoryJournal  c left join c.lines ijls left join  ijls.item i   ";
        String qr = " group by  i ,ijls.uom ";

        ArrayList<String> lstW = new ArrayList();
        HashMap conditions = new HashMap();

        if (!StringUtility.isEmptyString(sid)) {
            conditions.put("shopid", sid);
            lstW.add("  c.shop.id =:shopid   ");
        } else if (!StringUtility.isEmptyString(wid)) {
            lstW.add("   c.warehouse.id = :wareid  ");
            conditions.put("wareid", wid);
        }
        if (lst != null && !lst.isEmpty()) {
            lstW.add("   i.id in :items  ");
            conditions.put("items", lst);
        }

        //create the where clause using lst
        StringBuilder s = new StringBuilder();
        int size = lstW.size();
        if (size > 0) {
            s.append(" where ");
        }

        for (int i = 0; i < size; i++) {
            String object = lstW.get(i);
            s.append(object);
            if (i + 1 != size) {
                s.append("  and ");
            }
        }

        sel = sel + s.toString() + qr;
        return executeQuery(sel, conditions);

    }

    
    public List getInventorySummeryForItems(String sid, String wid,ArrayList items){
        String sel = " select   i, ijls.uom, sum(ijls.qty)    "
                     + " from InventoryJournal  c left join c.lines ijls left join  ijls.item i   ";
        String qr = " group by  i ,ijls.uom ";

        if (!StringUtility.isEmptyString(wid) && !StringUtility.isEmptyString(sid)) {

            sel +=   " where c.shop.id =?1 and  c.warehouse.id =?2  "
                    + qr;
            return executeQuery(sel, new Object[]{sid, wid});

        } else if (!StringUtility.isEmptyString(wid) && StringUtility.isEmptyString(sid)) {
            sel +=   " where   c.warehouse.id =?1  "
                    + qr;
            return executeQuery(sel, new Object[]{wid});

        } else if (StringUtility.isEmptyString(wid) && !StringUtility.isEmptyString(sid)) {
            sel +=   " where   c.shop.id =?1  "
                    + qr;
            return executeQuery(sel, new Object[]{sid});
        }
        sel +=  qr;
        return ExecuteQuery(sel);
    }
    /*
     sql query to do some work
     * 
     * 
     * SELECT i.code,l.id , it.code FROM inventoryJournal  i 
LEFT JOIN inventoryjournalline l  ON l.inv_id = i.id 
LEFT JOIN item it ON it.id = l.item_id
WHERE it.code LIKE 'xx%'
* 
* 
* 
* 
     */
    
    
    
    public CQuery getSummerySql(String itemID) {

        
        String itemQ="";
        String sel = " select   i, ijls.uom, sum(ijls.qty)    "
                     + " from InventoryJournal  c left join c.lines ijls left join  ijls.item i   ";
        String qr = " group by  i ,ijls.uom ";
        if(StringUtility.isEmptyString(itemID)){
        itemQ="";
        }else{
            itemQ=" where  i.code like '"+itemID+"%' ";
       }
       
         
        return getQuery(sel + itemQ+qr);
        
        
    }
    //responsible for reutrning a string qury for pagiantion usage
    public CQuery getSummerySql(String itemID,String sid, String wid) {

        
        String itemQ="";
        String sel = " select   i, ijls.uom, sum(ijls.qty)    "
                     + " from InventoryJournal  c left join c.lines ijls left join  ijls.item i   ";
        String qr = " group by  i ,ijls.uom ";
        if(!StringUtility.isEmptyString(itemID)) itemQ="  i.code like '%"+itemID+"' ";
        if (!StringUtility.isEmptyString(wid) && !StringUtility.isEmptyString(sid)) {

      
            sel +=   " where c.shop.id =?1 and  c.warehouse.id =?2   "
                    + qr;
            
            return    getQuery(sel,wid,sid);

        } else if (!StringUtility.isEmptyString(wid) && StringUtility.isEmptyString(sid)) {
            sel +=   " where   c.warehouse.id =?1  "
                    + qr;
            return getQuery(sel,wid);

        } else if (StringUtility.isEmptyString(wid) && !StringUtility.isEmptyString(sid)) {
            sel +=   " where   c.shop.id =?1  "
                    + qr;
            return getQuery(sel, sid);
        }
         
        return getQuery(sel+ (StringUtility.isEmptyString(itemQ)?"":"where "+ itemQ)+qr);
        
        
    }
    
    
    public InventoryJournal refDoc(String refcode,String documentType) {
        String qry="select i   from InventoryJournal c  where c.refCode="+refcode+" and c.documentType="+documentType+" ";
        InventoryJournal ij=ExecuteQuerySR(qry);
        return ij;
    }
    
    public static void main(String[] args) {
        InventoryJournalDAO dao = new InventoryJournalDAO();
        List lst = dao.getSummery("", "", Arrays.asList("09KL6DNYSSKOE3Z", "0DTSE5SPV7W7DCK",
                "0YYXS1ODFIJQ0J3", "1393687695761-XQ", "1394248512343-U0"));
    }
}
