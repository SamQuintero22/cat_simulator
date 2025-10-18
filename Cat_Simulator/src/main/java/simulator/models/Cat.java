package main.java.simulator.models;
import main.java.simulator.behaviors.*;

public abstract class Cat{

    private MeowBehavior meow;
    private MoveBehavior move;
    

    public Cat(){}

    public void setMeow(MeowBehavior meow){
        this.meow = meow;
    }

    public void setMove(MoveBehavior move){
        this.move = move;
    }
}