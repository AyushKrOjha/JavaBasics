import java.util.Arrays;

public class NewArraysTwo {
    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3, 4};
        int[] copyOfNumbers = Arrays.copyOf(numbers, numbers.length);
        //copyOfRange(numbers, startingIndex, endingIndex);

        // Arrays.fill(numbers, 0);

        System.out.println(Arrays.equals(numbers, copyOfNumbers));
    }
    
}
