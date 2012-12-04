/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.budgetmanage.util;

import java.awt.Color;
import java.awt.Font;

/**
 *
 * @author Nestor_Velasquez
 */
public interface Constant {
    /*************************Errors Constant********************************/
    public String NAME_ERROR_MSG = "Debe colocar un nombre para esta finanza";
    public String PRIORITY_ERROR_MSG = "Debe colocar la prioridad de esta finanza";
    public String TYPE_ERROR_MSG = "Debe colocar el tipo de finanza";
    public String VALUE_ERROR_MSG = "Debe colocar un monto valido";
    public String EXIST_ERROR_MSG = "Existe una finanza con este criterio";
    public String NON_EXISTS_ERROR_MSG = "No existen finanzas de este tipo";
    public String USER_ERROR_MSG = "Favor colocar un nombre de usuario";
    public String PASS_ERROR_MSG = "Favor colocar la clave";
    public String SEARCH_MSG_ERROR = "Debe colocar un criterio de busqueda";
    public String INVALID_USER_ERROR = "El usuario especificado no existe o la clave es invalida";
    public String PASS_NOT_MATCH_ERROR = "Claves no Coinciden";
    /*************************Messages And Labels***************************************/
    public String COMBOX_FINANCE_MSG = "Seleccione el tipo de finanza que desea";
    public String SUCCED_MSG = "Registro guardado satisfactoriamente";
    public String SUCEED_DESTROY_MSG = "Registro Borrado Satisfactoriamente";
    public String FINANCE_SUCCEED_MSG = "Finanza guardada satisfactoriamente";
    public String TITLE = "Budget Friendly";
    public String EXPENDING = "GASTOS";
    public String INGRESS = "INGRESOS";
    public String BUDGET = "PRESUPUESTO";
    public String TYPE_MSG = "Tipo: Categoria a la que pertenece la finanza.";
    public String VALUE_MSG = "Monto: Valor numerico designado para la finanza.";
    public String PRIORITY_MSG = "Prioridad: Prioridad asignada a la finanza";
    public String MAIN_PANEL_TITLE = "Finanzas Amigables";
    public String EDIT_PANEL_TITLE = "Editar Finanzas";
    public String CONSULT_PANEL_TITLE = "Consultar Finanzas";
    public String ADD_PANEL_TITLE = "Agregar Finanzas";
    public String NAME_MSG = "Nombre: Nombre designado para la finanza.";
    public String SUCEED_MSG = "Finanza guardada Satisfactoriamente";
    
    /**************************Parameters*********************************************/
    public int FRAME_HEIGHT = 602;
    public int FRAME_WIDTH = 606;
    public int YES = 1;
    public int NO = 2;
    public String PU = "BudgeManagePU";
    public String FORMAT_DATE = "dd-MMM-yyyy";
    public String P_UNIT = "BudgeManagePU";
    public double INITIAL_ACCOUNT_VALUE = 30000.00;
    
    /***************************Lists************************************************/
    public String[] FIXED_EXPENSE = {"Seleccione","Alquiler","Electricidad","Agua","Basura","Alimentacion","Combustible","Educacion","Otros","Transporte"};
    public String[] SERVICES = {"Seleccione","Comunicaciones","Estetica","Prestamo","Tarjetas","Otros"};
    public String[] LEISURE = {"Seleccione","Cine","Familia","Disco","Compras","Imprevistos","Otros"};
    public String[] INGRESS_TYPES = {"Seleccione","Salario","Remesas","Comisiones","Bonificaciones","Extras","Otros"};    
    public String[] FINANCES_ADD_ARRAY = {"Seleccione","Gastos","Ingresos"};
    public String[] FINANCES_EDIT_ARRAY = {"Seleccione","Gastos","Ingresos","Presupuesto"};
    public String[] INGRESS_COL_ARRAY = {"Numero", "Nombre", "Monto", "Fecha Modificacion"};
    public String[] EXPENDING_COL_ARRAY = {"Numero", "Nombre", "Categoria", "Monto", "Modificacion"};
    public String[] BUDGET_TABLE_COLS = {"ID","Nombre","Ingresos", "Gastos", "Restante", "Generado","Actualizado"};
    public String[]CATEGORIES = {"Seleccione", "Gastos fijos", "Servicios", "Ocio y Demas"};
    public String[] BANKS = {"Seleccione","BHD","APAP","ASOC. CIBAO","ALNAP","SCOTIABANK","VIMENCA","BANCO POPULAR","Banco Leon","Santa Cruz",
                             "BANRESERVAS"};
    
   /************************Colors**************************************************/ 
    public Color BKG = new Color(204,255,204);
    public Color FIXED_EXPENSE_COLOR = Color.BLUE;
    public Color SERVICES_COLOR = new Color(0, 102, 102);
    public Color LEISURE_COLOR = Color.RED;
    public Font ALL_FONTS = new Font("Tahoma", Font.PLAIN, 11);
    public Font TITLE_FONT = new Font("Arial",Font.BOLD,12);
    
}
