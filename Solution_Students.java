import java.util.*;

class Student {
    private final int id;
    private final String name;
    private final double cgpa;

    public Student(String name, double cgpa, int id) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int getID() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getCGPA() {
        return cgpa;
    }
}

class Priorities {

    private final PriorityQueue<Student> queue = new PriorityQueue<>(
            Comparator.comparing(Student::getCGPA).reversed()
                    .thenComparing(Student::getName)
                    .thenComparing(Student::getID));

    public List<Student> getStudents(List<String> events) {
        events.forEach((event) -> {
            if (event.equals("SERVED")) {
                queue.poll();
            } else {
                String[] details = event.split(" ");
                queue.add(new Student(details[1],Double.parseDouble(details[2]),Integer.parseInt(details[3])));
            }
        });

        List<Student> students = new ArrayList<>();
        while (!queue.isEmpty()) {
            students.add(queue.poll());
        }
        return students;
    }

}

public class Solution_Students {
    private final static Priorities priorities = new Priorities();
    public static void main(String[] argh) {
        //Scanner sc = new Scanner(System.in);
        int N = 1; //sc.nextInt();
        List<String> events = new ArrayList<String>();
        for (int i = 0; i < N; i++) {
            String line = "ENTER John 3.75 50"; //sc.nextLine();
            events.add(line);
        }
        List<Student> students = priorities.getStudents(events);
        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student st : students) {
                System.out.println(st.getName());
            }
        }

    }
}