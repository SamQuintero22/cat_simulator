package main.java.simulator.models;

import main.java.simulator.behaviors.*;

public class OldCat extends Cat{

    public OldCat(String name) {
        super(name);
        meowBehavior = new LoudMeow();
        moveBehavior = new WalkMove();
    }

    public void display(){
        System.out.println("Iam a Oooold Cat");
    }
    
    
}
