package Collection_Framework.List;
import java.util.*;
public class ArrayList2 {
  public static void main(String[] args) {
    ArrayList<String> s1 = new ArrayList<>();

    s1.add("om");
    s1.add("kumar");
    s1.add("sinha");

    ArrayList<String> s2 = new ArrayList<>();

    s2.add("mantra");
    s2.add("developer");

      ArrayList<String> copy = (ArrayList<String>)s1.clone();

System.out.println("org "+ s1);
System.out.println("duplicate"+ copy);

  }
}
