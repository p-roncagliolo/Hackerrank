import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution_Regex_Password {

    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        in.nextLine();
        String regex = "^[a-zA-Z]{1,1}[a-zA-Z0-9_]{7,29}$";
        Pattern pattern = Pattern.compile(regex);
        for (int i = 0; i < n; i++) {
            String username = in.nextLine();
            Matcher m = pattern.matcher(username);
            if (m.find( )) {
                System.out.println("Valid");
            } else {
                System.out.println("Invalid");
            }
        }
    }
}


