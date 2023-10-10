/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package laboratorio07;

import Lab07_Entidades.Cita;
import Lab07_Entidades.Medico;
import Lab07_Entidades.Paciente;
import Lab07_Pantallas.JFrameGestorDeCitas;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Frank
 */
public class Laboratorio07 {
    
    public static List<Cita> citasEnElSistema;
    public static List<Paciente> listaDePacientes;
    public static List<Medico> listaDeMedicos;
   
    public static List<String> horasDisponibles = new ArrayList<>();
    public static List<String> fechasDisponibles = new ArrayList<>(); 
    public static List<String> sexosDisponibles = new ArrayList<>();
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //genera las listas en blanco para todo sistema hasta que cierre
        citasEnElSistema = new ArrayList<>();
        listaDePacientes = new ArrayList<>();
        listaDeMedicos = new ArrayList<>();
        
        horasDisponibles.add("9:00am");
        horasDisponibles.add("9:30am");
        horasDisponibles.add("10:00am");
        horasDisponibles.add("10:30am");
        horasDisponibles.add("11:00am");
        horasDisponibles.add("11:30am");
        
        fechasDisponibles.add("01/01/2023");
        fechasDisponibles.add("02/01/2023");
        fechasDisponibles.add("03/01/2023");
        fechasDisponibles.add("04/01/2023");
        fechasDisponibles.add("05/01/2023");
        
        sexosDisponibles.add("MASCULINO");
        sexosDisponibles.add("FEMENINO");
        
        //inicio la ventana principal
        JFrameGestorDeCitas framePrincipal = new JFrameGestorDeCitas();
        framePrincipal.setLocationRelativeTo(null);// Centra formulario
        framePrincipal.setVisible(true);
    }
    
}
