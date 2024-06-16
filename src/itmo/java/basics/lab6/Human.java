package itmo.java.basics.lab6;

public abstract class Human {
    private String name;
    private String surname;

    public String humanName() {
        return name;
    }

    public String humanSurname() {
        return surname;
    }

    public abstract void info();

    public Human(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }
}
