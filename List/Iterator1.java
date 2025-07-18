package Collection_Framework.List;
import java.util.*;
public class Iterator1 {
  public static void main(String[] args) {
    ArrayList<String> list = new ArrayList<>();

    list.add("apple");
    list.add("banana");
    list.add("grapes");

    Iterator<String> itr  = list.iterator();
    
   while(itr.hasNext())
   {
    String lang = itr.next();
    System.out.println(lang);

    if(lang.equals("banana"))
    {
      itr.remove();
    }
   }

    System.out.println("After remove :"+ list);

  }
}
