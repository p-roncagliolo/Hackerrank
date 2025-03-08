
import java.math.BigInteger;
import java.util.Scanner;

public class Solution_BigInteger {

    public static void main(String []argh) {
        Scanner sc= new Scanner(System.in);
        BigInteger a = sc.nextBigInteger();
        BigInteger b = sc.nextBigInteger();
        System.out.println(a.add(b));
        System.out.println(a.multiply(b));

    }

}
