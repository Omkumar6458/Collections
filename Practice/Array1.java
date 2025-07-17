import java.util.*;

public class Array1 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    System.out.println("Enter no of ele");
    int ele = scn.nextInt();

    int[] arry = new int[ele];

    for(int i=0;i<ele;i++)
    {
      arry[i] = scn.nextInt();
    }

    System.out.println("Here array");

    for(int i =0;i<ele;i++)
    {
      System.out.println(arry[i]);
    }
  }
}


/*4
 *  Student s = new Student[1000];
 * s[0] = new student();  // valid :: you can create 
 * s[0] = new counsume();  // unvalid :: can creare other object 
 * 
 * 
 * 
 * 
 */