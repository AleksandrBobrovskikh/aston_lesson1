import java.util.ArrayList;
import java.util.List;

public class Library {

    private static List<Book> books = new ArrayList<>();

    // Статический блок инициализации
    static {
        books.add(new Book("451' по Фаренгейту", "Рэй Брэдбери", 1953));
        books.add(new Book("Господь гнева", "Роджер Желязны", 1976));
        books.add(new Book("Мечтают ли андроиды об электроовцах?", "Филип К. Дик", 1968));
    }

    // Добавляет книгу в библиотеку
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Книга \"" + book.getTitle() + "\" добавлена в библиотеку.");
    }

    // Выводит список доступных книг
    public void printAvailableBooks() {
        System.out.println("Список доступных книг: \n");
        for (Book book : books) {
            if (book.isAvailable()) {
                book.displayInfo();
            }
        }
    }

    // Возвращает список книг определенного автора
    public List<Book> findBooksByAuthor(String author) {
        List<Book> result = new ArrayList<>();
        for (Book book : books) {
            if (book.getAuthor().equalsIgnoreCase(author)) {
                result.add(book);
            }
        }
        return result;
    }
}
