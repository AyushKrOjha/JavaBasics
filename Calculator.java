import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number:");
        double num1 = scanner.nextDouble();
        scanner.nextLine();
        System.out.println("Enter operation(+,-,*,/):");
        String operation = scanner.nextLine();
        System.out.println("Enter Second number");
        double num2 = scanner.nextDouble();
        switch (operation) {
            case "+":
                System.out.printf("%f + %f = %f", num1, num2, num1+num2);
                break;
            case "-":
                System.out.printf("%f - %f = %f", num1, num2, num1-num2);
                break;
            case "*":
                System.out.printf("%f * %f = %f", num1, num2, num1*num2);
                break;
            case "/":
                if (num2 == 0){
                    System.out.println("invalid operation; divide number by zero");
                    break;
                } else{
                    System.out.printf("%f / %f = %f", num1, num2, num1/num2);
                    break;
                }
                
            default:
                System.out.println("Invalid Operator");
                break;
        }
    }
}
