package ru.alexander.model.impl;

import lombok.Data;
import ru.alexander.model.Hand;
import ru.alexander.model.Head;
import ru.alexander.model.Leg;
import ru.alexander.model.Robot;

@Data
public class ModelT1000 implements Robot {
    
    private Hand hand;
    private Leg leg;
    private Head head;
    
    public ModelT1000() {
    }

    public ModelT1000(Hand hand, Leg leg, Head head) {
        super();
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    @Override
    public void action(){
        hand.catchSomthing();
        head.calc();
        leg.go();
    }

    @Override
    public void dance() {
        System.out.println("dance T1000");
    }

}
