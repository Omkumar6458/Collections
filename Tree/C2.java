package Collection_Framework.Tree;
import java.util.*;
public class C2 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    ArrayList<Student> list = new ArrayList<>();

    list.add(new Student("om", 900, 80));
    list.add(new Student("ommm",89,9));


    list.sort(Comparator.comparingInt(s -> s.marks));

    System.out.println(list);
  }
}

class Student {
    String name;
    int marks;
    double height;

    Student(String name, int marks, double height) {
        this.name = name;
        this.marks = marks;
        this.height = height;
    }

    public String toString() {
        return name + " (" + marks + ", " + height + ")";
    }
}

