import java.util.List;

public class Main {

    public static void main(String[] args) {
        Book book4 = new Book("Автостопом по галактике", "Дуглас Адамс", 1984);
        Book book5 = new Book("Дюна", "Фрэнк Герберт");
        Book book6 = new Book("Улитка на склоне столетия", "Аркадий и Борис Стругацкие", 1988);

        // Создание объекта Library
        Library library = new Library();

        // Добавление новых книг в библиотеку
        library.addBook(book4);
        library.addBook(book5);
        library.addBook(book6);

        // Вывод доступных книг
        library.printAvailableBooks();

        // Берем из библиотеки "Автостопом по галактике"
        book4.borrowBook();

        // Вывод доступных книг
        library.printAvailableBooks();

        // Далее написан блок, позволяющий искать, выводить и брать книгу,
        // которую мы ищем по автору. В задании этого не было, но без этого блока
        // нельзя взять книгу созданную в статическом блоке.

        // Ищем книги автора "Рэй Брэдбери"
        String authorToSearch = "Рэй Брэдбери";
        List<Book> booksByAuthor = library.findBooksByAuthor(authorToSearch);

        // Если найдены книги, выводим их информацию
        if (!booksByAuthor.isEmpty()) {
            System.out.println("\tКниги автора \"" + authorToSearch + "\":");
            for (Book book : booksByAuthor) {
                book.displayInfo();
            }

            // Взятия первой найденной книги
            Book bookToBorrow = booksByAuthor.get(0);
            bookToBorrow.borrowBook();
        } else {
            System.out.println("Книги автора \"" + authorToSearch + "\" не найдены.");
        }

        // Вывод доступных книг
        library.printAvailableBooks();

    }
}
