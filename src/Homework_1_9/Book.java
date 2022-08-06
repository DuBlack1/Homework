package Homework_1_9;

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
        return name + ' ' + publicationYear + ' ' + Author;
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

}
