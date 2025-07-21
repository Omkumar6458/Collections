package Collection_Framework.Queue;
import java.util.*;
public class Copy {
  public static void main(String[] args) {
    PriorityQueue<Integer> org = new PriorityQueue<>();
    org.add(10);
    org.add(9);
    org.add(89);

    PriorityQueue<Integer> copy = new PriorityQueue<>(org);

    while(! copy.isEmpty())
    {
      System.out.println(copy.poll());
    }
  }
}
