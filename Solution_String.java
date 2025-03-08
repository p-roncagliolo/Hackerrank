import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution_String {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();
        int k = in.nextInt();
        List<String> sub = new ArrayList<String>();
        for (int i = 0; i <= S.length()-k; i++) {
            sub.add(S.substring(i,i+k));
        }
        sub.sort(null);
        String smallest = sub.getFirst();
        String largest = sub.getLast();
        System.out.println(smallest + "\n" + largest);
    }

}
