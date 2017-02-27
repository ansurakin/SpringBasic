package ru.alexander.common;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPostProcessor implements BeanPostProcessor {

    public Object postProcessBeforeInitialization(Object o, String string) throws BeansException {
        System.out.println("MyBeanPostProcessor " + o + " postProcessBeforeInitialization");
        return o;
    }

    public Object postProcessAfterInitialization(Object o, String string) throws BeansException {
        System.out.println("MyBeanPostProcessor " + o + " postProcessAfterInitialization");
        return o;
    }

}
