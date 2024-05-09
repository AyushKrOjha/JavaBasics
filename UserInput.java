import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name:");
        String name = scanner.nextLine();// take string as input
        System.out.printf("Hello %s. How are you?", name);
        scanner.close();
        // dont use 
        // nextLine() after nextInt()
        // if nessasory add next() in between 

        // String to int
        String a = "42";
        int number = Integer.parseInt(a);
        System.out.println(number);
    }    
}
