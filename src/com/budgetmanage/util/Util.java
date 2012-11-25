/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.budgetmanage.util;

/**
 *
 * @author Nestor_Velasquez
 */
public class Util {
    /*
     * @clearTextFields clear all text field in a container
     */
    public static boolean numberValid(String number){
        try{
            Integer in = Integer.parseInt(number);
        }catch(Exception e){
            return false;
        }
        return true;
    }
}
