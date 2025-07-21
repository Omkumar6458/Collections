package Collection_Framework.Queue;
import java.util.*;
public class SortedPrio {
  public static void main(String[] args) {
    SortedSet<Integer> Set = new TreeSet<>();

    Set.add(0);
    Set.add(40);
    Set.add(80);


    PriorityQueue<Integer> hm = new PriorityQueue<>(Set);

    while(! hm.isEmpty())
    {
        System.out.println(hm.poll());
    }

  }
}
