package main.clients;

import java.time.LocalDate;

public class Parrot extends Animal implements Flyable, Swimable {

    public Parrot(String nickName, Owner owner, LocalDate birthDate, Illness illness, int movementStats) {
        super(nickName, owner, birthDate, illness, movementStats);
    }

    public Parrot(){
        super();
    }
    @Override
    public void fly() {

    }

    @Override
    public void swim() {

    }

}
