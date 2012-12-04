/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.budgetmanage.ui.maintenance;

import com.budgetmanage.entities.BudgetUser;
import com.budgetmanage.modeler.UserJpaController;
import com.budgetmanage.ui.LoginFrm;
import com.budgetmanage.util.Constant;
import java.awt.Container;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.text.BadLocationException;

/**
 *
 * @author Fulvio
 */
public class RegisterFrm extends javax.swing.JPanel implements Constant {

    private Container container;

    private JFrame frame;
    /**
     * Creates new form RegisterFrm
     */
    public RegisterFrm() {
        initComponents();
    }

    public RegisterFrm(Container container, JFrame frame) {
        this.container = container;
        this.frame = frame;
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtLaName = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        txtUserName = new javax.swing.JTextField();
        btnCancel = new javax.swing.JButton();
        btnCreate = new javax.swing.JButton();

        setBackground(com.budgetmanage.util.Constant.BKG);

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 255, 204));
        jLabel13.setText("Crear de Usuarios");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(162, 162, 162)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel1.setBackground(com.budgetmanage.util.Constant.BKG);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Datos del Usuario", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, TITLE_FONT));

        jLabel1.setFont(Constant.ALL_FONTS);
        jLabel1.setText("Nombre");
        jLabel1.setName(""); // NOI18N

        txtName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel3.setFont(Constant.ALL_FONTS);
        jLabel3.setText("Apellidos");
        jLabel3.setName(""); // NOI18N

        txtLaName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtLaName.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtLaNameKeyReleased(evt);
            }
        });

        jLabel2.setFont(Constant.ALL_FONTS);
        jLabel2.setText("Clave Secreta");
        jLabel2.setName(""); // NOI18N

        txtPassword.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel4.setFont(Constant.ALL_FONTS);
        jLabel4.setText("Nombre Usuario");
        jLabel4.setName(""); // NOI18N

        txtUserName.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnCancel.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        btnCancel.setText("Volver");
        btnCancel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelActionPerformed(evt);
            }
        });

        btnCreate.setFont(new java.awt.Font("Calibri", 0, 13)); // NOI18N
        btnCreate.setText("Crear");
        btnCreate.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnCreateMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1))
                        .addGap(53, 53, 53)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtLaName)
                            .addComponent(txtName)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtPassword)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnCancel, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCreate, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtUserName))))
                .addContainerGap(38, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtLaName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancel)
                    .addComponent(btnCreate))
                .addContainerGap(25, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(228, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(111, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelActionPerformed
        int opt = JOptionPane.showConfirmDialog(null, "¿Desea cancelar el registro?",
                Constant.TITLE, JOptionPane.YES_NO_OPTION);
        //If [opt] had '1' value is the option yes and I show the login JPanel
        if (opt == 0) {
            LoginFrm loginf = new LoginFrm(container, frame);
            com.budgetmanage.util.Util.addPanel((JPanel)container, loginf);
        }
    }//GEN-LAST:event_btnCancelActionPerformed

    private void btnCreateMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCreateMouseClicked
        //checkign all JTextField searching Empty fields. 
        if (txtLaName.getText().trim().isEmpty() || txtName.getText().trim().isEmpty()
                || txtUserName.getText().trim().isEmpty() || txtPassword.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Exigen campos vacios favor completar",
                    null, JOptionPane.ERROR_MESSAGE);
        } else {
            //creating instances for work to persistences into UserBudget
            EntityManagerFactory emf = Persistence.createEntityManagerFactory(P_UNIT);
            UserJpaController userController = new UserJpaController(emf);

            //Creating a new object BudgetUser
            BudgetUser user = new BudgetUser();
            //Setting the properties necesaries for a new user.
            user.setNombre(txtName.getText());
            user.setApellidos(txtLaName.getText());
            user.setPassword(txtPassword.getText().replace("@", "|"));
            user.setUserName(txtUserName.getText());

            boolean exitoso = userController.create(user);
            if (exitoso) {
                JOptionPane.showMessageDialog(null, "Usuario agregado satisfactoriamente",
                        "Mensaje", JOptionPane.INFORMATION_MESSAGE);
                
                LoginFrm login = new LoginFrm(container, frame);
               com.budgetmanage.util.Util.addPanel((JPanel)container, login);
            } else {
                try {
                    if(userController.getUser(txtUserName.getText()) != null){
                         JOptionPane.showMessageDialog(null, "Pre-existe un usuario con ese nombre.",
                        "Error al Insertar", JOptionPane.ERROR_MESSAGE);
                    }
                } catch (Exception ex) {
                    Logger.getLogger(RegisterFrm.class.getName()).log(Level.SEVERE, null, ex);
                }
                
            }
        }
    }//GEN-LAST:event_btnCreateMouseClicked

    private void txtLaNameKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtLaNameKeyReleased
         try {
            txtUserName.setText(txtName.getText(0, 1)+txtLaName.getText());
        } catch (BadLocationException ex) {
            Logger.getLogger(RegisterFrm.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_txtLaNameKeyReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnCreate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtLaName;
    private javax.swing.JTextField txtName;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtUserName;
    // End of variables declaration//GEN-END:variables
}