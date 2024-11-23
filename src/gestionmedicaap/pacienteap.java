/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionmedicaap;

/**
 *
 * @author Angie Pineda 
 */
public class pacienteap extends PersonaAP {
    private String enfermedadap;

   
    public pacienteap(String nombreap, int edadap, String direccioap, String enfermedadap) {
        super(nombreap, edadap, direccionap);
        this.enfermedadap= enfermedadap;
    }


    @Override
    public void mostrarInformacion() {
        super.mostrarInformacion();
        System.out.println("Enfermedadap: " + enfermedadap);
    }
}
    
}
