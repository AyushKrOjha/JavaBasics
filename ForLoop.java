public class ForLoop {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6};

        for(int i = 0; i < numbers.length; i++){
            System.out.println(numbers[i]);
        }

        for(int number : numbers){
            System.out.println(number);
        }
    }
}
