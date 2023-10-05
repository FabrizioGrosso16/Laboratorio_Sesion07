/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package laboratorio_semana7;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author User001
 */
public class Cita {
    
    public static List <String> horasDisponibles = new ArrayList<>();
     private Paciente paciente;
     private Especialidad especialidad;
     private Medico medico;
     private int hora;
     private Date fecha;
     public Cita(Medico medico, Paciente paciente, Especialidad especialidad) {
        this.medico = medico;
        this.paciente = paciente;
        this.especialidad = especialidad;
         horasDisponibles.add("10.00am");
        horasDisponibles.add("12.00pm");
        horasDisponibles.add("1.00pm");
    }
    
   

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }
     public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public String mostrarDatos(){
        return this.getPaciente().getNombre() + " - " + this.getFecha().toLocaleString()
                +" - "+String.valueOf(this.getHora());
    }
}

