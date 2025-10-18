package main.java.simulator.models;

import main.java.simulator.behaviors.*;

public abstract class Cat{
    
    private String name;
    private MeowBehavior meow;
    private MoveBehavior move;
    
    public Cat(String name){

        this.name = name;

    }

    public void setMeow(MeowBehavior meow){
        this.meow = meow;
    }

    public void setMove(MoveBehavior move){
        this.move = move;
    }

    public MeowBehavior getMeowBehavior(){
        return this.meow;
    }

    public MoveBehavior getMoveBehavior(){
        return this.move;
    }

}
