import java.util.HashMap;

public class App {

    String[] input = new String[]{"1, 1, 1, 1, 3, 4, 5, 6, 7, 7, 7, 8, 8"};

    public void start() {

        //exercise1();
        exercise2();
        //curiousity();
    }


    public void exercise1() {


        HashMap<String, Integer> occurences = countOccurences(input);
        for (String key : occurences.keySet()) {
            System.out.println("\"" + key + "\":" + occurences.get(key));
        }

    }


    public static HashMap<String, Integer> countOccurences(String[] input) {
        HashMap<String, Integer> occurencesMap = new HashMap<>();
        for (String element : input) {
            String[] elements = element.trim().split(",\\s*");
            for (String e : elements) {
                occurencesMap.put(e, occurencesMap.getOrDefault(e, 0) + 1);
            }

        }
        return occurencesMap;

    }

    public void curiousity() {
        String[] names = new String[]{"John", "John", "John", "John", "Olaf", "Sundar", "Maximus", "Stromaff", "Elvis"};
        HashMap<String, Integer> occurences = countOccurences(names);
        for (String n : occurences.keySet()) {
            System.out.println("\"" + n + "\":" + occurences.get(n));
        }
    }


    public void exercise2() {
        System.out.println("Input Array: " + input[0]);
        String result = findMaxOccurences(input);
        System.out.println("Element with the most occurences: " + result);
    }


    public static String findMaxOccurences(String[] input) {
        //Create a HashMap to store elements and their occurrences
        HashMap<String, Integer> occurrencesMap = new HashMap<>();

        // Loop through the input array and count occurrences
        for (String element : input) {
            // Remove any leading/trailing spaces, and split elements separated by comma
            String[] elements = element.trim().split(",\\s*");
            // Loop through the split elements and update the occurrencesMap
            for (String e : elements) {
                occurrencesMap.put(e, occurrencesMap.getOrDefault(e, 0) + 1);
            }
        }
        String maxElement = "";
        int maxOccurrences = 0;
        for (String key : occurrencesMap.keySet()) {
            int occurrences = occurrencesMap.get(key);
            if (occurrences > maxOccurrences) {
                maxElement = key;
                maxOccurrences = occurrences;
            }

        }

        return maxElement;
    }
}
