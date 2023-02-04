package skyproCourse1objectsAndClasses;

public class Main {
    public static void main(String[] args) {
        Author maksimGorkiy = new Author("Максим",  "Горький");
        Author korneyChukovskiy = new Author("Корней", "Чуковский");
        Book barmaley = new Book("БАРМАЛЕЙ", korneyChukovskiy, 1925);
        Book mother = new Book("МАТЬ", maksimGorkiy, 1906);
        System.out.println(maksimGorkiy.toString());
        System.out.println(barmaley.toString());
        Book barmaleychik = new Book("БАРМАЛЕЙ", korneyChukovskiy, 1925);
        System.out.println(barmaley.equals(barmaleychik));
        System.out.println(java.util.Objects.hash(barmaley));
        System.out.println(java.util.Objects.hash(barmaleychik));
        System.out.println(java.util.Objects.hash(mother));

    }
}
