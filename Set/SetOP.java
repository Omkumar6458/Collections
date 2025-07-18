package Collection_Framework.Set;
import java.util.*;
public class SetOP {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.println("enter N");
    int n = scn.nextInt();

    System.out.println("enter string 1");
    String[] str = new String[n];

    System.out.println("enter string 2");
    String[] str1 = new String[n];

    for(int i=0;i<n;i++)
    {
      str[i] = scn.nextLine();
    }

    for(int i =0;i<n;i++)
    {
      str1[i] = scn.nextLine();
    }

    HashSet<String> hm = new HashSet<>(Arrays.asList(str));
    HashSet<String> hm1 = new HashSet<>(Arrays.asList(str1));

    HashSet<String> union = new HashSet<>(hm);

    union.addAll(hm1);

    HashSet<String> diffrence = new HashSet<>(hm);

    diffrence.removeAll(hm1);

    
    System.out.println("union is : "+union);
    System.out.println("diffrence is "+ diffrence);
  









  }
}
