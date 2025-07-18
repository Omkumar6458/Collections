package Collection_Framework.Set;
import java.util.*;
public class LinkedToArry {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    LinkedHashSet<String> list = new LinkedHashSet<>();

    System.out.println("Enter elements : ");
    while(true)
    {
      
      String s = scn.nextLine();

     
      if(s.isEmpty())
      {
        break;
      }
      list.add(s);
      

    }
    
    System.out.println("This is list : "+list);
    System.out.println("This is string :-");
   String [] string = list.toArray(new String[0]);  // convert to string 
   for(String str : string)
   {
    System.out.println(str);
   }
  }
}
