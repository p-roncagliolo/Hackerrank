import java.util.Scanner;

public class Solution_SubArray {

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = scan.nextInt();
        }

        scan.close();
        int negative = 0;
        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                int sum = 0;
                // sumatoria del subarray
                for(int k=i; k<=j; k++) {
                    sum = sum + a[k];
                }
                if (sum < 0){
                    negative++;
                }
            }
        }
        System.out.println(negative);
    }


}
