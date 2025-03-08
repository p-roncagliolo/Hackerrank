import java.util.*;

public class Solution_ArrayList {

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        //listas
        int n = scan.nextInt();
        ArrayList[] listas = new ArrayList[n];
        for (int i=0; i<n; i++) {
            int m = scan.nextInt();
            ArrayList<Integer> list = new ArrayList<>();
            for (int q=0; q<m; q++) {
                list.add(scan.nextInt());
            }
            listas[i] = list;
        }

        //queries
        int m = scan.nextInt();
        for(int i=0; i<m; i++) {
            int a = scan.nextInt();
            int b = scan.nextInt();
            try {
                System.out.println(listas[a-1].get(b-1));
            } catch ( Exception e ) {
                System.out.println("ERROR!");
            }
        }
        //scan.close();

    }


}
