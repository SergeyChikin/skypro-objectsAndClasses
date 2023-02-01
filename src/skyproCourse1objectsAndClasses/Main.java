package skyproCourse1objectsAndClasses;

public class Main {
    public static void main(String[] args) {
        Author maksimGorkiy = new Author("Максим",  "Горький");
        Author korneyChukovskiy = new Author("Корней", "Чуковский");
        Book barmaley = new Book("БАРМАЛЕЙ", korneyChukovskiy, 1925);
        Book mother = new Book("МАТЬ", maksimGorkiy, 1906);

        // Пробовал вывести в консоль для самопроверки.
//        System.out.println(barmaley.getAuthor().getName());
//        System.out.println(barmaley.getAuthor().getSurname());
//        System.out.println(barmaley.getBookName());
//        System.out.println(barmaley.getPublishingYear());
    }
}
