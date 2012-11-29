/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.budgetmanage.util;

import java.awt.Color;

/**
 *
 * @author Nestor_Velasquez
 */
public class PieSlice {
    Color color;
    double value;
    String name;
    
    public PieSlice(Color color, double value, String name) {
        this.color = color;
        this.value = value;
        this.name = name;
    }
}
