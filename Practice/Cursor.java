package Collection_Framework.Practice;
import java.util.*;

import javax.sound.sampled.EnumControl;
public class Cursor {
  public static void main(String[] args) {
  
  Vector<String> l1 = new Vector<>();

  l1.add("om");
  l1.add("kumar");
  l1.add("sinha");

Enumeration<String> enumerator = l1.elements();

        // Traverse elements
        while (enumerator.hasMoreElements()) {
            System.out.println(enumerator.nextElement());

 
  }
    
  }
}
  

