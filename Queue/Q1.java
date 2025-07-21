package Collection_Framework.Queue;
import java.util.*;
public class Q1 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    PriorityQueue<Character> pq = new PriorityQueue<>();

    pq.offer('A');
    pq.offer('C');
    pq.offer('D');
    pq.offer('B');

    System.out.println("order: "+ pq);  // INSERTION ORDER IS RANDOM

   System.out.println("poll"+ pq.poll());
   System.out.println("poll"+ pq.poll());
   System.out.println("poll"+ pq.poll());
   System.out.println("poll"+ pq.poll());

    
  // DELETION ORDER IS NOT RANDOM : IT IS IN NATURAL SORTING ORDER 


  }
}
