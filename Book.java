public class Book {
    String title;
    int releaseYear;
    Author author;
    int pages;

    public Book(String title, int releaseYear, Author author, int pages) {
        this.title = title;
        this.releaseYear = releaseYear;
        this.author = author;
        this.pages = pages;
    }

    public String getTitle() {
        return title;
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPages() {
        return pages;
    }

    public boolean isBig() {
        return pages > 500;
    }

    public boolean matches(String word) {
        return (title.toLowerCase().contains(word.toLowerCase())  // приводим к нижнему регистру для регистронезависимого поиска
                || author.getName().toLowerCase().contains(word.toLowerCase())
                || author.getSurname().toLowerCase().contains(word.toLowerCase()));
    }

    public int estimatePrice() {
        int basePrice = pages * 3;
        double priceWithRating = basePrice * Math.sqrt(author.getRating());
        int finalPrice = (int) Math.floor(priceWithRating);
        return Math.max(250, finalPrice);
    }
}