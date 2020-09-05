// package sorting;
package sorting;

import java.util.*;


public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(final String[] args) {
        final String dataType = (args.length != 0) ? args[0] : "default";


        if (!dataType.equals("-dataType") && !dataType.equals("default")) {
            System.out.println("Invalid Operator");

        } else if(dataType != "default" && args.length > 1) {
            switch (args[1]) {
                case "long" : Long(); break;
                case "word" : Word(); break;
                case "line" : Line(); break;
                default : System.out.println("Invalid Operator");
            }
            
        } else {
            Word();
        }
        scanner.close();
    }
    
    private static void Line() {
        Vector<String> Lines = new Vector<>();

        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            Lines.add(line);
            // write your code here
        }
        String longestLine= "";
        int MAX = 0;
        for (int i = 0; i < Lines.size(); ++i) {
            if(Lines.get(i).length() > MAX) {
                MAX =  Lines.get(i).length();
                longestLine = Lines.get(i);
            }
        }
        int frequency = Collections.frequency(Lines, longestLine);
        System.out.println("Total lines: " + Lines.size() + ".");
        System.out.println("The longest line:");
        System.out.println(longestLine);
        System.out.println("(" + frequency + " time(s), " + (int)(((double)frequency/(double)Lines.size())*100) + "%).");
    }

    private static void Word() {
        Vector<String> words = new Vector<>();

        while (scanner.hasNext()) {
            String word = scanner.next();
            words.add(word);
            // write your code here
        }
        String longestWord = "";
        int MAX = 0;
        for (int i = 0; i < words.size(); ++i) {
            if(words.get(i).length() > MAX) {
                MAX =  words.get(i).length();
                longestWord = words.get(i);
            }
        }
        int frequency = Collections.frequency(words, longestWord);
        System.out.println("Total words: " + words.size() + ".");
        System.out.println("The longest word: " + longestWord + " (" + frequency + " time(s), " + (int)(((double)frequency/(double)words.size())*100) + "%).");
    }

    private static void Long() {

        Vector<Long> numbers = new Vector<>();

        while (scanner.hasNextLong()) {
            long number = scanner.nextLong();
            numbers.add(number);
            // write your code here
        }
        long MAX = Collections.max(numbers);
        long frequency = Collections.frequency(numbers, MAX);
        System.out.println("Total numbers: " + numbers.size() + ".");
        System.out.println("The greatest number: " + MAX + " (" + frequency + " time(s), " + (int)(((double)frequency/(double)numbers.size())*100) + "%).");
    }
}
