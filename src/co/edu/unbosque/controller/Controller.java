package co.edu.unbosque.controller;

import co.edu.unbosque.model.ColaReales;
import co.edu.unbosque.model.PilaEnteros;
import co.edu.unbosque.view.ViewConsole;

public class Controller {

    private ViewConsole v;
    private ColaReales cola;
    private PilaEnteros pila;
    int numerof;

    public Controller (){
        
        
       
        	v = new ViewConsole();
        	cola = new ColaReales();
        	pila = new PilaEnteros(tamano);
		
    }
    

}