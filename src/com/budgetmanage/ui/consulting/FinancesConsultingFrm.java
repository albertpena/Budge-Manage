/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.budgetmanage.ui.Consulting;

import com.budgetmanage.entities.Budget;
import com.budgetmanage.entities.Expending;
import com.budgetmanage.entities.Finance;
import com.budgetmanage.entities.Ingress;
import com.budgetmanage.modeler.BudgetJpaController;
import com.budgetmanage.modeler.ExpendingJpaController;
import com.budgetmanage.modeler.IngressJpaController;
import com.budgetmanage.modeler.UserJpaController;
import com.budgetmanage.modeler.exceptions.NonexistentEntityException;
import com.budgetmanage.ui.Main;
import com.budgetmanage.ui.Maintenance.FinancesMaintenanceFrm;
import com.budgetmanage.ui.maintenance.FinancesAddFrm;
import com.budgetmanage.util.Constant;
import java.awt.Container;
import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Nestor_Velasquez
 */
public class FinancesConsultingFrm extends javax.swing.JPanel implements Constant{

    /**
     * Creates new form FinancesConsultingFrm
    */
    
    Container c;
    EntityManagerFactory emf;    
    Finance finance = null;
   
    public FinancesConsultingFrm(String name, Container c) {
        initComponents();
        emf = Persistence.createEntityManagerFactory(P_UNIT);
        jLabel13.setText(name);
        this.c = c;
        if(name.equalsIgnoreCase("EDITAR FINANZAS")){
            jButton3.setVisible(true);
        }        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane2 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        jLabel13 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jButton3 = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();

        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable2);

        setBackground(Constant.BKG);

        jPanel3.setBackground(new java.awt.Color(0, 204, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 3, 0, new java.awt.Color(0, 0, 0)));

        jLabel13.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(204, 255, 204));
        jLabel13.setText("Consultar Finanzas");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(215, 215, 215)
                .addComponent(jLabel13)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel13)
                .addContainerGap())
        );

        jPanel1.setBackground(Constant.BKG);
        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Busqueda", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11))); // NOI18N

        jLabel2.setText("Buscar por:");

        jButton1.setText("Buscar");
        jButton1.setBorderPainted(false);
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });

        jCheckBox1.setText("Buscar todos");
        jCheckBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jCheckBox1ItemStateChanged(evt);
            }
        });

        jButton2.setText("Limpiar");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 2, 11)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("jLabel1");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Seleccione", "Nombre", "Monto" }));
        jComboBox2.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox2ItemStateChanged(evt);
            }
        });

        jLabel4.setText("jLabel4");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jCheckBox1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(26, 26, 26)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2)))
                        .addGap(0, 40, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 18, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 14, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jCheckBox1)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1)
                        .addComponent(jButton1)
                        .addComponent(jButton2)))
                .addContainerGap())
        );

        jTextField1.setVisible(false);
        jLabel1.setVisible(false);
        jLabel4.setVisible(false);

        jPanel2.setBackground(Constant.BKG);
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Finanza", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 11))); // NOI18N

        jTable1.setFont(new java.awt.Font("Arial", 0, 10)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(jTable1);

        jLabel5.setForeground(new java.awt.Color(255, 0, 0));
        jLabel5.setText("Dar Doble-Click sobre la finanza para editarla.");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane3)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addComponent(jLabel5))
        );

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 0, 0));
        jLabel3.setText("*Seleccione un tipo de finanza");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(FINANCES_EDIT_ARRAY));
        jComboBox1.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jComboBox1ItemStateChanged(evt);
            }
        });

        jButton3.setText("Crear Finanza");
        jButton3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton3MouseClicked(evt);
            }
        });

        btnEliminar.setText("Eliminar");
        btnEliminar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnEliminarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton3))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEliminar)))
                .addContainerGap())
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jButton3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnEliminar)
                        .addGap(1, 1, 1)))
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jButton3.setVisible(false);
        btnEliminar.setEnabled(false);
        btnEliminar.setVisible(false);
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
        if(dataValidation()){
            jLabel1.setVisible(false);
            String what = jTextField1.getText().trim().toUpperCase();
            search(false, what);
        }else{
            jTextField1.setText("");
            jTextField1.grabFocus();
            jLabel1.setText(Constant.SEARCH_MSG_ERROR);
            jLabel1.setVisible(true);
        }
    }//GEN-LAST:event_jButton1MouseClicked

    private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox1ItemStateChanged
        String process = evt.getItem().toString();
        
        if(process.equalsIgnoreCase("seleccione")){
            reset();            
        }else if(process.equalsIgnoreCase(BUDGET)){
            jComboBox2.setModel(new DefaultComboBoxModel(new String[]{"Seleccione", "Nombre"}));
            jTextField1.setText("");
            jLabel3.setVisible(false);            
            jPanel1.setVisible(true);
            jCheckBox1.setSelected(false);
            btnEliminar.setVisible(false);
        }else{
            jComboBox2.setModel(new DefaultComboBoxModel(new String[]{"Seleccione", "Nombre", "Monto"}));
            jTextField1.setText("");
            jLabel3.setVisible(false);            
            jPanel1.setVisible(true);
            jCheckBox1.setSelected(false);
            btnEliminar.setVisible(true);
        }
    }//GEN-LAST:event_jComboBox1ItemStateChanged

    private void jCheckBox1ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jCheckBox1ItemStateChanged
        
        if(evt.getStateChange() == ItemEvent.SELECTED){
            search(true, null);
        }else{
            jTable1.removeAll();
            jPanel2.setVisible(false);
        }
    }//GEN-LAST:event_jCheckBox1ItemStateChanged

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
        reset();        
    }//GEN-LAST:event_jButton2MouseClicked
    
    private void search(boolean all, String what){
        
        String process = jComboBox1.getSelectedItem().toString().toUpperCase();
        String wich = jLabel4.getText().toUpperCase();
        
        
        UserJpaController ujc = new UserJpaController(emf);
        ExpendingJpaController ejc = new ExpendingJpaController(emf);
        IngressJpaController ijc = new IngressJpaController(emf);
        BudgetJpaController bjc = new BudgetJpaController(emf);
        
        List<Finance> finances = null;
          
        switch(process){
            case EXPENDING:{
                if(all){
                    finances = ejc.findAll();
                }else{
                    switch(wich){
                        case "NOMBRE":{
                            finances = ejc.findExpending("'%"+what+"%'");
                            break;
                        }
                        case "MONTO":{
                            finances = ejc.findExpending(Double.parseDouble(what));
                            break;
                        }
                    }                    
                }
                break;                    
            }
            case INGRESS:{
                if(all){
                    finances = ijc.findAll();
                }else{
                    switch(wich){
                        case "NOMBRE":{
                            finances = ijc.findIngress("'%"+what+"%'");
                            break;
                        }
                        case "MONTO":{
                            finances = ijc.findIngress(Integer.parseInt(what));
                            break;
                        }
                    }
                }
                break;
            }
            case BUDGET:{
                if(all){
                    finances = bjc.findAll();
                }else{
                    finances = bjc.findBudget(what);
                }
                break;
            }
        }
        
                 
            if(!finances.isEmpty()){ 
                Object[][] obj;
                DefaultTableModel model = new DefaultTableModel(){

                        @Override
                        public boolean isCellEditable(int i, int i1) {
                            return false;
                        }
                        
                    };
                if(process.equalsIgnoreCase(BUDGET)){
                    obj = new Object[finances.size()][BUDGET_TABLE_COLS.length];
                    int e;

                    for(int i = 0; i < finances.size(); i++){
                        Budget b = (Budget) finances.get(i);
                        e = 0;
                        obj[i][e] = b.getId();
                        e++;
                        obj[i][e] = b.getName();
                        e++;
                        obj[i][e] = b.getIngressTotal();
                        e++;
                        obj[i][e] = b.getExpendingTotal();
                        e++;
                        obj[i][e] = (b.getIngressTotal() - b.getExpendingTotal());
                        e++;
                        obj[i][e] = b.getGenerateDate();

                    }                    
                    model.setDataVector(obj, BUDGET_TABLE_COLS);
                }
                
                if (process.equalsIgnoreCase(INGRESS)){
                    obj = new Object[finances.size()][INGRESS_COL_ARRAY.length];
                    int e;
                    for(int i = 0; i < finances.size(); i++){
                        Ingress b = (Ingress) finances.get(i);
                        e = 0;
                        obj[i][e] = b.getId();
                        e++;
                        obj[i][e] = b.getName();
                        e++;
                        obj[i][e] = b.getFinanceTotal();
                        e++;
                        obj[i][e] = b.getUpdateDate();
                        
                    }
                    model.setDataVector(obj,INGRESS_COL_ARRAY);
                }
                if (process.equalsIgnoreCase(EXPENDING)){
                    obj = new Object[finances.size()][EXPENDING_COL_ARRAY.length];
                    int e;
                    for(int i = 0; i < finances.size(); i++){
                        Expending b = (Expending) finances.get(i);
                        e = 0;
                        obj[i][e] = b.getId();
                        e++;
                        obj[i][e] = b.getName();
                        e++;
                        obj[i][e] = CATEGORIES[b.getPriority()];
                        e++;
                        obj[i][e] = b.getFinanceTotal();
                        e++;
                        obj[i][e] = b.getUpdateDate();
                        
                    }
                    model.setDataVector(obj, EXPENDING_COL_ARRAY);
                }
                
                jTable1.setModel(model);
                jTable1.updateUI();
                jPanel2.setVisible(true);            
            }else{
                JOptionPane.showMessageDialog(this, "No se encontraron finanzas con estos criterios","Busqueda",JOptionPane.INFORMATION_MESSAGE);
            }
        
    }
    
    private void jComboBox2ItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jComboBox2ItemStateChanged
        String process = evt.getItem().toString();
        
        if(process.equalsIgnoreCase("Seleccione")){
            jLabel4.setVisible(false);
            jTextField1.setVisible(false);
        }else{
            jLabel4.setVisible(true);
            jTextField1.setVisible(true);
            jLabel4.setText(process);
        }       
    }//GEN-LAST:event_jComboBox2ItemStateChanged

    private void jButton3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton3MouseClicked
        c.removeAll();
        FinancesAddFrm faf = new FinancesAddFrm(jComboBox1.getSelectedIndex());
        faf.setPreferredSize(c.getPreferredSize());
        c.add(faf);
    }//GEN-LAST:event_jButton3MouseClicked

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
        
        int rowCount = jTable1.getSelectedRow();
        Object id = jTable1.getValueAt(rowCount, 0);

        switch(jComboBox1.getSelectedItem().toString().toUpperCase()){
//                case Constant.BUDGET:{
//                    BudgetJpaController bjc = new BudgetJpaController(emf);
//                    finance = bjc.findBudget((Integer)id);
//                    break;
//                }
            case Constant.EXPENDING:{
                ExpendingJpaController ejc = new ExpendingJpaController(emf);
                finance = ejc.findExpending((Integer)id);
                btnEliminar.setEnabled(true);
                break;
            }
            case Constant.INGRESS:{
                IngressJpaController ijc = new IngressJpaController(emf);
                finance = ijc.findIngress((Integer)id);
                btnEliminar.setEnabled(true);
                break;
            }
        }
        
        if(evt.getClickCount()>1){
            jTable1.setCellSelectionEnabled(false);
            FinancesMaintenanceFrm fmf = new FinancesMaintenanceFrm(c, finance, jComboBox1.getSelectedIndex());
            com.budgetmanage.util.Util.addPanel( (JPanel) c, fmf);
        }
    }//GEN-LAST:event_jTable1MouseClicked

    private void btnEliminarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnEliminarMouseClicked
        int rowNum = jTable1.getSelectedRow();
        if(jTable1.isRowSelected(rowNum)){
            switch(jComboBox1.getSelectedItem().toString().toUpperCase()){
//                case Constant.BUDGET:{
//                    BudgetJpaController bjc = new BudgetJpaController(emf);
//                    finance = bjc.findBudget((Integer)id);
//                    break;
//                }
                case Constant.EXPENDING:{
                    ExpendingJpaController ejc = new ExpendingJpaController(emf);
                    try {
                        ejc.destroy(finance.getId());
                    } catch (NonexistentEntityException ex) {
                        Logger.getLogger(FinancesConsultingFrm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
                case Constant.INGRESS:{
                    IngressJpaController ijc = new IngressJpaController(emf);
                    try {
                        ijc.destroy(finance.getId());
                    } catch (NonexistentEntityException ex) {
                        Logger.getLogger(FinancesConsultingFrm.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    break;
                }
            }
            JOptionPane.showMessageDialog(this, SUCEED_DESTROY_MSG, "Informacion", JOptionPane.INFORMATION_MESSAGE);
            reset();
            BudgetJpaController bjc = new BudgetJpaController(emf);
            bjc.generateBudget();
        }
    }//GEN-LAST:event_btnEliminarMouseClicked

    private void reset(){
        jLabel3.setVisible(true);
        jPanel1.setVisible(false);
        jPanel2.setVisible(false);
        jComboBox1.setSelectedIndex(0);        
        jCheckBox1.setSelected(false);
        jTextField1.setText("");
        jLabel1.setVisible(false);
        jComboBox2.setSelectedIndex(0);
        btnEliminar.setVisible(false);
    }  
    
    private boolean dataValidation(){
        String what = jTextField1.getText().trim();
        if(jLabel4.getText().equalsIgnoreCase("ID")){
            if(!com.budgetmanage.util.Util.numberValid(what)){
                JOptionPane.showMessageDialog(this,"Favor introducir un id valido", "Error",JOptionPane.ERROR_MESSAGE);
                return false;
            }
        }
        if (what.equalsIgnoreCase("")){
            return false;
        }        
        return true;
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEliminar;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JComboBox jComboBox2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables

}

