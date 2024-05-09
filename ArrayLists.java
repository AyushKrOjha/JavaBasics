import java.util.ArrayList;
import java.util.Comparator;

public class ArrayLists {
    public static void main(String[] args) {
        ArrayList<Integer> number = new ArrayList<Integer>(); // Integer is wrapper type of primitive type int
        number.add(1);
        number.add(2);
        number.add(3);

        System.out.println(number.toString());
        System.out.println(number.get(1)); // use get for printing and indexOf for operations...

        number.remove(1); 
        System.out.println(number.toString());

        number.add(4);
        number.add(5);
        System.out.println(number.toString());
        number.remove(Integer.valueOf(4));
        System.out.println(number.toString());

        //number.clear();  // remove entire array list

        number.set(1, 30);
        System.out.println(number.toString());

        number.sort(Comparator.naturalOrder());
        System.out.println(number.toString());

        number.sort(Comparator.reverseOrder());
        System.out.println(number.toString());

        System.out.println(number.size());
        System.out.println(number.contains(Integer.valueOf(4)));
        System.out.println(number.contains(Integer.valueOf(5)));

        System.out.println(number.isEmpty());

        number.forEach(num -> {
            System.out.println(num);
        });
    }    
}
