package co.edu.unbosque.model;

public interface IPilaDeEnteros {
	
	public void push(int elemento);
	
	public int pop();
	
	public int getTop();
	
	public int getNumberOfElements();
	
	public Boolean isFull();
	
	public Boolean isEmpty();
	
	

}
