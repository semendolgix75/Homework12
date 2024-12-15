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