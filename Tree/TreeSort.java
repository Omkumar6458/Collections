
import java.util.*;
public class TreeSort {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.println("Enter N");
    int n = scn.nextInt();
    scn.nextLine();

  //  HashSet<Integer> hm = new HashSet<>(); // this is nornmal

 SortedSet1<Integer> ss = new TreeSet<>();  // this is sorted TreesET

    System.out.println("Enter Integer");
    for(int i=0;i<n;i++)
    {
      int s = scn.nextInt();
      ss.add(s);
    }



    System.out.println("Total is :"+ss);
    System.out.println("First : "+ss.first());
    System.out.println("Last : "+ ss.last());

  }
}
