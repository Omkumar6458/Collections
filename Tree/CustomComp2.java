package Collection_Framework.Tree;
import java.util.*;

public class CustomComp2 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        TreeSet<Student> list = new TreeSet<>(
            Comparator.comparingInt((Student s) -> s.marks)
                      .thenComparing(s -> s.names)
        );

        System.out.println("Enter N:");
        int n = Integer.parseInt(scn.nextLine());

        for (int i = 0; i < n; i++) {
            System.out.print("Enter student name: ");
            String name = scn.nextLine();

            System.out.print("Enter student marks: ");
            int marks = scn.nextInt();
            scn.nextLine();  // Clear buffer

            list.add(new Student(name, marks));
        }

        System.out.println("TreeSet contains:");
      // for (Student s : list) {
      //     System.out.println(s);
       // }

       System.out.println(list);
    }
}

class Student {
    String names;
    int marks;

    Student(String names, int marks) {
        this.names = names;
        this.marks = marks;
    }

    @Override
    public String toString() {
        return names + " - " + marks;
    }
}
