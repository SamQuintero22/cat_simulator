package main.java.simulator.models;

import main.java.simulator.behaviors.*;

public class OldCat extends Cat{

    MeowBehavior meow;
    MoveBehavior move;

    public OldCat(String name) {
        super(name);
        meow = new SilentMeow();
        move = new LazyMove();
    }
    
}
