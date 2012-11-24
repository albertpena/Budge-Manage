/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.budgetmanage.util;

import com.budgetmanage.entities.Budget;
import com.budgetmanage.entities.Expending;
import com.budgetmanage.entities.Finance;
import com.budgetmanage.entities.Ingress;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;

/**
 *
 * @author Nestor_Velasquez
 */
public class TableModel<T> extends AbstractTableModel{

    List<T> finances;
    private String[] columns;

    public TableModel() {
        this.finances = new ArrayList<>();
    }

    public TableModel(List<T> finances, String[] columns) {
        this.finances = finances;
        this.columns = columns;
    }
    
    public TableModel(List<T> finances) {
        this.finances = finances;
    }
     
    
    @Override
    public int getRowCount() {
        return finances.size();
    }

    @Override
    public int getColumnCount() {
        return columns.length;
    }

    @Override
    public String getColumnName(int i) {
        return columns[i];
    }
    
    
    
    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        String valueAt = null;
        Object obj =  finances.get(rowIndex);
        Finance finance = null;
        
        //Verifying the type of object
        if(obj instanceof Expending){
            finance = (Expending) obj;
        }else if(obj instanceof Ingress){
            finance = (Ingress) obj;
        }else if(obj instanceof Budget){
            finance = (Budget) obj;
        }        
        
        switch(columnIndex){
            case 0:{
                valueAt = finance.getId().toString();
                break;
            }
            case 1:{
                valueAt = finance.getName();
                break;
            }
            case 2:{
                valueAt = finance.getType();
                break;
            }
            case 3:{
                valueAt = String.valueOf(finance.getFinanceTotal());
                break;
            }
            case 4:{
                valueAt = finance.getUpdateDate();
                break;
            }
            case 5:{
                valueAt = String.valueOf(finance.getPriority());
                break;
            }
        }
        return valueAt;
    }

    /**
     * @param columns the columns to set
     */
    public void setColumns(String[] columns) {
        this.columns = columns;
    }
    
}
