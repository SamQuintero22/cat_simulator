package main.java.simulator.groups;

import java.util.ArrayList;
import java.util.List;

import main.java.simulator.models.Cat;

public class CatPark{

    List<Cat> listaGatos;

    public CatPark(){

        listaGatos = new ArrayList<>();

    }

    public void agregarGato(Cat gatito){
        listaGatos.add(gatito);
    }

    public void mostrarTiposGatos(){
        for (Cat gatitoActual : listaGatos) {
            gatitoActual.display();
        }
    }

    public void GoAllMeow(){

        for (Cat gatitoActual : listaGatos) {
            gatitoActual.performMeow();
        }

    }

    public void GoAllMove(){

        for (Cat gatitoActual : listaGatos) {
            gatitoActual.performMove();
        }

    }

}