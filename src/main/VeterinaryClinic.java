package main;

import main.clients.*;
import main.personal.*;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    public static void main(String[] args){


        Doctor doctor = new Doctor();
        Assistant assistant1 = new Assistant();
        Assistant assistant2 = new Assistant();

        Nurse nurse1 = new Nurse();
        Nurse nurse2 = new Nurse();
        Nurse nurse3 = new Nurse();


        List<BasePersonall> team = new ArrayList<>();
        team.add(doctor);
        team.add(assistant1);
        team.add(assistant2);

        team.add(nurse1);
        team.add(nurse2);
        team.add(nurse3);


        System.out.println("Количество медицинского персонала: " + team.size());
        System.out.println(team);


        List<Goable> goableList = new ArrayList<>();

        Cat cat = new Cat();
        Dog dog = new Dog();
        Duck duck = new Duck();

        goableList.add(cat);
        goableList.add(dog);
        goableList.add(duck);


        System.out.println("Количество пеших пациентов : " + goableList.size());
        System.out.println(goableList);

        List<Flyable> flyableList = new ArrayList<>();

        Duck fduck = new Duck();
        Parrot fparrot = new Parrot();

        flyableList.add(fparrot);
        flyableList.add(fduck);

        System.out.println("Количество летающих пациентов : " + flyableList.size());
        System.out.println(flyableList);

        List<Swimable> swimableList = new ArrayList<>();

        Duck sduck = new Duck();
        Parrot sparrot = new Parrot();
        Dog sdog = new Dog();

        swimableList.add(sdog);
        swimableList.add(sparrot);
        swimableList.add(sduck);

        System.out.println("Количество плавающих пациентов : " + swimableList.size());
        System.out.println(swimableList);
    }
}
