/*
Create a class myCalculator which consists of a single method power(int,int). This method takes two integers, nn and pp, as parameters and finds npnp. If either nn or pp is negative, then the method must throw an exception which says "n and p should be non-negative".
*/
import java.util.Scanner;

class myCalculator {
    public String power (int n, int p) throws NegativeException {
        int power = 0;
        try {
            if (n==0 && p==0) {
                throw new ZeroException();
            }
            if (n<0 || p<0) {
                throw new NegativeException();
            }

            power = (int) Math.pow(n, p);
            return power +"";

        } catch (NegativeException e) {
            return "java.lang.Exception: n or p should be not be negative.";
        } catch (ZeroException e) {
            return "java.lang.Exception: n and p should be not be zero.";
        }
    }
}

class ZeroException extends Exception {
    private static final long serialVersionUID = 1L;

    public ZeroException() {
        super();
    }
}

class NegativeException extends Exception {
    private static final long serialVersionUID = 1L;

    public NegativeException() {
        super();
    }
}

class Solution_Exception {

    public static void main(String []argh) {
        Scanner in = new Scanner(System.in);
        while(in.hasNextInt()) {
            int n = in.nextInt();
            int p = in.nextInt();
            myCalculator M = new myCalculator();
            try {
                System.out.println(M.power(n,p));
            } catch(Exception e) {
                System.out.println(e);
            }
        }
    }
}
