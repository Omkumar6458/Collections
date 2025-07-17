package Collection_Framework.List;

import java.util.*;
public class Clone {
  public static void main(String[] args) {
    
    ArrayList<String> original = new ArrayList<>();

        original.add("Java");
        original.add("Python");

        // Cloning
        ArrayList<String> cloned = (ArrayList<String>) original.clone();

        // Modifying cloned list
        cloned.add("C++");

        System.out.println("Original List: " + original);
        System.out.println("Cloned List  : " + cloned);


  }
}
