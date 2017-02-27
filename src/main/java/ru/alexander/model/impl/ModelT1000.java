package ru.alexander.model.impl;

import lombok.Data;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanPostProcessor;
import ru.alexander.model.Hand;
import ru.alexander.model.Head;
import ru.alexander.model.Leg;
import ru.alexander.model.Robot;

@Data
public class ModelT1000 implements Robot, InitializingBean, DisposableBean {

    private Hand hand;

    private Leg leg;

    private Head head;

    private String color;

    private int year;

    private boolean soundEnable;

    public ModelT1000() {
    }

    public ModelT1000(Hand hand, Leg leg, Head head, String color, int year, boolean soundEnable) {
        super();
        this.hand = hand;
        this.leg = leg;
        this.head = head;
        this.color = color;
        this.year = year;
        this.soundEnable = soundEnable;
    }

    public ModelT1000(String color, int year, boolean soundEnable) {
        this.color = color;
        this.year = year;
        this.soundEnable = soundEnable;
    }

    public ModelT1000(Hand hand, Leg leg, Head head) {
        super();
        this.hand = hand;
        this.leg = leg;
        this.head = head;
    }

    @Override
    public void action() {
        hand.catchSomthing();
        head.calc();
        leg.go();
        System.out.println("color " + this.color);
        System.out.println("year " + this.year);
        System.out.println("soundEnable " + this.soundEnable);
    }

    @Override
    public void dance() {
        System.out.println("dance T1000");
    }
    
    public void init(){
        System.out.println("init");    
    }
    
    public void destroy(){
        System.out.println("destroy");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("afterPropertiesSet");
    }

}
