import hw12objectsAndClasses.Author;
import hw12objectsAndClasses.Book;

public class Main {
    public static void main(String[] args) {
        Author rowling = new Author("Джоан","Роулинг");
        Author vern = new Author("Жюль", "Верн");
        Book hp1 = new Book("Гарри Поттер и филосовский камень", rowling, 1997);
        Book mysteriousIsland = new Book("Таинтвенный остров", vern, 1875);
        mysteriousIsland.setPublishingYear(2016);
        System.out.println(mysteriousIsland.getBookName() + " "  +  mysteriousIsland.getAuthorName().getName() + " " + mysteriousIsland.getPublishingYear());

        System.out.println(hp1.getBookName() + " " + hp1.getAuthorName().getName() + " " + hp1.getPublishingYear());
    }
}