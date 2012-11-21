/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.budgetmanage.util;

import java.awt.Component;
import java.awt.Container;
import javax.swing.JTextField;

/**
 *
 * @author Nestor_Velasquez
 */
public class Util {
    /*
     * @clearTextFields clear all text field in a container
     */
    public static void clearTextFields(Container c){
        Component[] components = c.getComponents();
        for(int i = 0; i < components.length; i++){
            if (components[i] instanceof Container){
               clearTextFields((Container) components[i]);
            }else if(components[i] instanceof JTextField){
                ((JTextField) components[i]).setText("");
            }
        }
    }
}
