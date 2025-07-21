package Collection_Framework.Map;
import java.util.*;
public class HashMap1 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    Map<String, String> map = new HashMap<>();
    System.out.println("enter N");

    int n = scn.nextInt();
    scn.nextLine();

    for(int i=0;i<n;i++)
    {
      System.out.println("enter Key");
      String key = scn.nextLine();
    

      System.out.println("enter value");
      String value = scn.nextLine();
    

      map.put(key, value);


    }


    for(String key :map.keySet() )
    {
      System.out.println("key :: values is ::");
      System.out.println(key + "-->"+ map.get(key));
    }
    





  }
}
