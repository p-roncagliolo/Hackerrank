import java.util.*;

public class Solution_Deque {

public static void main(String []argh) {
            Scanner sc= new Scanner(System.in);
            int N = sc.nextInt();
            int M = sc.nextInt();

            Deque<Integer> deque = new ArrayDeque<>();
            Set<Integer> uniqueElements = new HashSet<>();

            int maxUnique = 0;

            for (int i = 0; i < N; i++) {
                int num = sc.nextInt();
                deque.addLast(num);
                uniqueElements.add(num);
                if (deque.size() == M) {

                    maxUnique = Math.max(maxUnique, uniqueElements.size());

                    int removedElement = deque.removeFirst();

                    if (!deque.contains(removedElement)) {
                        uniqueElements.remove(removedElement);
                    }
                }

            }
            System.out.println(maxUnique);
        }


}



