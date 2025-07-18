package Collection_Framework.Set;
import java.util.*;
public class LinkedEven {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    LinkedHashSet<Integer> list = new LinkedHashSet<>();

    System.out.println("Enter no of elements  ");
     int n = scn.nextInt();

   LinkedHashSet<Integer> number = new LinkedHashSet<>();

 System.out.println("Enter value ");
    for(int i=0;i<n;i++)
    {
     list.add(scn.nextInt()); // add directly into list
    }

    System.out.println("Total enter value : "+list);



  for(int n1 : list)
  {
    if(n1 % 2==0)
    {
      number.add(n1);
    }
  }
 
  System.out.println("Even number " + number);


  }
}
