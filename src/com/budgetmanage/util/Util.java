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
  /**
   * Method for add a new JPanelFrame to current principal panel.
   * @param p is the Principal panel the application.
   * @param c the Panel which want add  and show.
   */
    public static void addPanel(JPanel p, JPanel c){
        p.removeAll();       
        c.setPreferredSize(p.getPreferredSize());          
        p.add(c, BorderLayout.CENTER);
        p.updateUI(); 
    }


    
}
