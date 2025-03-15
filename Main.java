public class Main {

    public static void main(String[] args) {
        // Создаем автора Лев Николаевич Толстой
        Author author = new Author("Лев", "Толстой", 5);

        // Создаем книгу "Война и Мир"
        Book book = new Book("Война и Мир", 1965, author, 432);

        // Работоспособность методов
        System.out.println("Книга: " + book.getTitle());
        System.out.println("Год выпуска: " + book.getReleaseYear());
        System.out.println("Автор: " + book.getAuthor().getName() + " " + book.getAuthor().getSurname());
        System.out.println("Страниц: " + book.getPages());
        System.out.println("Книга большая? " + book.isBig());
        System.out.println("Содержит ли книга фамилию автора: " + book.matches("Толстой"));
        System.out.println("Содержит ли книга имя автора: " + book.matches("Лев"));
        System.out.println("Цена: " + book.estimatePrice() + " рублей");

    }
}