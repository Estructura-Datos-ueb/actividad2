package co.edu.unbosque.view;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class ViewConsole {

    private String tamano;

    public ViewConsole() {

    }
    public void ingresarinformacion(String mensaje){
        tamano =  JOptionPane.showInputDialog(mensaje);
    }

    public void mostrarInformacion( String mensaje) {
        JOptionPane.showMessageDialog(null, mensaje);
    }

    public Integer mostrarOpcion(String mensaje) {
        return JOptionPane.showConfirmDialog(null, mensaje);
    }

    public String leerDato(String mensaje) {
        String opcion = "";
        opcion = JOptionPane.showInputDialog(mensaje);

        return opcion;
    }

    public String getTamano() {
        return tamano;
    }

    public void setTamano(String tamano) {
        this.tamano = tamano;
    }





}