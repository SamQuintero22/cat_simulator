package main.java.simulator;

import main.java.simulator.behaviors.LoudMeow;
import main.java.simulator.behaviors.RunMove;
import main.java.simulator.groups.CatPark;
import main.java.simulator.models.*;

public class MainSimulator {
    public static void main(String[] args) {
        HouseCat gatito = new HouseCat("Carlos");
    
        System.out.println(gatito.getName());

        gatito.performMeow();
        gatito.performMove();

        gatito.setMeow(new LoudMeow());
        gatito.setMove(new RunMove());

        gatito.performMeow();
        gatito.performMove();

        System.out.println("A continuacion parque de gatos: ");

        CatPark parqueDeGatos = new CatPark();

        parqueDeGatos.agregarGato(new HouseCat("francisco"));
        parqueDeGatos.agregarGato(new OldCat("cristian"));
        parqueDeGatos.agregarGato(new StrayCat("carmen"));

        parqueDeGatos.GoAllMeow();
        parqueDeGatos.GoAllMove();


    }
}
