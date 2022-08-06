package Homework_1_9;

public class Author {
    private String name;
    private String surname;
    public Author (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {return name + ' ' + surname;}

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
