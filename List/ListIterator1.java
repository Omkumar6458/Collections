package Collection_Framework.List;
import java.util.*;
public class ListIterator1 {
  public static void main(String[] args) {
    LinkedList<String> name = new LinkedList<>();
    name.add("okey");
    name.add("nokey");
    name.add("donkey");

    ListIterator<String> li = name.listIterator(); // object in lower-case 

    System.out.println("Forward");

    while(li.hasNext())
    {
      System.out.println(li.next());
    }

   
    System.out.println("Backward");

    while(li.hasPrevious())
    {
      System.out.println(li.previous());
    }


  }
}
