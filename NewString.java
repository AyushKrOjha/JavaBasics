public class NewString {
    public static void main(String[] args) {
        // String name = "Ayush Ojha";
        // String name = new String("Ayush Ojha");
        // System.out.println(name);

        /* 
        String name = "Ayush";
        int age = 29;

        String FormattedString = String.format("My name is %s, I'm %d years old.", name, age);
        System.out.println(FormattedString);
        */

        String name = "Ayush";
        System.out.println(name.length());
        System.out.println(name.isEmpty());
        System.out.println(name.toUpperCase());

        String str1 = new String("abc");
        String str2 = new String("abc");
        String str3 = new String("ABC");
        System.out.println(str1 == str2); // false
        System.out.println(str1.equals(str2)); // true
        System.out.println(str1.equalsIgnoreCase(str3)); // true

        String sen = "The sky is blue";
        System.out.println(sen.replace("blue", "red"));
        
        System.out.println(sen.contains("sky"));
    }
    
}
