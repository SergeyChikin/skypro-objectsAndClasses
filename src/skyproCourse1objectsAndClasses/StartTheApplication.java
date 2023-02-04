package skyproCourse1objectsAndClasses;

public class StartTheApplication {
    public static void main(String[] args) {
        Author korneyChukovskiy = new Author("Корней", "Чуковский");
        Book barmaley = new Book("БАРМАЛЕЙ", korneyChukovskiy, 1925);

        barmaley.setPublishingYear(1981);
    }
}
