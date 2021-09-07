package co.edu.unbosque.model;

public interface IColaReales {

	public void queue(double elemento);
	
	public double dequeue();
	
	public double getFirst();
	
	
	public int getNumberOfElements();
	
	public Boolean isFull();
	
	public Boolean isEmpty();
	
	
	
	
}
