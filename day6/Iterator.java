import java.util.*;


class Student {
    String name;
    public Student(String name) {
        this.name = name;
    
    }

    public String toString() {
        return "Name: " + name;
    }
}

public class Iterator {
    public static void main(String[] args) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("SREE"));
        students.add(new Student("VARSHINI"));
        students.add(new Student("NITHRAN"));

        Iterator<Student> iterator = students.iterator();
        while (iterator.hasNext()) {
            Student student = iterator.next();
            System.out.println(student);
        }
    }
}