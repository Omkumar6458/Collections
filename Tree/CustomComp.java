package Collection_Framework.Tree;
import java.util.*;
public class CustomComp {
  public static void main(String[] args) {
    TreeSet<Integer> tree = new TreeSet<>(Comparator.reverseOrder());

    tree.add(20);
    tree.add(10);
    tree.add(5);
    tree.add(2);
    tree.add(1);


  System.out.println("reverse is : "+ tree);
   
  }
}
