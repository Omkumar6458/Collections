import java.util.*;
public class CustomCollect {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
    
    List<Integer> li = new ArrayList<>();
    li.add(10);
    li.add(20);
    li.add(20);
    li.add(30);

  System.out.println("print Arraylist "+ li);
    HashSet<Integer> hm = new HashSet<>(li);

    System.out.println("print HashSet"+ hm);



  }
}
