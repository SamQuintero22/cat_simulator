package main.java.simulator.models;

import main.java.simulator.behaviors.*;

public class StrayCat extends Cat{

    public StrayCat(String name) {
        super(name);
        meowBehavior = new LoudMeow();
        moveBehavior = new RunMove();
    }
    
    public void display(){
        System.out.println("Iam a Street Cat");
    }

}
