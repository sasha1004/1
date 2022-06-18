package home9;


import java.util.Objects;

//Необходимо создать класс Book, который содержит в себе данные об имени, авторе и годе публикации.
// Типы полей должны быть String, Author (который мы создадим  в п. 2) и int.
public class Book {

    private final String bookName;
    public Author authorName;
    private int publishingYear;

    //Написать конструкторы для обоих классов, заполняющие все поля.
    public Book(String bookName, Author authorName, int publishingYear) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.publishingYear = publishingYear;
    }

    //Создать геттеры для всех полей автора и всех полей книги.
    public String getBookName() {
        return bookName;
    }

    public Author getNameAuthor() {

        return authorName;
    }


    public int getPublishingYear() {

        return publishingYear;
    }

    //Создать сеттер для поля «Год публикации» у книги.
    public void setPublishingYear(int publishingYear) {

        this.publishingYear = publishingYear;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + bookName + '\'' +
                ", author=" + authorName +
                ", publicationYear=" + publishingYear +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishingYear == book.publishingYear && bookName.equals(book.bookName) && authorName.equals(book.authorName)
                && (hashCode() == o.hashCode());
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorName, publishingYear);
    }

}
