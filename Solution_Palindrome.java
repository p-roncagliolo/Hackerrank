import java.util.Scanner;

public class Solution_Palindrome {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        System.out.println(palindrome(S) ? "Yes" : "No");
    }

    private static boolean palindrome(String s){
        if (s.length() == 1)
            return true;
        else if (s.length() == 2)
            return s.charAt(0) == s.charAt(1);
        else
            return palindrome(s.substring(1,s.length()-1));
    }

}
