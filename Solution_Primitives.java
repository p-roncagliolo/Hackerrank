import java.util.*;

class Solution_Primitives {
    public static void main(String []argh)
    {
        Scanner sc = new Scanner(System.in);
        int t=sc.nextInt();

        for(int i=0;i<t;i++)
        {
            if (sc.hasNextByte()){
                byte x=sc.nextByte();
                System.out.println(x+" can be fitted in:");
                System.out.println("* byte");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            } else if (sc.hasNextShort()){
                short x=sc.nextShort();
                System.out.println(x+" can be fitted in:");
                System.out.println("* short");
                System.out.println("* int");
                System.out.println("* long");
            } else if (sc.hasNextInt()){
                int x=sc.nextInt();
                System.out.println(x+" can be fitted in:");
                System.out.println("* int");
                System.out.println("* long");
            } else if (sc.hasNextLong()){
                long x=sc.nextLong();
                System.out.println(x+" can be fitted in:");
                System.out.println("* long");
            } else {
                System.out.println(sc.next()+" can't be fitted anywhere.");
            }
        }
    }
}



