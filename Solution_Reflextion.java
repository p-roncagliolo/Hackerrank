import java.util.Scanner;

public class Solution_Reflextion {

    interface PerformOperation {
        boolean check(int a);
    }

    static class MyMath {
        public static boolean checker(PerformOperation p, int num) {
            return p.check(num);
        }
        public static PerformOperation isOdd() {
            return (a) -> {
                return (a % 2 != 0);
            };
        }
        public static PerformOperation isPrime() {
            return (a) -> {
                for (int i = 2; i <= a / 2; i++) {
                    if (a % i == 0)
                        return false;
                }
                return true;
            };
        }
        public static PerformOperation isPalindrome() {
            return (a) -> {
                int rev = 0;int r = 0;int n = a;
                while (n != 0) {
                    r = n % 10;
                    rev = rev * 10 + r;
                    n /= 10;
                }
                return (rev == a);
            };
        }

    }

public static void main(String []argh) {
            Scanner sc= new Scanner(System.in);

            int N = sc.nextInt(); //nro test cases
            for (int i = 0; i < N; i++) {
                int fn = sc.nextInt();
                int value = sc.nextInt();

                switch (fn) {
                    case 1:
                        System.out.println( MyMath.checker(MyMath.isOdd(),value) ? "ODD" : "EVEN");
                        break;
                    case 2:
                        System.out.println( MyMath.checker(MyMath.isPrime(),value) ? "PRIME" : "COMPOSITE");
                        break;
                    case 3:
                        System.out.println( MyMath.checker(MyMath.isPalindrome(),value) ? "PALINDROME" : "NOT PALINDROME");
                        break;
                }
            }
        }
}

