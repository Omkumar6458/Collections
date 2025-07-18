package Collection_Framework.Set;
import java.util.*;
public class Intersection {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    // two arry intersection : (using string )
    System.out.println("enter no of string in 1");

    int n = scn.nextInt();
    scn.nextLine();

    System.out.println("enter nof of string in 2");
     int n1 = scn.nextInt();
     scn.nextLine();


    System.out.println("enter string 1 ");

    String [] str = new String[n];
    String[] st1  = new String[n1];
    for(int i=0;i<n;i++)
    {
      str[i] = scn.nextLine();
    }


    System.out.println("enter string 2");


   String[] str1 = new String[n1];

   for(int i=0;i<n1;i++)
   {
    str1[i] = scn.nextLine();
   }
   

  HashSet<String> hm = new HashSet<>(Arrays.asList(str));
  HashSet<String> hm1 = new HashSet<>(Arrays.asList(str1));

  hm.retainAll(hm1); //intersection 

  System.out.println("comman between them : ");
  System.out.println(hm);







  
    
  }
}
