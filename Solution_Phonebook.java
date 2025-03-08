import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution_Phonebook {

    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        //listas
        int n = scan.nextInt();
        scan.nextLine();

        Map<String,String> phoneBook = new HashMap<>();
        for (int i=0; i<n; i++) {
            phoneBook.put(scan.nextLine(),scan.nextLine());
        }

        //queries
        while(scan.hasNext()) {
            String name = scan.nextLine();
            String phone = phoneBook.get(name);
            if (phone == null) {
                System.out.println("Not found");
            } else {
                System.out.println(name + "=" + phone);
            }
        }

    }


}
