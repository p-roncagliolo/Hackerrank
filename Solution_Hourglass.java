import java.util.Scanner;

public class Solution_Hourglass {

    public static void main(String[]args){
        Scanner sc =new Scanner(System.in);
        int H=6,W=6;
        int[][] m= new int[H][W];

        for(int h=0; h<H; h++)
            for(int w=0; w<W; w++){
                m[h][w] = Integer.parseInt(sc.next());
            }

        int max = Integer.MIN_VALUE;
        for(int h=0; h<H-2; h++)
            for(int w=0; w<W-2; w++) {
                int hourglass = m[h][w]+m[h][w+1]+m[h][w+2]+m[h+1][w+1]+m[h+2][w]+m[h+2][w+1]+m[h+2][w+2];
                max = Math.max( max, hourglass  );
            }

        System.out.println(max);
    }


}
