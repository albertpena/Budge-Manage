package com.budgetmanage.util;

import com.budgetmanage.entities.BudgetUser;
import java.awt.BorderLayout;
import javax.swing.JPanel;

public class Util {
    
    public static boolean numberValid(String number){
        try{
            Double in = Double.parseDouble(number);
        }catch(Exception e){
            return false;
        }
        return true;
    }
    
    public static void addPanel(JPanel p, JPanel c){
        p.removeAll();       
        c.setPreferredSize(p.getPreferredSize());          
        p.add(c, BorderLayout.CENTER);
        p.updateUI(); 
    }


    
}
