package co.edu.unbosque.controller;
import co.edu.unbosque.view.ViewConsole;
import co.edu.unbosque.model.pilasColas;

public class Controller {

    private ViewConsole v;
    private pilasColas pc;

    public Controller(){
        v = new ViewConsole();
        pc = new pilasColas();
        ejecucion();
    }

    public void ejecucion(){

        v.mostrarInformacion("prueba numero 1");
    }
}
