package main.java.simulator.models;

import main.java.simulator.behaviors.*;

public class StrayCat extends Cat{

    MeowBehavior meow;
    MoveBehavior move;

    public StrayCat(String name) {
        super(name);
        meow = new LoudMeow();
        move = new RunMove();
    }
    
}
