package Collection_Framework.Map;
import java.util.*;
public class M1 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);
     
    System.out.println("enter N times");
    int n = scn.nextInt();

 while( n>0)
 {
   try {


      System.out.println("Enter value of p-box");
      int p = scn.nextInt();

      System.out.println("Enter value of Q-box");
      int q = scn.nextInt();

      System.out.println("Enter value of R box");
      int r = scn.nextInt();

      System.out.println("Enter size of bag");

      int s = scn.nextInt();
      if(p > s || q > s || r > s )
      {
         throw new NotValid(" PLEASE ENTER VALUE LESS THAN S(BAG SIZE )");
      }else if( p + q+ r <= s)
      {
        System.out.println("total bag need : " + 1);
      }else if(( p+q <s && r<s ) || (p + r <= s && q <= s) ||
                     (q + r <= s && p <= s))
                     {
                      System.out.println("total bag need : "+ 2);
                     }
                     else{
                      System.out.println(" total bag need : " + 3);
                     }


     n--;
      
    }
    finally{

    }
  }
 }
}


class NotValid extends RuntimeException  // if user enter size of any box > size of bag it give runtime error
{
  NotValid( String s)
  {
    super(s);
  }
}

