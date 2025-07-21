
import java.util.*;
public class CustomColl1 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    LinkedList<String> list = new LinkedList<>();

    System.out.println("Enter N");
    int n = scn.nextInt();
    scn.nextLine();

    System.out.println("Enter Name");
    for(int i=0;i<n;i++)
    {
       String s = scn.nextLine();
       list.add(s);

    }

  System.out.println("LinkedList"+ list);


  HashSet<String> hm = new HashSet<>(list);

 System.out.println("HashSet"+ hm);

  }
}
