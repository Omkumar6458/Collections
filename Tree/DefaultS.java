package Collection_Framework.Tree;
import java.util.*;
public class DefaultS {
  public static void main(String[] args) {
    TreeSet<Integer> tree = new TreeSet<>();

    tree.add(10);
    tree.add(3);
    tree.add(2);
    tree.add(1);
    tree.add(5);
    tree.add(4);

    System.out.println("Order is : " + tree); // Here insertion order is not matter  , it is by default 

    System.out.println("firts :" + tree.first());
    System.out.println("last "+  tree.last());

    System.out.println("higher " + tree.higher(5));
    System.out.println("lower"+ tree.lower(4));
    
    System.out.println("ceiling "+ tree.ceiling(5));
    System.out.println("floor"+ tree.floor(4));

  }
}
