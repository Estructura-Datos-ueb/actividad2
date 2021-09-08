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
        	start();
    }
    
    public void start() {
    	try {
    		int opcion = v.mostrarOpcion("¿Que tipo de Estructura desea Crear?");
        	
        	if(opcion == 0) {
        		try {
        			int tamano = Integer.parseInt(v.leerDato("Ingrese el tamano de la pila que desea crear"));
        			pila = new PilaEnteros(tamano);
        			showMenu("pila");
    			} catch (Exception e) {
    				// TODO: handle exception
    				v.mostrarInformacion("Error: Opcion o dato incorrecto");
    				start();
    			}
        		
        		
        	}else {
        		try {
        			int tamano = Integer.parseInt(v.leerDato("Ingrese el tamano de la Cola que desea crear"));
        			cola = new ColaReales(tamano);
        			showMenu("cola");
    			} catch (Exception e) {
    				// TODO: handle exception
    				v.mostrarInformacion("Error: Opcion o dato incorrecto");
    				start();
    			}
        	}
		} catch (Exception e) {
			// TODO: handle exception
			System.exit(0);
		}
    }
    
    public void showMenu(String type) {
    	
    	if(type.equalsIgnoreCase("pila")) {
    		
    		try {
    			String[] o = {"push", "pop", "getTop", "GetNumberOfElements", "isFull", "IsEmpty" , "PrintStack"};
        		String metodo = v.mostrarLista("¿Que metodo desea utilizar?", o);
    			if(metodo.equalsIgnoreCase("push")) {
        			int num =Integer.parseInt( v.leerDato("Ingrese El numero que desea insertar"));
        			pila.push(num);
        			showMenu("pila");
        		}else if(metodo.equalsIgnoreCase("pop")) {
        			v.mostrarInformacion("Se ha borrado " + pila.pop() + " de la pila");
        			showMenu("pila");
        			
        		}else if(metodo.equalsIgnoreCase("getTop")) {
        			v.mostrarInformacion("Cima de la pila: " + pila.getTop());
        			showMenu("pila");
        			
        		}else if(metodo.equalsIgnoreCase("GetNumberOfElements")) {
        			v.mostrarInformacion("Numero de Elementos en la pila: " + pila.getNumberOfElements());
        			showMenu("pila");
        			
        		}else if(metodo.equalsIgnoreCase("isFull")) {
        			Boolean lleno = pila.isFull();
        			
        			if(lleno == true) {
        				v.mostrarInformacion("La pila esta llena!!!!");
        			}else {
        				v.mostrarInformacion("La pila no esta llena");
        			}
        			showMenu("pila");
        			
        			
        		}else if(metodo.equalsIgnoreCase("IsEmpty")) {
        			
        			Boolean vacio = pila.isEmpty();
        			
        			if(vacio == true) {
        				v.mostrarInformacion("La pila esta vacia!!!!");
        			}else {
        				v.mostrarInformacion("La pila no esta vacia");
        			}
        			showMenu("pila");
        			
        		}else {
        			v.mostrarInformacion(pila.printStack());
        			showMenu("pila");
        		}
			} catch (Exception e) {
				// TODO: handle exception
				System.exit(0);
			}
    		
    		
    	}else {
    		
    		
    		try {
    			String[] o = {"Queue", "DeQueue", "getFirst", "GetNumberOfElements", "isFull", "IsEmpty", "PrintQueue"};
        		String metodo = v.mostrarLista("¿Que metodo desea utilizar?", o);
    			if(metodo.equalsIgnoreCase("Queue")) {
        			Double num =Double.parseDouble( v.leerDato("Ingrese El numero que desea insertar"));
        			cola.queue(num);
        			showMenu("cola");
        		}else if(metodo.equalsIgnoreCase("DeQueue")) {
        			v.mostrarInformacion("Se ha borrado " + cola.dequeue() + " de la pila");
        			showMenu("cola");
        			
        		}else if(metodo.equalsIgnoreCase("getFirst")) {
        			v.mostrarInformacion("Primer Elemento de la Cola: " + cola.getFirst());
        			showMenu("cola");
        			
        		}else if(metodo.equalsIgnoreCase("GetNumberOfElements")) {
        			v.mostrarInformacion("Numero de Elementos en cola: " + cola.getNumberOfElements());
        			showMenu("cola");
        			
        		}else if(metodo.equalsIgnoreCase("isFull")) {
        			Boolean lleno = cola.isFull();
        			
        			if(lleno == true) {
        				v.mostrarInformacion("La Cola esta llena!!!!");
        			}else {
        				v.mostrarInformacion("La Cola no esta llena");
        			}
        			showMenu("cola");
        			
        			
        		}else if(metodo.equalsIgnoreCase("IsEmpty")) {
        			
        			Boolean vacio = cola.isEmpty();
        			
        			if(vacio == true) {
        				v.mostrarInformacion("La Cola esta vacia!!!!");
        			}else {
        				v.mostrarInformacion("La Cola no esta vacia");
        			}
        			showMenu("cola");
        			
        		}else {
        			v.mostrarInformacion(cola.printQueue());
        			showMenu("cola");
        		}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
    		
    	}
    	
    }
    

}