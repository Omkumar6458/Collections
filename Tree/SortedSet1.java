import java.util.*;
public class SortedSet1 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.println("Enter n");
    int n = scn.nextInt();

   List<Integer> li = new ArrayList<>();

  SortedSet<Integer> ss = new TreeSet<>(li);
    for(int i=0;i<n;i++)
    {
      int s = scn.nextInt();
      li.add(s);
      ss.add(s);
    }


    

    System.out.println("LinkedList"+li);

    System.out.println("Sorted Set"+ss);


  }
}
