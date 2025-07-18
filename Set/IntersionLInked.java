package Collection_Framework.Set;
import java.util.*;

public class IntersionLInked {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.println("enter N");

    int n = scn.nextInt();
    scn.nextLine();

    String[] s = new String[n];

    for(int i=0;i<n;i++)
    {
      s[i] = scn.nextLine();
    }

    HashSet<String> hm = new HashSet<>(Arrays.asList(s));

    System.out.println(hm);
  }
}
