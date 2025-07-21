package Collection_Framework.Queue;
import java.util.*;
public class Demo {
  public static void main(String[] args) {
    
  
  Scanner scn = new Scanner(System.in);
  System.out.println("Enter n");
  int n = scn.nextInt();
  scn.nextLine();

  PriorityQueue<Integer> pq = new PriorityQueue<>();
 // System.out.println("peak before enter :"+ pq.peak());  null

 for(int i=0;i<n;i++)
 {
  int s = scn.nextInt();
  pq.offer(s);
 }

 System.out.println(" peakis "+ pq.peek());
 System.out.println("all value"+ pq);  



}
}
