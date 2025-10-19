package main.java.simulator.models;

import main.java.simulator.behaviors.*;

public class HouseCat extends Cat{

    public HouseCat(String name) {
        super(name);
        meowBehavior = new purringMeow();
        moveBehavior = new LazyMove();
    }

    public void display(){
        System.out.println("Iam a house Cat");
    }
    
}
