/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionmedicaap;

/**
 *
 * @author Angie Pineda
 */
public class PersonaAP {
    private String nombreap;
    private int edadap;
    private String direccionap;

    
    public PersonaAP(String nombreap, int edadap, String direccionap) {
        this.nombreap= nombreap;
        this.edadap = edadap;
        this.direccionap = direccionap;
    }

    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombreap);
        System.out.println("Edad: " + edadap);
        System.out.println("Dirección: " + direccionap);
    }
}