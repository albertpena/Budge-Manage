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
public interface Constant {
    public int FRAME_HEIGHT = 600;
    public int FRAME_WIDTH = 606;
    public String TITLE = "Budget Friendly";
    public String[] EXPENDING_TYPES = {"Seleccione","Telecomunicaciones","Alquiler","Prestamo","Celular","Ocio","Estetica","Combustible","Transporte","Alimentos","Hogar","Otros"};
    public String[] INGRESS_TYPES = {"Seleccione","Salario","Remesas","Comisiones","Bonificaciones","Extras","Otros"};
    public int YES = 1;
    public int NO = 2;
    public String FORMAT_DATE = "dd-MMM-yyyy";
    public String COMBOX_FINANCE_MSG = "Seleccione el tipo de finanza que desea";
    public String NAME_ERROR_MSG = "Debe colocar un nombre para esta finanza";
    public String PRIORITY_ERROR_MSG = "Debe colocar la prioridad de esta finanza";
    public String TYPE_ERROR_MSG = "Debe colocar el tipo de finanza";
    public String VALUE_ERROR_MSG = "Debe colocar un monto";
    public String FINANCE_SUCCEED_MSG = "Finanza agregada satisfactoriamente";
    public String P_UNIT = "BudgeManagePU";
    public String[] FINANCES_ADD_ARRAY = {"Seleccione","Gastos","Ingresos"};
    public String[] FINANCES_EDIT_ARRAY = {"Seleccione","Gastos","Ingresos","Presupuesto"};
    public String GASTO = "GASTOS";
    public String INGRESO = "INGRESOS";
    public String NAME_MSG = "Nombre: Nombre designado para la finanza.";
    public String TYPE_MSG = "Tipo: Categoria a la que pertenece la finanza.";
    public String VALUE_MSG = "Monto: Valor numerico designado para la finanza.";
    public String PRIORITY_MSG = "Prioridad: Prioridad asignada a la finanza";
    public String USER_ERROR_MSG = "Favor colocar un nombre de usuario";
    public String PASS_ERROR_MSG = "Favor colocar la clave";
    
    Color BKG = new Color(204,255,204);
    
}
