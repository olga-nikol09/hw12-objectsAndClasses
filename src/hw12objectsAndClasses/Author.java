package hw12objectsAndClasses;

public class Author {
    private String name;
    private String surname;

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return this.name + " " + surname;
    }

    public String getSurname() {
        return this.surname;
    }
}

