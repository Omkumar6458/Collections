package Collection_Framework.Set;
import java.util.*;
public class SortedSet1 {
  public static void main(String[] args) {
    SortedSet<Integer>set = new TreeSet<>();
  set.add(10);
  set.add(5);
  set.add(20);
  set.add(15);


  System.out.println("sorted set"+ set);
   System.out.println("sorted first set"+ set.first());
 System.out.println("sorted last set"+ set.last());
  System.out.println("Head set"+ set.headSet(15));
   System.out.println("Tail set"+ set.tailSet(10));
   System.out.println("sub set"+ set.subSet(5, 15));
  }
}
