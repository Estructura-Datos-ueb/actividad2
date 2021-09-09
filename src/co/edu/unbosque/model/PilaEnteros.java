package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

import javax.swing.JOptionPane;

public class PilaEnteros implements  IPilaDeEnteros {

    public int[]  pila;
    public int top;
    public int capacidad;


    public PilaEnteros (int tamano) {
    	pila = new int[tamano];
    	top =-1;
    	capacidad = tamano;
    	
    }


	@Override
	public void push(int elemento) {
		// TODO Auto-generated method stub

        if (isFull())
        {
            JOptionPane.showMessageDialog(null,"El Stack esta lleno!!! : Overflow ");
        }else {
			JOptionPane.showMessageDialog(null,"Insertando " + elemento);
			pila[++top] = elemento;
		}

	}


	@Override
	public int pop() {
    	int pilaTop=0;
		// TODO Auto-generated method stub
        if (isEmpty())
        {
        	 JOptionPane.showMessageDialog(null,"El Stack esta vacio!!! : Underflow");
        }else{
			JOptionPane.showMessageDialog(null,"Quitando " + getTop());
			pilaTop=pila[top--];
		}
        return pilaTop;
	}

	@Override
	public int getTop() {
		// TODO Auto-generated method stub
		 if (!isEmpty()) {
	            return pila[top];
	        }else {
	        	 JOptionPane.showMessageDialog(null,"El Stack esta vacio!!! ");
	        }
			return -1;
    }




	@Override
	public int getNumberOfElements() {
		// TODO Auto-generated method stub
		return top + 1;
	}


	@Override
	public Boolean isFull() {
		// TODO Auto-generated method stub
		 return top == capacidad - 1; 
	}


	@Override
	public Boolean isEmpty() {
		// TODO Auto-generated method stub
		return top == -1;
	}
	
	public String printStack() {
		String result = "";
		if(!isEmpty()) {
		for (int i = 0; i < pila.length; i++) {
			result = result + "\n" + pila[i];
		}
		}else {
			result = "Pila Vacia!!!";
		}
		return result;
	}

   
}

