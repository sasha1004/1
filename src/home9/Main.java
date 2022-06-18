package home9;

//6. В методе main создать несколько объектов Книга (достаточно двух) и несколько объектов Автор (достаточно тоже двух) и инициализировать друг друга. Учесть, что авторы являются обязательными членами книг и книги не могут создаться без авторов.
//
//    Метод main не должен находиться в классах Book и Author.
//
//    Требуется создать отдельный класс для запуска приложения и объявить метод main в нем.
//
//7. В том же методе main изменить год публикации одной из книг с помощью сеттера.

public class Main {

    public static void main(String[] args) {
        Author firstAuthor = new Author("Александр", "Фамилия");
        System.out.println("Автор книги " + firstAuthor.getAuthorName());
        Book firstBook = new Book("Книга с именем", new Author("Владимир", "Фамилия 2"), 1900);
        System.out.println("Год публикации был = "+firstBook.getPublishingYear());
        firstBook.setPublishingYear(2022);
        System.out.println("Год публикации стал = "+firstBook.getPublishingYear());

        System.out.println(firstBook.getBookName() + " " + firstBook.getNameAuthor().getAuthorFirstName() + " " + firstBook.getPublishingYear());


        Author firstAuthor_1 = new Author("Александр", "Фамилия");
        System.out.println("Автор книги " + firstAuthor.getAuthorName());
        Book firstBook_1 = new Book("Книга с именем", new Author("Владимир", "Фамилия 2"), 1900);
        System.out.println("Год публикации был = "+firstBook.getPublishingYear());
        firstBook_1.setPublishingYear(2022);
        System.out.println("Год публикации стал = "+firstBook.getPublishingYear());

        System.out.println(firstBook.getBookName() + " " + firstBook.getNameAuthor().getAuthorFirstName() + " " + firstBook.getPublishingYear());


        System.out.println(firstAuthor.toString());
        System.out.println(firstBook.toString());

        System.out.println("Одинкаовые авторы? "+firstAuthor.equals(firstAuthor_1));
        System.out.println("Одинкаовые книги? "+firstBook.equals(firstBook_1));


        firstBook.setPublishingYear(2021);

        System.out.println("Одинкаовые книги, если год поменять? "+firstBook.equals(firstBook_1));

        System.out.println(firstBook.hashCode());
        System.out.println(firstBook_1.hashCode());
    }
}