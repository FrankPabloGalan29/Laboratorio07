/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab07_Entidades;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Frank
 */
public class Medico {
    
    private String nombre;
    private String CMP;
    private List<Especialidad> especialidades;

    public Medico(String nombre, String CMP, List<Especialidad> especialidades) throws Exception{
        this.nombre = nombre;
        this.CMP = CMP;
        this.especialidades = especialidades;
        if(especialidades==null){
            throw new Exception("No se puede crear");
        }
    }
    
    public void agregarEspecialidad(Especialidad especialidad){
        this.especialidades.add(especialidad);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCMP() {
        return CMP;
    }

    public void setCMP(String CMP) {
        this.CMP = CMP;
    }

    public List<Especialidad> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidad> especialidades) {
        this.especialidades = especialidades;
    }
        
    public String getDatosMostrar(){
        return this.nombre + " | CMP: "+this.CMP;
    }
}
