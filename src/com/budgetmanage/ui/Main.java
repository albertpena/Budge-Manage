/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.budgetmanage.ui;

import com.budgetmanage.entities.BudgetUser;
import com.budgetmanage.ui.Consulting.FinancesConsultingFrm;
import com.budgetmanage.ui.consulting.MainPanel;
import com.budgetmanage.ui.maintenance.FinancesAddFrm;
import com.budgetmanage.ui.maintenance.UserMaintenanceFrm;
import com.budgetmanage.util.Constant;
import java.awt.BorderLayout;

/**
 *
 * @author Fulvio
 */
public class Main extends javax.swing.JFrame implements Constant{

    private static BudgetUser user;

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
    public Main() {
        initComponents();
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setLocation(200, 100);
        this.setLayout(new BorderLayout());
        dim = this.getPreferredSize();
        jPanel1.setPreferredSize(dim);
        LoginFrm login = new LoginFrm(jPanel1, this);
        com.budgetmanage.util.Util.addPanel(jPanel1, login);        
    }
    
        
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu4 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem26 = new javax.swing.JMenuItem();
        jMenuItem27 = new javax.swing.JMenuItem();
        jMenu3 = new javax.swing.JMenu();
        jMenuItem25 = new javax.swing.JMenuItem();
        jMenuItem23 = new javax.swing.JMenuItem();
        jMenuItem24 = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem20 = new javax.swing.JMenuItem();
        jMenuItem33 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();

        jMenuItem1.setText("jMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle(Constant.TITLE);
        setResizable(false);
        getContentPane().setLayout(null);

        jPanel1.setBackground(new java.awt.Color(204, 255, 204));
        jPanel1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));
        jPanel1.setLayout(new java.awt.BorderLayout());
        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 600, 550);
        jPanel1.setPreferredSize(this.getPreferredSize());

        jMenu4.setText("Presupuesto");
        jMenu4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu4MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu4);

        jMenu2.setText("Agregar");

        jMenuItem26.setText("Cuentas");
        jMenuItem26.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem26ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem26);

        jMenuItem27.setText("Finanzas");
        jMenuItem27.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem27ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem27);

        jMenuBar1.add(jMenu2);

        jMenu3.setText("Consultas");

        jMenuItem25.setText("Cuentas");
        jMenuItem25.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem25ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem25);

        jMenuItem23.setText("Finanzas");
        jMenuItem23.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem23ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem23);

        jMenuItem24.setText("Prestamos");
        jMenuItem24.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem24ActionPerformed(evt);
            }
        });
        jMenu3.add(jMenuItem24);

        jMenuBar1.add(jMenu3);

        jMenu1.setText("Mantenimientos");

        jMenuItem20.setText("Finanzas");
        jMenuItem20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem20ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem20);

        jMenuItem33.setText("Usuario");
        jMenuItem33.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem33ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem33);

        jMenuBar1.add(jMenu1);

        jMenu5.setText("Salir");
        jMenu5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jMenu5MouseClicked(evt);
            }
        });
        jMenuBar1.add(jMenu5);

        setJMenuBar(jMenuBar1);
        jMenuBar1.setVisible(false);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem23ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem23ActionPerformed
        FinancesConsultingFrm fcm = new FinancesConsultingFrm(CONSULT_PANEL_TITLE, jPanel1);
        com.budgetmanage.util.Util.addPanel(jPanel1,fcm);
    }//GEN-LAST:event_jMenuItem23ActionPerformed

    private void jMenuItem20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem20ActionPerformed
        FinancesConsultingFrm fcm = new FinancesConsultingFrm(EDIT_PANEL_TITLE, jPanel1);
        com.budgetmanage.util.Util.addPanel(jPanel1,fcm);
    }//GEN-LAST:event_jMenuItem20ActionPerformed

    private void jMenuItem27ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem27ActionPerformed
        FinancesAddFrm fad = new FinancesAddFrm();
        com.budgetmanage.util.Util.addPanel(jPanel1,fad);
    }//GEN-LAST:event_jMenuItem27ActionPerformed

    private void jMenuItem24ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem24ActionPerformed
        LoanPanel lp = new LoanPanel();
        com.budgetmanage.util.Util.addPanel(jPanel1,lp);
    }//GEN-LAST:event_jMenuItem24ActionPerformed

    private void jMenu5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu5MouseClicked
        LoginFrm log = new LoginFrm(jPanel1, this);
        com.budgetmanage.util.Util.addPanel(jPanel1,log);
        this.getJMenuBar().setVisible(false);
        jMenu5.setSelected(false);
    }//GEN-LAST:event_jMenu5MouseClicked

    private void jMenu4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jMenu4MouseClicked
       MainPanel main = new MainPanel(jPanel1);
       com.budgetmanage.util.Util.addPanel(jPanel1,main);
       jMenu4.setSelected(false);
    }//GEN-LAST:event_jMenu4MouseClicked

    private void jMenuItem26ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem26ActionPerformed
        AccountPanel ap = new AccountPanel();
        com.budgetmanage.util.Util.addPanel(jPanel1,ap);
    }//GEN-LAST:event_jMenuItem26ActionPerformed

    private void jMenuItem33ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem33ActionPerformed
        UserMaintenanceFrm umf = new UserMaintenanceFrm(jPanel1);
        com.budgetmanage.util.Util.addPanel(jPanel1, umf);
    }//GEN-LAST:event_jMenuItem33ActionPerformed

    private void jMenuItem25ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem25ActionPerformed
        ConsultaAccount ca = new ConsultaAccount(jPanel1);
        com.budgetmanage.util.Util.addPanel(jPanel1, ca);
    }//GEN-LAST:event_jMenuItem25ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }
    private java.awt.Dimension dim;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem20;
    private javax.swing.JMenuItem jMenuItem23;
    private javax.swing.JMenuItem jMenuItem24;
    private javax.swing.JMenuItem jMenuItem25;
    private javax.swing.JMenuItem jMenuItem26;
    private javax.swing.JMenuItem jMenuItem27;
    private javax.swing.JMenuItem jMenuItem33;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
