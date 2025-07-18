package Collection_Framework.Set;
import java.util.*;
public class Navigable {
  public static void main(String[] args) {
    NavigableSet<Integer> set = new TreeSet<>();
   
    set.addAll(Arrays.asList(10,20,30,40,50));

    System.out.println("set :  " + set.lower(30));
    System.out.println("floor :" + set.floor(30));
    System.out.println("ceiling : " + set.ceiling(25));
    System.out.println("higher :" + set.higher(30));

    System.out.println("decreasing :" + set.descendingSet());

    System.out.println("poll first : "+ set.pollFirst()); 

    System.out.println("poll last : "+ set.pollLast());
    System.out.println("after poll : "+ set);








  }
}
