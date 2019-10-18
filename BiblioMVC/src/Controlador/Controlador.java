/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controlador;

import Modelo.Modelo;
import Vista.FrmPrincipal;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.beans.PropertyChangeListener;
import javax.swing.Action;

import javax.swing.JOptionPane;

/**
 *
 * @author JuanMi
 */
public class Controlador {

    private static Modelo Modelo;
    private static FrmPrincipal Vista;

    public Controlador(Modelo Modelo, FrmPrincipal Vista) {
        this.Modelo = Modelo;
        this.Vista = Vista;

        Vista.btnModificaciones.addActionListener(new Modificar());
        Vista.btnBajas.addActionListener(new Baja());
        Vista.btnSalir.addActionListener(new Salir());
        Vista.btnAltas.addActionListener(new Alta());
        String [][] datos = Modelo.datos();
        Vista.montarTabla(datos);
    }

    private static class Modificar implements ActionListener {

        public Modificar() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Modelo.modificar(Vista.txtDni.getText(), Vista.txtNombre.getText(), Vista.txtApellido1.getText(), Vista.txtApellido2.getText());
            Vista.txtDni.setText("");
            Vista.txtApellido1.setText("");
            Vista.txtApellido2.setText("");
            Vista.txtNombre.setText("");
             JOptionPane.showMessageDialog(null, "Operación realizada correctamente,reinicie para ver los cambios");

        }
    }

    private static class Baja implements ActionListener {

        public Baja() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            String dni = JOptionPane.showInputDialog("Escribe dni a eliminar");
            Modelo.Baja(dni);

        }
    }

    private static class Salir implements ActionListener {

        public Salir() {

        }

        @Override
        public void actionPerformed(ActionEvent e) {
            
            System.exit(0);
        }
    }

    private static class Alta implements ActionListener {

        public Alta() {
        }

        @Override
        public void actionPerformed(ActionEvent e) {
            Modelo.alta(Vista.txtDni.getText(), Vista.txtNombre.getText(), Vista.txtApellido1.getText(), Vista.txtApellido2.getText());
            Vista.txtDni.setText("");
            Vista.txtApellido1.setText("");
            Vista.txtApellido2.setText("");
            Vista.txtNombre.setText("");
        }
    }

}
