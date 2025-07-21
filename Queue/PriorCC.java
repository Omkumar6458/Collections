package Collection_Framework.Queue;
import java.util.*;
public class PriorCC {
  public static void main(String[] args) {
    Comparator<Integer> comp = (a,b)-> b-a;
    PriorityQueue<Integer> pq = new PriorityQueue<>(3);  // cpacity + comparator 

    pq.add(89);
    pq.add(90);

    System.out.println(pq);
  }
}
