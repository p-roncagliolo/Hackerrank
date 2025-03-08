import java.util.*;

public class Solution_Checker_Player {

    public static class Checker implements Comparator<Player>{
        @Override
        public int compare(Player o1, Player o2) {
            if (o1.score == o2.score) {
                return o1.name.compareTo(o2.name);
            } else {
                return o2.score - o1.score;
            }
        }
    }

    public static class Player {
        private String name;
        private Integer score;

        Player(String name,Integer score){
            this.name=name;
            this.score=score;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Integer getScore() {
            return score;
        }

        public void setScore(Integer score) {
            this.score = score;
        }

        @Override
        public String toString() {
            return this.name + " " + this.score;
        }
    }


    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();

        List<Player> players = new ArrayList<>();
        for (int i=0; i<n; i++) {
            players.add(new Player(scan.next().toLowerCase(),scan.nextInt()));
        }
        scan.close();

        Comparator myComparator = new Checker();
        players.sort(myComparator);
        players.forEach(System.out::println);

    }


}
