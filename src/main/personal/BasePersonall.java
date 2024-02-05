package main.personal;

import java.time.LocalDate;

public abstract class BasePersonall extends Personal{

    public String name;
    public LocalDate birthDate;

    public BasePersonall(String name, LocalDate birthDate) {
        this.name = name;
        this.birthDate = birthDate;
    }
    public BasePersonall(String name) {
        this.name = name;
        this.birthDate = LocalDate.now();
    }

    public BasePersonall() {
        this("Имя", LocalDate.now());
    }

    public String getType() {
        return getClass().getSimpleName();
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("name = %s, bd = %s ", name, birthDate);
    }
}

