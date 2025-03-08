import java.util.*;

public class Solution_BitSet {

public static void main(String []argh) {
            Scanner sc= new Scanner(System.in);
            int N = sc.nextInt(); //nro de bit de BitSet
            int M = sc.nextInt(); //nro de operaciones

            BitSet b1 = new BitSet(N);
            BitSet b2 = new BitSet(N);
            List<BitSet> bits = new ArrayList<BitSet>();
            bits.add(b1);
            bits.add(b2);

            for (int i = 0; i < M; i++) {
                String operation = sc.next();
                int x = sc.nextInt();
                int y = sc.nextInt();

                switch (operation) {
                    case "AND":
                        bits.get(x).and(bits.get(y));
                        break;
                    case "OR":
                        bits.get(x).or(bits.get(y));
                        break;
                    case "XOR":
                        bits.get(x).xor(bits.get(y));
                        break;
                    case "FLIP":
                        bits.get(x).flip(y);
                        break;
                    case "SET":
                        bits.get(x).set(y);
                        break;
                    default:
                        break;
                }
                System.out.println(bits.get(1).cardinality() + " " + bits.getLast().cardinality());
            }

        }


}

