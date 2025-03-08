import java.util.*;

public class Solution_Checker_Student {

    public static class Checker implements Comparator<Student>{
        @Override
        public int compare(Student s1, Student s2) {
            // Compare by CGPA (descending order)
            if (Double.compare(s2.cgpa, s1.cgpa) != 0) {
                return Double.compare(s2.cgpa, s1.cgpa);
            }
            // Compare by first name (alphabetical order)
            if (!s1.firstName.equals(s2.firstName)) {
                return s1.firstName.compareTo(s2.firstName);
            }
            // Compare by ID (ascending order)
            return Integer.compare(s1.id, s2.id);
        }
    }

    public static class Student {
        private final String firstName;
        private final Integer id;
        private final Double cgpa;

        Student(Integer id, String firstName, Double cgpa) {
            this.firstName = firstName;
            this.id = id;
            this.cgpa = cgpa;
        }

        @Override
        public String toString() {
            return firstName;
        }
    }


    public static void main(String[]args){
        Scanner scan = new Scanner(System.in);

        int n = 0; //Integer.parseInt(scan.nextLine());

        List<Student> students = new ArrayList<>();
        for (int i=0; i<n; i++) {
            students.add(new Student(scan.nextInt(),scan.next().toLowerCase(),scan.nextDouble()));
        }
        //scan.close();
        students.add(new Student(3, "akashs", 3.69));
        students.add(new Student(30, "shayla", 3.80));
        students.add(new Student(32, "anik", 3.68));
        students.add(new Student(2, "swapnil", 3.69));
        students.add(new Student(300, "towhid", 3.9));

        Collections.sort(students, new Checker());
        students.forEach(System.out::println);

    }


}
