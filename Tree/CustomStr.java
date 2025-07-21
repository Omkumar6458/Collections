package Collection_Framework.Tree;
import java.util.*;
public class CustomStr {
  public static void main(String[] args) {
    

    Scanner scn =  new Scanner(System.in);
   
    
    TreeSet<String> list = new TreeSet<>((s1, s2) -> s1.length() - s2.length());

    System.out.println("enter N");
    int n = scn.nextInt();
    scn.nextLine();

  System.out.println("enter string");
    for(int i=0;i<n;i++)
    {
    
      String s = scn.nextLine();

      list.add(s);
      
    }


    System.out.println(list);
  }
}
