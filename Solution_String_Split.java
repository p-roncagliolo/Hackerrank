import java.util.*;

public class Solution_String_Split {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String A = in.next();

        List<String> tokens = Arrays.asList(A.trim().split("[ !,?._'@]+"));
        System.out.println(tokens.size());
        tokens.forEach(System.out::println);
    }

}
