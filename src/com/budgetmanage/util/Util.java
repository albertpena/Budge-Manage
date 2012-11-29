/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.budgetmanage.util;

import java.awt.Color;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Nestor_Velasquez
 */
public class Util {
    /*
     * @clearTextFields clear all text field in a container
     */
    public static List<Color> colors = new ArrayList<>();
    
    public static boolean numberValid(String number){
        try{
            Double in = Double.parseDouble(number);
        }catch(Exception e){
            return false;
        }
        return true;
    }
    
    public static Color getColor(){
        addColor();
        Color color = null;
        double number = Math.random() * (9-0)+1;
        number = (0+number);
        int pos = (int)number;
        
        try{
        color = colors.get(pos); 
        }catch(Exception ex){
            color = Color.white;
        }finally{
            return color;
        }                
    }
    
    private static void addColor(){
        colors.add(Color.red);
        colors.add(Color.cyan);
        colors.add(Color.darkGray);
        colors.add(Color.gray);
        colors.add(Color.lightGray);
        colors.add(Color.magenta);
        colors.add(Color.pink);
        colors.add(Color.white);
        colors.add(Color.yellow);
                
    }
}
