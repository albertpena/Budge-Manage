package com.budgetmanage.util;

import com.budgetmanage.entities.BudgetUser;

public class Util {
    
    private static BudgetUser user; 
    public static boolean numberValid(String number){
        try{
            Double in = Double.parseDouble(number);
        }catch(Exception e){
            return false;
        }
        return true;
    }

    /**
     * @return the user
     */
    public static BudgetUser getUser() {
        return user;
    }

    /**
     * @param aUser the user to set
     */
    public static void setUser(BudgetUser aUser) {
        user = aUser;
    }

    
}
