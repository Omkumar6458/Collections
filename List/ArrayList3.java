package Collection_Framework.List;
import java.util.*;
public class ArrayList3 {
  public static void main(String[] args) {
    ArrayList<String> fruit = new ArrayList<>();

    // Add:
    fruit.add("Apple");
    fruit.add("Banana");
    fruit.add("guava");
    fruit.add("grapes");
   System.out.println(fruit);


   // remove:
   fruit.remove("Apple");
   System.out.println(fruit);


   //Access:
   System.out.println("Access"+ fruit.get(2));
   System.out.println(fruit.indexOf("grapes"));



   //Modify :

   System.out.println(fruit.set(1, "baigan"));
   System.out.println(fruit);


   //Iterator through list :

   System.out.println("list of all fruits ");
   for(String f : fruit)
   {
    System.out.println(f);
   }

    // convert t0 array :

    String[] str = fruit.toArray(new String[0]);  // convert into string 
    System.out.println(Arrays.toString(str));   // convert into  Arrays to string 



    // Sublist :

  System.out.println("sublist");

    List<String> l1 = fruit.subList(0, 2);
    System.out.println(l1);

 // clear :

   fruit.clear();
   System.out.println(fruit);








  }
}
