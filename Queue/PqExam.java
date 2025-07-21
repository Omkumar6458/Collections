package Collection_Framework.Queue;
import java.util.*;
public class PqExam {
  public static void main(String[] args) {
    PriorityQueue<Integer> hm = new PriorityQueue<>();

    hm.add(10);
    hm.add(30);
    hm.add(20);


   while(!hm.isEmpty())
   {
      System.out.println( hm.poll());
   }


  }
}
