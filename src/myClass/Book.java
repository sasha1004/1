package myClass;


public class Book extends Object {

    String bookName;
    private final Author author;
    int publishingYear;


    public Book(String bookName, Author author, int publishingYear) {
        this.author = author;
        this.bookName = bookName;
        this.publishingYear = publishingYear;
    }

    public String getBookName() {
        return this.bookName;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getPublishingYear() {
        return this.publishingYear;
    }

    public void setPublishingYear(int new_year) {
        this.publishingYear = new_year;
    }

    @Override
    public boolean equals(Object obj) {
        Book ob = (Book) obj;
        if (this == obj) return true;

        else if ((this.hashCode() == obj.hashCode()) && this.bookName == ob.getBookName() && (this.author.equals(ob.getAuthor())) && this.publishingYear == ob.getPublishingYear())
            return true;

        else
            return false;
    }


    @Override
    public int hashCode() {
        return this.bookName.hashCode() + this.publishingYear;
    }

    @Override
    public String toString() {
        return "Имя книги: " + this.bookName + "Год выпуска" + this.publishingYear;
    }

}
