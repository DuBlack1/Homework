package Homework_1_9;

import java.util.Objects;

public class Author {
    private String name;
    private String surname;
    public Author (String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public String toString() {return name + ' ' + surname;}

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return Objects.equals(name, author.name) && Objects.equals(surname, author.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname);
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
