import java.util.Scanner;

public class Solution_String_Substring {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        if ( 0 <=  start && start < end && end < S.length() ) {
            System.out.println(S.substring(start, end));
        }
    }

}
