package Collection_Framework.Queue;
import java.util.*;
public class Capacity {
  public static void main(String[] args) {
    PriorityQueue <Integer> pq = new PriorityQueue<>(5); // here capacity : is intitai =5
    pq.add(10);
    pq.add(30);
    pq.add(60);
    pq.add(80);
    pq.add(89);  // it reach to max : initial 
    pq.add(90);  // now expanding : 

System.out.println(pq);
  }
}
