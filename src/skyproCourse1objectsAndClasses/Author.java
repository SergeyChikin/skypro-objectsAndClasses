package skyproCourse1objectsAndClasses;

import java.util.Objects;

public class Author {
    private final String name;
    private final String surname;


    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }


    public String getName() {
        return this.name;
    }

    public String getSurname() {
        return this.surname;
    }
    @Override
    public String toString() {
        return name + " " + surname;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ( obj == null || this.getClass() != obj.getClass()) {
            return false;
        }
        Author author = (Author) obj;
        return name.equals(author.getName()) && surname.equals(author.getSurname());
    }
    @Override
    public int hashCode() {
        return java.util.Objects.hash(name, surname);
    }


}
