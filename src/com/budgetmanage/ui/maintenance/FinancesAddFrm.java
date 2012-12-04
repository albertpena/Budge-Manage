
package com.budgetmanage.ui.maintenance;

import com.budgetmanage.entities.Expending;
import com.budgetmanage.entities.Ingress;
import com.budgetmanage.modeler.BudgetJpaController;
import com.budgetmanage.modeler.ExpendingJpaController;
import com.budgetmanage.modeler.IngressJpaController;
import com.budgetmanage.modeler.exceptions.PreexistingEntityException;
import com.budgetmanage.ui.Main;
import com.budgetmanage.util.Constant;
import java.awt.event.ItemEvent;
import java.awt.event.KeyEvent;
import java.sql.Timestamp;
import java.util.Date;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.BorderFactory;
import javax.swing.DefaultComboBoxModel;

/**
 *
 * @author Nestor_Velasquez
 */
public class FinancesAddFrm extends javax.swing.JPanel implements Constant {

    /**
     * Creates new form FinancesAddFrm
     */
    public FinancesAddFrm() {
        initComponents();
    }

    public FinancesAddFrm(int what) {
        initComponents();        
        switch(what){
            case 1:{
                jComboBox1.setSelectedItem(FINANCES_ADD_ARRAY[1]);
                break;
            }
            case 2:{
                jComboBox1.setSelectedItem(FINANCES_ADD_ARRAY[2]);
                break;
            }
        }
    }
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox1 = new javax.swing.JComboBox();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jButton1 = new javax.swing.JButton();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jComboBox3 = new javax.swing.JComboBox();
        jLabel15 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();

        setBackground(BKG);
        setForeground(new java.awt.Color(99, 99, 241));

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(Constant.FINANCES_ADD_ARRAY));
        jComboBox1.setToolTipText(Constant.COMBOX_FINANCE_MSG);
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jPanel1.setBackground(BKG);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del"+jComboBox1.getSelectedItem().toString().toLowerCase()));

        jLabel2.setText("Nombre");

        jLabel5.setText("Monto");

        jLabel6.setText("Categoria");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Gasto Fijo", "Servicios", "Ocio y Demas" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });

        jButton1.setMnemonic(KeyEvent.VK_ENTER);
        jButton1.setText("Guardar");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setText("jLabel1");

        jLabel14.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 51, 51));
        jLabel14.setText("jLabel1");

        jLabel16.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 51, 51));
        jLabel16.setText("jLabel1");

        jButton3.setText("Limpiar");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        jLabel3.setText("Tipo");

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione" }));

        jLabel15.setFont(new java.awt.Font("Tahoma", 2, 11)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 51, 51));
        jLabel15.setText("jLabel1");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jComboBox3, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jComboBox2, 0, 115, Short.MAX_VALUE)
                    .addComponent(jFormattedTextField1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(jLabel1)
                    .addComponent(jLabel14)
                    .addComponent(jLabel16)
                    .addComponent(jButton3))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jFormattedTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel14))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addContainerGap(32, Short.MAX_VALUE))
        );

        jLabel1.setVisible(false);
        jLabel14.setVisible(false);
        jLabel16.setVisible(false);
        jLabel15.setVisible(false);

        jPanel2.setBackground(BKG);
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Leyenda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 12), new java.awt.Color(51, 0, 51))); // NOI18N

        jLabel7.setForeground(new java.awt.Color(99, 99, 241));
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText(NAME_MSG);

        jLabel8.setForeground(new java.awt.Color(99, 99, 241));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText(TYPE_MSG);

        jLabel9.setForeground(new java.awt.Color(99, 99, 241));
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel9.setText(VALUE_MSG);

        jLabel10.setForeground(new java.awt.Color(99, 99, 241));
        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel10.setText(PRIORITY_MSG);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10)
                    .addComponent(jLabel9)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jLabel7)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(0, 12, Short.MAX_VALUE))
        );

        jLabel11.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 0, 0));
        jLabel11.setText("*Seleccione un tipo de finanza");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(255, 51, 51));
        jLabel12.setText("jLabel12");

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 255, 204));
        jLabel13.setText(ADD_PANEL_TITLE);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(jLabel13)
                .addContainerGap(278, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel11))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel12))
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 15, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        jPanel1.setVisible(false);
        jPanel1.setBackground(this.getBackground());
        jPanel2.setVisible(false);
        jPanel2.setBackground(this.getBackground());
        jLabel12.setVisible(false);
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        reset();
        String process = evt.getItem().toString();
        evt.getStateChange();
        if(evt.getStateChange() == ItemEvent.SELECTED){
            if(process.equalsIgnoreCase("seleccione")){
                jPanel1.setVisible(false);
                jPanel2.setVisible(false);
            }else{
                //jTextField1.setText("");
                jLabel11.setVisible(false);
                jLabel12.setVisible(false);
                switch(process.toUpperCase()){
                    case EXPENDING:{
                        jComboBox2.setVisible(true);
                        jLabel6.setVisible(true);
                        break;
                    }
                    case INGRESS:{
                        jComboBox3.setModel(new DefaultComboBoxModel(INGRESS_TYPES));
                        jComboBox2.setVisible(false);
                        jLabel6.setVisible(false);
                        break;
                    }                
                }

                jPanel1.setBorder(BorderFactory.createTitledBorder("Datos de la nueva finanza"));
                jPanel1.setVisible(true);
                jPanel2.setVisible(true);            
            }
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        boolean isOk = true;
        unactivateErrorMsg();
        int priority = jComboBox2.getSelectedIndex();        
        String process = jComboBox1.getSelectedItem().toString();
        
        
        String name = jTextField1.getText().trim().toUpperCase();
        String type = jComboBox3.getSelectedItem().toString();
        double value = 0;
        try{
            value = Double.parseDouble(jFormattedTextField1.getText().trim());
        }catch(Exception e){
            jLabel14.setText(Constant.VALUE_ERROR_MSG);
            jLabel14.setVisible(true);
        }
        
        Date actualDate = new Date();
        Timestamp date = new Timestamp(actualDate.getTime());
              
        
        if(dataValidation(name, type, priority, value, process)){
            
            EntityManagerFactory emf = Persistence.createEntityManagerFactory(P_UNIT);
            ExpendingJpaController ejpa = new ExpendingJpaController(emf);
            IngressJpaController ijpa = new IngressJpaController(emf);
            BudgetJpaController bjc = new BudgetJpaController(emf);
            switch(process.toUpperCase()){            
                case EXPENDING:{
                    Expending expending = new Expending(Main.getUser(), name, value, date, date, priority, type);
                try {
                    //Database saving                
                    ejpa.create(expending);                 
                } catch (PreexistingEntityException ex) {
                    jLabel12.setText(ex.getMessage());
                    jLabel12.setVisible(true);
                    isOk = false;               }
                    break;
                }
                case INGRESS:{
                     Ingress ingress = new Ingress(Main.getUser(), name, value, date, date, priority, type);
                    try {
                        //Saving on DB
                        ijpa.create(ingress);
                    }catch (PreexistingEntityException ex) {
                        jLabel12.setText(ex.getMessage());
                        jLabel12.setVisible(true);
                        isOk = false;
                    }
                         break;
                }            
            }
            if(isOk){
                jLabel12.setText(Constant.FINANCE_SUCCEED_MSG);
                jLabel12.setVisible(true);
                
                reset();               
                jComboBox1.setSelectedIndex(0);
                jLabel11.setVisible(true);                
                
                if(!(bjc.findAll().isEmpty())){
                    bjc.generateBudget();
                }                
            }
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        reset();
    }//GEN-LAST:event_jButton3MouseClicked

    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        switch(evt.getItem().toString().toLowerCase()){
            case "gasto fijo":{
                jComboBox3.setModel(new DefaultComboBoxModel(FIXED_EXPENSE));
                break;
            }
            case "servicios": {
                jComboBox3.setModel(new DefaultComboBoxModel(SERVICES));
                break;
            }
            case "ocio y demas": {
                jComboBox3.setModel(new DefaultComboBoxModel(LEISURE));
                break;
            }   
        }
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    public boolean dataValidation(String name, String type, int pr, double value, String process){

        if(name.equals("")){
            jLabel1.setText(Constant.NAME_ERROR_MSG);
            jLabel1.setVisible(true);
            jTextField1.grabFocus();
            return false;
        }
        if(type.equalsIgnoreCase("Seleccione")){
            jLabel15.setText(Constant.TYPE_ERROR_MSG);
            jLabel15.setVisible(true);
            return false;
        }
        
        if(value == 0){            
            jLabel14.setText(Constant.VALUE_ERROR_MSG);
            jLabel14.setVisible(true);
            jFormattedTextField1.grabFocus();
            return false;
        }
        
        if(process.equalsIgnoreCase(EXPENDING)){
            if(pr == 0){
                jLabel16.setText(Constant.PRIORITY_ERROR_MSG);
                jLabel16.setVisible(true);
                return false;
            }
        }
        return true;
    }
    
    public void unactivateErrorMsg(){
        jLabel1.setVisible(false);
        jLabel14.setVisible(false);
        jLabel15.setVisible(false);
        jLabel16.setVisible(false);
        
    }
    public void reset(){
        jTextField1.setText("");        
        jFormattedTextField1.setText("");
        jComboBox2.setSelectedIndex(0);
        jComboBox3.setSelectedIndex(0);        
 //       jLabel12.setVisible(false);
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JComboBox jComboBox3;
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
     
}
