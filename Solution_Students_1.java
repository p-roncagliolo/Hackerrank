import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.PriorityQueue;

class Student1 implements Comparable<Student1> {
    int id;
    String name;
    double cgpa;

    Student1(int id, String name, double cgpa) {
        this.id = id;
        this.name = name;
        this.cgpa = cgpa;
    }

    public int compareTo(Student1 b) {
        if (this.cgpa > b.cgpa) { return -1; }
        if (this.cgpa < b.cgpa) { return 1; }
        if (this.cgpa == b.cgpa) {
            if (this.name.compareTo(b.name) < 0 ) { return -1; }
            if (this.name.compareTo(b.name) > 0) { return 1; }
            if (this.name.compareTo(b.name) == 0) {
                if (this.id < b.id) { return -1; }
                if (this.id > b.id) { return 1; }
            }
        }
        return 0;
    }

    public String getName() {
        return name;
    }
}

class Priorities1 {
    Priorities1() {}

    public List<Student1> getStudents(List<String> events) {

        PriorityQueue<Student1> queue = new PriorityQueue<>();

        for (String event : events) {
            if (event.contains("SERVED")) {
                if (!queue.isEmpty()) {
                    queue.poll();
                }
            } else {
                String[] data = event.split(" ");
                queue.add(new Student1(Integer.parseInt(data[3]), data[1], Double.parseDouble(data[2])));
            }
        }

        List<Student1> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            result.add(queue.poll());
        }

        return result;
    }

}



public class Solution_Students_1 {
    private final static Scanner scan = new Scanner(System.in);
    private final static Priorities1 priorities = new Priorities1();

    public static void main(String[] args) {
        int totalEvents = Integer.parseInt(scan.nextLine());
        List<String> events = new ArrayList<>();

        while (totalEvents-- != 0) {
            String event = scan.nextLine();
            events.add(event);
        }

        List<Student1> students = priorities.getStudents(events);

        if (students.isEmpty()) {
            System.out.println("EMPTY");
        } else {
            for (Student1 st: students) {
                System.out.println(st.getName());
            }
        }
    }
}