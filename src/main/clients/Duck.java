package main.clients;

import java.time.LocalDate;

public class Duck extends Animal implements Flyable, Swimable, Goable{
    public Duck(String nickName, Owner owner, LocalDate birthDate, Illness illness, int movementStats) {
        super(nickName, owner, birthDate, illness, movementStats);
    }

    public Duck(){
        super();
    }

    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }

    @Override
    public void go() {

    }
}
