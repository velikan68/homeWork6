public class Author {
    String name; //имя
    String surname; //фамилия
    int rating; //рейтинг

    public Author(String name, String surname, int rating) {
        this.name = name;
        this.surname = surname;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public double getRating() {
        return rating;
    }
}