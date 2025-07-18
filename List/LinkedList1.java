package Collection_Framework.List;
import java.util.*;

public class LinkedList1 {
  public static void main(String[] args) {

    LinkedList<String> list = new LinkedList<>();

    list.add("om");
    list.add("pk");
    list.add("mk");
    list.add("dk");
    list.add("sk");
    list.add("gk");


    System.out.println(list);
// first and last one :
     System.out.println("First element :: "+ list.getFirst());
     System.out.println("last one ::  "+ list.getLast());



     // Remove :
     list.remove("om");
     list.removeFirst();

    System.out.println(list);

    System.out.println("Iterator");

    for(String str : list)
    {
      System.out.println(str);
    }



    
  }
  
  
 
}
