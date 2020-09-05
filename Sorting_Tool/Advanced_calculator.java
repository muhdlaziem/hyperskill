import java.util.*;


public class Advanced_calculator {
    public static void main(String[] args) {
        String operator = args[0];
        // write your code here
        Vector<Integer> numbers = new Vector<>();
        for (int i = 1; i < args.length; ++i) {
            numbers.add(Integer.parseInt(args[i]));
        }
        Collections.sort(numbers);
        switch (operator) {
            case "MAX" : System.out.println(numbers.get(numbers.size()-1)); break;
            case "MIN" : System.out.println(numbers.get(0)); break;
            case "SUM" : System.out.println(sum(numbers)); break;
            default : System.out.println("Unknown operator");

        }
    }

    private static int sum(Vector<Integer> numbers) {
        int sum = 0; 
        for (Integer x : numbers) {
            sum += x;
        }
        return sum;
    }
    
}
