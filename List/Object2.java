package Collection_Framework.List;
import java.lang.reflect.Array;
import java.util.*;
public class Object2 {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    ArrayList<Object> l1 = new ArrayList<>();

   System.out.println("enter data with , ");

   String s = scn.nextLine();

   String[] values = s.split(",");

  // System.out.println(values);

  for(String str : values)
  {
    String val = str.trim();

    if(val.length() ==3 && val.startsWith(" ' "  ) && val.endsWith("'"))
    {
      char c = val.charAt(1);
      l1.add(c);
    }

    else if(val.equalsIgnoreCase("true") || val.equalsIgnoreCase("false"))
    {
      l1.add(val);
    }


    try{
       if(val.contains("."))
       {
        l1.add(Double.parseDouble(val));
       }
       else{
        l1.add(Integer.parseInt(val));
       }
    }
    catch(Exception e)
    {
      l1.add(val); // as string
    }

   }

    System.out.println(l1);
   

  }
}
