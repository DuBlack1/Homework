package Homework_1_9;

import java.util.Objects;

public class Book {
    private String name;
    private int publicationYear;
    private Author Author;
    public Book (String name, int publicationYear, Author Author) {
        this.name = name;
        this.publicationYear = publicationYear;
        this.Author = Author;
    }
    @Override
    public String toString() {
        return "Название книги: " + name + ". Дата публикации: " + publicationYear + ". Автор: " + Author;
    }
    public String getName() {
        return name;
    }
    public int getPublicationYear() {
        return publicationYear;
    }
    public void setPublicationYear(int publicationYear){
        this.publicationYear = publicationYear;
    }
    public Author getAuthor() {
        return Author;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publicationYear == book.publicationYear && Objects.equals(name, book.name) && Objects.equals(Author, book.Author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, publicationYear, Author);
    }
}
