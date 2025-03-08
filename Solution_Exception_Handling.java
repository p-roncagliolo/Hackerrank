import java.util.*;

public class Solution_Exception_Handling {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x;
        int y;
        try {
            if (sc.hasNextInt()) {
                x = sc.nextInt();
                if (sc.hasNextInt()) {
                    y = sc.nextInt();
                    if (y != 0) {
                        System.out.print(x / y);
                    } else throw new java.lang.ArithmeticException();
                } else throw new java.util.InputMismatchException();
            } else throw new java.util.InputMismatchException();

        } catch (java.lang.ArithmeticException e) {
            System.out.print("java.lang.ArithmeticException: / by zero");
        } catch (java.util.InputMismatchException e) {
            System.out.print("java.util.InputMismatchException");
        }
    }


}
