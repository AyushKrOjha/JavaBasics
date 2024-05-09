import java.util.HashMap;

public class OurHashMaps {
    public static void main(String[] args) {
        HashMap<String, Integer> examScores = new HashMap<String, Integer>();

        examScores.put("Math", 54);
        examScores.put("Physics", 72);
        examScores.put("Chemistry", 68);
        examScores.put("Computer Science", 70);

        examScores.putIfAbsent("English", 80);

        examScores.replace("Physics", 74);

        examScores.remove("Chemistry");

        // examScores.clear();

        System.out.println(examScores.toString());
        System.out.println(examScores.get("Math"));
        System.out.println(examScores.getOrDefault("Accounts", -1));
        System.out.println(examScores.size());
        System.out.println(examScores.containsKey("Math"));
        System.out.println(examScores.containsValue(100));
        System.out.println(examScores.isEmpty());

        examScores.forEach((subject, score) -> {
            System.out.println(subject + " - " + score);
        });
    }
}
