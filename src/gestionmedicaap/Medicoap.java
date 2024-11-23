/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionmedicaap;

/**
 *
 * @author Angie Pineda
 */
public class Medicoap extends PersonaAP{
    private String especialidadap;
    private int anosExperienciaap;

   
    public Medicoap(String nombreap, int edadap, String direccionap, String especialidadap, int anosExperiencia) {
        super(nombreap, edadap, direccionap);
        this.especialidadap = especialidadap;
        this.anosExperienciaap = anosExperienciaap;
    }

 
    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Especialidad: " + especialidadap);
        System.out.println("Años de Experiencia: " + anosExperienciaap);
    }
}
