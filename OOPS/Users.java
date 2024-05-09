package OOPS;

import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class Users {
    private String name;
    private LocalDate birthDate;
    private ArrayList<Book> books = new ArrayList<Book>();

    Users(String name, String birthDate){
        this.name = name;
        this.birthDate = LocalDate.parse(birthDate);
    }

    public String getName(){
        return this.name;
    }

    public String getBirthDate(){
        return this.birthDate.toString();
    }

    public void borrow(Book book){
        this.books.add(book);
    }

    public String bowrrowedBooks(){
        return this.books.toString();
    }

    public int age(){
        int age = Period.between(this.birthDate, LocalDate.now()).getYears();

        return age;
    }
}
