package home9;


import java.util.Objects;

//Необходимо создать класс Author, который содержит в себе данные об имени и фамилии автора.
public class Author {
    public String authorFirstName;
    public String authorSecondName;

    //Написать конструкторы для обоих классов, заполняющие все поля.
    public Author(String authorFirstName, String authorSecondName) {
        this.authorFirstName = authorFirstName;
        this.authorSecondName = authorSecondName;
    }

    //Создать геттеры для всех полей автора и всех полей книги.
    public String getAuthorName() {
        return authorFirstName + " " + authorSecondName;
    }

    public String getAuthorFirstName() {
        return authorFirstName;
    }

    public String getAuthorSecondName() {
        return authorSecondName;
    }

    ////////////////////////// Continue ///////////////////////////
//    ### **Простой уровень**
//
//Реализовать методы toString, equals и hashCode в классах Author и Book,
// которые были созданы на прошлом уроке. Обратите внимание, что toString книги не должен дублировать код из
// toString автора, а должен делегировать (вызывать) его версию метода.

    @Override
    public String toString() {
        return "Author{" +
                "name='" + authorFirstName + '\'' +
                ", subname='" + authorSecondName + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Author author = (Author) o;
        return authorFirstName.equals(author.authorFirstName) && authorSecondName.equals(author.authorSecondName)
                && (hashCode() == o.hashCode());

    }

    @Override
    public int hashCode() {
        return Objects.hash(authorFirstName, authorSecondName);
    }

}