package Collection_Framework.Set;
import java.util.*;
public class Duplicate {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.println("enter n ");
    int n = scn.nextInt();
   scn.nextLine(); // always make sure to close this line 


    System.out.println("enter string ");
    String[] str = new String[n];
   for(int i =0;i<n;i++)
   {
     str[i] = scn.nextLine();
   }


/* 
   System.out.println("output ");
   for(int i=0;i<n;i++)
   {
    System.out.println(str[i]);
   }
*/

   // to make input : non duplicate , create a hashSet 

   HashSet<String> hm = new HashSet<>(Arrays.asList(str));  // here Arrays.asList : create Arrays to un list 

   System.out.println(hm);

  }
}
