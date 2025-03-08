import java.util.Scanner;

public class Solution_String_Compare {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String A = sc.next();
        String B = sc.next();
        System.out.println(A.length() + B.length());
        System.out.println(A.compareTo(B) > 0 ? "Yes" : "No");
        StringBuilder sbA = new StringBuilder(A.substring(0,1).toUpperCase());
        sbA.append(A.substring(1));
        StringBuilder sbB = new StringBuilder(B.substring(0,1).toUpperCase());
        sbB.append(B.substring(1));
        System.out.println(sbA.toString() + " " + sbB.toString());
    }

}
