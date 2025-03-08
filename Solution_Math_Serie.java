import java.util.*;

class Solution_Math_Serie {

    public static void main(String [] argh){

        int q=2;
        for(int i=0;i<q;i++){
            int a = 0;
            int b = 2;
            int n = 10;
            List<Integer> serie = new ArrayList<Integer>();
            for (int s=0; s<n; s++){
                serie.add(recursive_serie(a, b, s));
            }
            serie.stream().forEach( element -> System.out.print(element + " "));
            System.out.println();
        }
    }

    private static int recursive_serie(int a, int b, int n) {
        if (n == 0) {
            return a + (int) Math.pow(2,n) * b;
        } else {
            return recursive_serie(a, b, n-1) + (int) Math.pow(2,n) * b;
        }
    }
}
