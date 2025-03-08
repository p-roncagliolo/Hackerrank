import java.util.Scanner;

public class Solution_String_Array {

public static void main(String []argh) {
    Scanner sc= new Scanner(System.in);
    int n=sc.nextInt();
    String []s = new String[n];

    for(int i=0; i<n; i++) {
        s[i] = sc.nextLine();
    }

    for(int i=0; i<n; i++) {
        System.out.println(s[i]);
    }

}


}
