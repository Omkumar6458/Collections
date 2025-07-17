package Collection_Framework.List;
import java.util.*;
public class Object1 {
  public static void main(String[] args) {
    ArrayList<Object> list = new ArrayList<>();

    list.add("hello");
    list.add("how are you ");

    list.add(10);
    list.add(20);
    list.add(30);

    ArrayList<String> s1 = new ArrayList<>();
    ArrayList<Integer> I1 = new ArrayList<>();


    for(Object obj : list)
    {
      if(obj instanceof String)
      {
        s1.add((String)obj); // convert explicit 

       // System.out.println(obj);
      }
    }
    System.out.println(s1);

    
    for(Object obj : list)
    {
       if(obj instanceof Integer)  // Here check current obj is instance or not 
       {
        I1.add((Integer)obj);  // convert explict (convert obj into Integer again )
       }
    }

    System.out.println(I1);




  }
}
