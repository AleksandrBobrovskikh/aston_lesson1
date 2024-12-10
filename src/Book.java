public class Book {

    private String title;
    private String author;
    private int year;
    private boolean isAvailable = true;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public Book(String title, String author) {
        this(title, author, 0);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    // Делает книгу недоступной, если была доступна
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("Книга \"" + title + "\" взята.\n");
        } else {
            System.out.println("Книга \"" + title + "\" недоступна.\n");
        }
    }

    // Делает книгу доступной
    public void returnBook() {
        System.out.println("Книга " + title + " возвращена \n");
        setAvailable(true);
    }

    // Выводит на экран информацию о книге
    public void displayInfo() {
        System.out.println("Название: " + title);
        System.out.println("Автор: " + author);
        System.out.println("Год издания: " + (year != 0 ? year : "не указан"));
        System.out.println("Доступность: " + (isAvailable ? "В наличии\n" : "Нет в наличии\n"));
    }
}
