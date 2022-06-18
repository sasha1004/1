package myClass;

public class Main {
    public static void main(String[] args) {

        //1. Необходимо создать класс Book, который содержит в себе данные об имени, авторе и годе публикации. Типы полей должны быть String, Author (который мы создадим  в п. 2) и int.
        //2. Необходимо создать класс Author, который содержит в себе данные об имени и фамилии автора.
        //3. Написать конструкторы для обоих классов, заполняющие все поля.
        //4. Создать геттеры для всех полей автора и всех полей книги.
        //5. Создать сеттер для поля «Год публикации» у книги.
        //6. В методе main создать несколько объектов Книга (достаточно двух) и несколько объектов Автор (достаточно тоже двух) и инициализировать друг друга. Учесть, что авторы являются обязательными членами книг и книги не могут создаться без авторов.
        //
        //    Метод main не должен находиться в классах Book и Author.
        //
        //    Требуется создать отдельный класс для запуска приложения и объявить метод main в нем.
        //
        //7. В том же методе main изменить год публикации одной из книг с помощью сеттера.

        Author author1 = new Author("Alex", "Alexanro");
        System.out.println(author1);
        System.out.println(author1.hashCode());

        System.out.println("-------");
        Author author2 = new Author("Alex2", "Alexanro");
        System.out.println(author2);
        System.out.println(author2.hashCode());

        System.out.println(author1.equals(author2));

        Book book1 = new Book("книга", author1, 2022);
//
        System.out.println("-------");
        System.out.println(book1);
        System.out.println(book1.hashCode());


        Book book2 = new Book("книга", author1, 2022);
//
        System.out.println("-------");
        System.out.println(book2);
        System.out.println(book2.hashCode());
        System.out.println(book1.equals(book1));

    }
}
