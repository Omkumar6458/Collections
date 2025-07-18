package Collection_Framework.Set;
import java.util.*;
public class DuplSentence {
  public static void main(String[] args) {
    // ********** REMOVE DUPLICATE WORDS FROM SENTENCE ***********

    Scanner scn = new Scanner(System.in);

    System.out.println("Enter string ");
  
    String s = scn.nextLine();

    String[] str = s.split(" ");

    LinkedHashSet<String> list = new LinkedHashSet<>(Arrays.asList(str)); // to maintain order we used this 

    System.out.println(String.join(" ", list));  // join : String[] arr ={ "hello", "opp","ddd"}; , String.join(" ",words); 
 
    

  }
}
