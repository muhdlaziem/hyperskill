import java.util.*;

public class Number_of_occurrences {
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        String sentence = scanner.nextLine();
        String key =  scanner.nextLine();
        
        int lastIndex = 0;
        int count = 0;

        while(lastIndex != -1){

            lastIndex = sentence.indexOf(key,lastIndex);

            if(lastIndex != -1){
                count ++;
                lastIndex += key.length();
            }
        }
        System.out.println(count);

        scanner.close();
    }
    
}
