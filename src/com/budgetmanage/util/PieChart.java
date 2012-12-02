/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.budgetmanage.util;

import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Rectangle2D;
import java.util.List;
import javax.swing.JComponent;

/**
 *
 * @author Nestor_Velasquez
 */
public class PieChart extends JComponent {
    Font font;
    Rectangle2D rec;
    List<PieSlice> slices;

    public PieChart(List<PieSlice> slices) {
        this.slices = slices;
    }
    
    
    
    @Override
    public void paint(Graphics grphcs) {
        font = new Font("Sanserif", Font.BOLD, 12);        
        Graphics2D g2 = (Graphics2D) grphcs;
        g2.setFont(font);
        rec  =  new Rectangle(10, 10, 150, 150);
        draw(g2, rec);
    }
    
    public void draw(Graphics2D g, Rectangle2D rec){
        double pieSize = 0;
        int stringPosY = 20;
        int stringPosX = 200;
        
        for (PieSlice slice : slices) {
            pieSize += slice.value;
        }
        
        double currentValue = 0;
        int startAngle = 0;
        int arcAngle = 0;
        
        for (PieSlice slice : slices) {
            startAngle = (int)(currentValue * 360 / pieSize);
            arcAngle = (int)(slice.value * 360 / pieSize);

            // If this is the last slice, do this to ensure there is no gaps.
            if (slice.equals(slices.get(slices.size()-1))) {
                arcAngle = 360 - startAngle;
            }

            g.setColor(slice.color);
            
            g.fillArc((int)rec.getMinX(), (int)rec.getMinY(), (int)rec.getWidth(), (int)rec.getHeight(), startAngle, arcAngle);
            g.drawString(slice.name+" $"+slice.value, stringPosX, stringPosY);
            stringPosY = stringPosY + 20;
            currentValue += slice.value;
            
        }
    }
}
