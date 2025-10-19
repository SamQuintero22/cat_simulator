package main.java.simulator.models;

import main.java.simulator.behaviors.*;

public abstract class Cat{

    private String name;
    MeowBehavior meowBehavior;
    MoveBehavior moveBehavior;
    
    public Cat(String name){

        this.name = name;

    }

    public String getName(){
        return name;
    }

    abstract void display();

    public void setMeow(MeowBehavior meow){
        this.meowBehavior = meow;
    }

    public void setMove(MoveBehavior move){
        this.moveBehavior = move;
    }

    public MeowBehavior getMeowBehavior(){
        return this.meowBehavior;
    }

    public MoveBehavior getMoveBehavior(){
        return this.moveBehavior    ;
    }

    public void performMeow(){
        meowBehavior.meow();
    }

    public void performMove(){
        moveBehavior.move();
    }
}
