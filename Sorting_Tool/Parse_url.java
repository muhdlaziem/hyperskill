
import java.util.*;


public class Parse_url {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String url = scanner.nextLine();
        String domain = "";

        int mark = url.indexOf("?");

        for(int i = 0 ; i<= mark ; ++i) {
            domain += url.charAt(i);
        }

        url = url.replace(domain, "");
        String[] words = url.split("&");
        String password = "";
        for(int i = 0 ; i< words.length ; ++i) {
            if(words[i].indexOf("=") == words[i].length()-1){
                words[i] += "not found";
            }
            if(words[i].indexOf("pass") != -1){
                password = words[i];
            }
            System.out.println(words[i].replace("=", " : "));

        }
        if (password != "") {
            password = password.replace("pass", "password");
            System.out.println(password.replace("=", " : "));
        }
        scanner.close();


    }
}
