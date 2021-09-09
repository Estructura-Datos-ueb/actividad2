package co.edu.unbosque.model;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Stack;

import javax.swing.JOptionPane;

public class ColaReales implements IColaReales {

    public Double[] cola;
    private int front;      // front points to the front element in the queue
    private int rear;       // rear points to the last element in the queue
    private int capacity;   // maximum capacity of the queue
    private int count;


    public ColaReales (int tamano) {
    	capacity = tamano;
		cola = new Double[capacity];
        front = 0;
        rear = -1;
        count = 0;
    }



	@Override
	public void queue(double elemento) {
		// TODO Auto-generated method stub
		// check for queue overflow
        if (isFull())
        {
        	 JOptionPane.showMessageDialog(null,"Error: la Queue esta llena!!! : Overflow");

        }else{
			JOptionPane.showMessageDialog(null,"Insertando " + elemento);
			rear = (rear + 1) % capacity;
			cola[rear] = elemento;
			count++;
		}

		
	}


	@Override
	public double dequeue() {
		// TODO Auto-generated method stub
		// check for queue underflow
		double colaFront=0;
        if (isEmpty())
        {
        	JOptionPane.showMessageDialog(null,"Error: La Queue esta vacia!!! : Underflow");
        }else{
			JOptionPane.showMessageDialog(null,"Quitando " + cola[front]);
			front = (front + 1) % capacity;
			count--;
			colaFront= cola[front];
		}
		return colaFront;

	}


	@Override
	public double getFirst() {
    	double colaFront=0;
		 if (isEmpty())
	        {
			 JOptionPane.showMessageDialog(null,"La Queue esta vacia");

	        }else{
			 colaFront=cola[front];
		 }
	        return colaFront;
	}


	@Override
	public int getNumberOfElements() {
		// TODO Auto-generated method stub
		return count;
	}


	@Override
	public Boolean isFull() {
		// TODO Auto-generated method stub
		return (getNumberOfElements() == capacity);
	}


	@Override
	public Boolean isEmpty() {
		// TODO Auto-generated method stub
		
		 return (getNumberOfElements() == 0);
	}
	
	public String printQueue() {
		String result = "";
		if(!isEmpty()) {
		for (int i = 0; i < cola.length; i++) {
			result = result + "\n" + cola[i];
		}
		}else {
			result = "Cola Vacia!!!";
		}
		return result;
	}

   
}

