package com.lvt.pattern_19;

/**
 * @Description: java类作用描述
 * @Author: LT
 * @CreateDate: 2019/11/28 18:19
 * @Version: 1.0.0
 */
public class MementoPatternDemo {

    public static void main(String[] args) {
        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());
        originator.setState("State #4");

        System.out.println("Current State:"+originator.getState());
        originator.getStateFromMemento(careTaker.get(0));

        System.out.println("First saved State:"+originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved state:"+originator.getState());

    }
}
