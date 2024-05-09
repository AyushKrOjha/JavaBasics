package OOPS;

public class Main {

    public static void main(String[] args) {
        Users youngerUser = new Users("Ayush Ojha", "1994-09-23");

        System.out.printf("%s was born in %s and he is now %d years old. \n", youngerUser.getName(), youngerUser.getBirthDate(), youngerUser.age());

        Book carmilla = new Book("Carmilla", "S Le Faun", 270);
        AudioBook dracula = new AudioBook("Dracula", "Brown Stacker", 30000);

        youngerUser.borrow(carmilla);

        System.out.printf("%s has borrowed these books %s ", youngerUser.getName(), youngerUser.bowrrowedBooks());

        System.out.println(dracula.toString());
    }  
}
