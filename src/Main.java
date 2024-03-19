//Создайте отдельный класс для запуска приложения
public class Main {
    // и объявите метод main  в нем.
    public static void main(String[] args) {
//В методе
//main
// создайте несколько объектов «Книга» (достаточно двух) и несколько объектов «Автор»
// (достаточно тоже двух) и инициализируйте их.
        Author author1 = new Author("Ivan", "Turgenev");
        Author author2 = new Author("Anton", "Chehov");
        System.out.println("Автор 1 - " + author1.getName() + " " + author1.getSurname());
        System.out.println("Автор 2 - " + author2.getName() + " " + author2.getSurname());
        Book book1 = new Book("Mu-Mu", author1, 2013);
        Book book2 = new Book("Chayka", author2, 2016);
        System.out.println("Книга 1 - " + book1.getTitle() + " автор " + author1.getName() + " " + author1.getSurname() + " год публикации " + book1.getYearPublic());
        System.out.println("Книга 2 - " + book2.getTitle() + " автор " + author2.getName() + " " + author2.getSurname() + " год публикации " + book2.getYearPublic());
//        В том же методе  main измените год публикации одной из книг с помощью сеттера.
        book1.setYearPublic(2020);
        System.out.println("Книга 1 изменение года публикации- " + book1.getTitle() + " автор " + author1.getName() + " " + author1.getSurname() + " год публикации " + book1.getYearPublic());
    }
}
//Создайте класс Book, который будет содержать в себе данные о названии,
// авторе и годе публикации книги.
class Book {
    private String title;

    private Author author;
    private int yearPublic;
    //Напишите конструкторы для обоих классов, заполняющие все поля.
    public Book(String title, Author autor, int yearPublic) {
        this.title = title;
        this.author = autor;
        this.yearPublic = yearPublic;
    }
    //    Создайте геттеры для всех полей автора и всех полей книги.
    public String getTitle() {
        return title;
    }
    public int getYearPublic() {
        return yearPublic;
    }
    //Создайте сеттер для поля «Год публикации» у книги.
    public void setYearPublic(int yearPublic) {
        this.yearPublic = yearPublic;
    }

}
//Создайте класс Author, который содержит в себе данные об имени и фамилии автора.
class Author {
    private String name;
    private String surname;

    //Напишите конструкторы для обоих классов, заполняющие все поля.
    public Author() {
        this.name = name;
        this.surname = surname;
    }

    public Author(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    //    Создайте геттеры для всех полей автора и всех полей книги.
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
