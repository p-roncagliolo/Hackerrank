import java.util.LinkedList;
import java.util.Scanner;

public class Solution_LinkedList {

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        //listas
        int n = scan.nextInt();
        LinkedList<Integer> list = new LinkedList<Integer>();
        for (int i=0; i<n; i++) {
            list.add(scan.nextInt());
        }

        //queries
        n = scan.nextInt();
        for (int i=0; i<n; i++) {
            String query = scan.next();
            if ("Insert".equals(query)) {
                int pos = scan.nextInt();
                int value = scan.nextInt();
                list.add(pos, value);
            } else {
                int pos = scan.nextInt();
                list.remove(pos);
            }
        }

        //result
        for (Integer element : list) {
            System.out.print(element + " ");
        }

    }


}
