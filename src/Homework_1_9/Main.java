package Homework_1_9;

public class Main {
    public static void main(String[] args) {
        Author Pushkin = new Author("Alexander", "Pushkin");
        Author Bazhov = new Author("Paul", "Bazhov");
        Book TheTaleOfTheFishermanAndTheFish = new Book("The Tale of the Fisherman and the Fish", 2015, Pushkin);
        Book TheTaleOfTheGoldenCockerel = new Book("The Tale of the Golden Cockerel", 2004, Pushkin);
        Book MalachiteBox = new Book("Malachite Box", 2021, Bazhov);

        System.out.println(TheTaleOfTheFishermanAndTheFish);

        TheTaleOfTheFishermanAndTheFish.setPublicationYear(2021);
        System.out.println("Дата изменена на " + TheTaleOfTheFishermanAndTheFish.getPublicationYear());
    }
}
