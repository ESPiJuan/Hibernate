/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author JuanMi
 */
public class Modelo {

    private ArrayList<Alumnos> lista;

    public Modelo() {

    }

    public String[][] datos() {
        int index = 0;
        String[][] datos = new String[100][4];
        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction(); //Crea una transacción
        lista = (ArrayList<Alumnos>) session.createQuery("from Alumnos").list();

        for (Alumnos a : lista) {
            if (index == 100) {
                break;
            }else{
                datos[index][0] = a.getDni();
                datos[index][1] = a.getNombre();
                datos[index][2] = a.getApellido1();
                datos[index][3] = a.getApellido2();
                index++;
            }

        }
        tx.commit();
        session.close();
        return datos;

    }

    public void Baja(String dni) {
        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        lista = (ArrayList<Alumnos>) session.createQuery("from Alumnos").list();

        for (Alumnos a : lista) {
            if (dni.equalsIgnoreCase(a.getDni())) {
                session.delete(a);

            }

        }

        System.out.println("Objeto borrado");
        tx.commit(); //MAterializa la transacción
        session.close();

    }

    public void alta(String dni, String nombre, String apellido1, String apellido2) {
        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        Alumnos a = new Alumnos();
        a.setDni(dni);
        a.setNombre(nombre);
        a.setApellido1(apellido1);
        a.setApellido2(apellido2);
        session.save(a);
        tx.commit();
        session.close();
    }

    public void modificar(String dni, String nombre, String apellido1, String apellido2) {
        Transaction tx = null;
        Session session = HibernateUtil.getSessionFactory().openSession();
        tx = session.beginTransaction();
        lista = (ArrayList<Alumnos>) session.createQuery("from Alumnos").list();
        for (Alumnos a : lista) {
            if (dni.equalsIgnoreCase(a.getDni())) {
                a.setDni(dni);
                a.setNombre(nombre);
                a.setApellido1(apellido1);
                a.setApellido2(apellido2);
                session.update(a);
            }

        }

        tx.commit();
        session.close();
    }

}
