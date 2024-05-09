import java.util.Arrays;

public class NewArrays {
    public static void main(String[] args) {
        // char[] vowels = new char[5];
        // vowels[0] = 'a';
        // vowels[1] = 'e';
        // vowels[2] = 'i';
        // vowels[3] = 'o';
        // vowels[4] = 'u';

        char[] vowels = {'a', 'e', 'i', 'o', 'u'};

        System.out.println(Arrays.toString(vowels));
        System.out.println(vowels.length);

        int[] numbers = {1, 6, 2, 43, -12};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));
        int startingIndex = 1;
        int endingIndex = 4;
        int index = Arrays.binarySearch(numbers, startingIndex, endingIndex, 2);
        System.out.println(index);
    }   
}
