/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestionmedicaap;

/**
 *
 * @author Angie Pineda 
 */

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GestionMedicaAP extends JFrame {
    private JTextField nombreap, edadap, direccionap, especialidadap, experienciaap, enfermedad;
    private JTextArea resultadoAreaap;
    private JButton registrarMedicoButtonap, registrarPacienteButtonap;

    public GestionMedicaAP() {
        setTitle("Sistema de Gestión Médica");
        setSize(500, 600);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

    
        JPanel formPanel = new JPanel(new GridLayout(8, 2, 10, 10));
        formPanel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        
        formPanel.add(new JLabel("Nombre:"));
        nombreap = new JTextField();
        formPanel.add(nombreap);

        formPanel.add(new JLabel("Edad:"));
        edadap = new JTextField();
        formPanel.add(edadap);

        formPanel.add(new JLabel("Dirección:"));
        direccionap = new JTextField();
        formPanel.add(direccionap);

        formPanel.add(new JLabel("Especialidad (solo médico):"));
        especialidadap = new JTextField();
        formPanel.add(especialidadap);

        formPanel.add(new JLabel("Años de Experiencia (solo médico):"));
        experienciaap = new JTextField();
        formPanel.add(experienciaap);

        formPanel.add(new JLabel("Enfermedad (solo paciente):"));
        enfermedad = new JTextField();
        formPanel.add(enfermedad);

        
        registrarMedicoButtonap= new JButton("Registrar Médico");
        registrarPacienteButtonap = new JButton("Registrar Paciente");

        formPanel.add(registrarMedicoButtonap);
        formPanel.add(registrarPacienteButtonap);

        // Panel para mostrar resultados
        resultadoAreaap = new JTextArea();
        resultadoAreaap.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultadoAreaap);


        add(formPanel, BorderLayout.NORTH);
        add(scrollPane, BorderLayout.CENTER);

        registrarMedicoButtonap.addActionListener(new ActionListener () {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarMedico();
            }
        });

        registrarPacienteButtonap.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                registrarPaciente();
            }
        });
    }

    private void registrarMedico() {
        // Obtener datos del formulario
        String nombre = nombreap.getText();
        int edad = Integer.parseInt(edadap.getText());
        String direccion = direccionap.getText();
        String especialidad = especialidadap.getText();
        int experiencia = Integer.parseInt(experienciaap.getText());

      
        Medico medico = new Medico(nombre, edad, direccion, especialidad, experiencia);

        // Mostrar información en el área de resultados
        resultadoAreaap.append("Médico registrado:\n");
        resultadoAreaap.append("Nombre: " + nombre + "\n");
        resultadoAreaap.append("Edad: " + edad + "\n");
        resultadoAreaap.append("Dirección: " + direccion + "\n");
        resultadoAreaap.append("Especialidad: " + especialidad + "\n");
        resultadoAreaap.append("Años de Experiencia: " + experiencia + "\n\n");

       
        limpiarCampos();
    }

    private void registrarPaciente() {
        
        String nombre = nombreap.getText();
        int edad = Integer.parseInt(edadap.getText());
        String direccion = direccionap.getText();
        String enfermedad = enfermedad.getText();

       
        Paciente paciente = new Paciente(nombreap, edadap, direccionap, enfermedad);

        // Mostrar información en el área de resultados
        resultadoAreaap.append("Paciente registrado:\n");
        resultadoAreaap.append("Nombre: " + nombre + "\n");
        resultadoAreaap.append("Edad: " + edad + "\n");
        resultadoAreaap.append("Dirección: " + direccion + "\n");
        resultadoAreaap.append("Enfermedad: " + enfermedad + "\n\n");

       
        limpiarCampos();
    }

    private void limpiarCampos() {
        nombreap.setText("");
        edadap.setText("");
        direccionap.setText("");
        especialidadap.setText("");
        experienciaap.setText("");
        enfermedad.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() 
        {
            @Override
            public void run() {
                new GestionMedicaAP().setVisible(true);
            }
        });
    }
}