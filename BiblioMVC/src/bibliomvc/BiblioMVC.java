/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bibliomvc;

import Vista.FrmPrincipal;
import Modelo.Modelo;
import Controlador.Controlador;

/**
 *
 * @author JuanMi
 */
public class BiblioMVC {

   

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Modelo modelo = new Modelo();
        FrmPrincipal vista = new FrmPrincipal();

        Controlador Controlador = new Controlador(modelo, vista);
        
        vista.setVisible(true);

    }

}
