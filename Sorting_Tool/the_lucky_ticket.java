import java.util.*;

public class the_lucky_ticket {
    public static void main(final String[] args) {
        Scanner scanner = new Scanner(System.in);

        String str = scanner.nextLine();
        char[] arr = str.toCharArray();
        int first=0;
        int second=0;
        for(int i = 0 ; i < arr.length ; ++i){
            if(i<=arr.length/2 -1){
                first += Character.getNumericValue(arr[i]);
            }
            else{
                second += Character.getNumericValue(arr[i]);

            }
        }
        System.out.println(first == second ? "Lucky" : "Regular");
        scanner.close();
    }
}
