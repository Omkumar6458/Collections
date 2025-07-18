package Collection_Framework.Set;
import java.util.*;
public class HashLinked {
  public static void main(String[] args) {
    //here using hybrid : doubly linked list and hash table : 
 
    LinkedHashSet<String> list = new LinkedHashSet<>();

    list.add("one");
    list.add("two");
    list.add("three");

    System.out.println(list);
  
  }
}
