package Collection_Framework.List;
import java.util.*;
public class Obj {
  public static void main(String[] args) {
    Scanner scn = new Scanner(System.in);

    ArrayList<Object> l1 = new ArrayList<>();  // CREATE A MIX ARRYLIST WHERE I STORE EACH ONE : CHAR , INT STRING, DECIMAL 

    ArrayList<Integer> Inte = new ArrayList<>();  // THIS IS SEPRATE ONE 

    ArrayList<String> str = new ArrayList<>();

    ArrayList<Double> doubl = new ArrayList<>();

    ArrayList<Character> ch = new ArrayList<>();


    System.out.println("Enter diffrent elements ");

     
    while(true)   // HERE I DON'T KNOW WHAT IS NUMBER 
    {
      String input = scn.nextLine();  // TAKE INPUT AS STRING 

      if(input.isEmpty())
      {
        break;
      }

    //  l1.add(input);  // here is problem , every thing convert into string 


    try{  // TRY CATHCH FOR NOT CAUSE ANY ERROR 

       if(input.contains("."))  // FOR SINHLE SINGLE INPUT IT STORE 
       {
         Double d = Double.parseDouble(input);  // convert kr kr pass kre 
         l1.add(d);
       }
      else if(input.length() ==3 && input.charAt(0) == '\'' && input.charAt(2) == '\'')
       {
      char c = input.charAt(1);
                    l1.add(c);  
       }
       else{
        Integer I1 = Integer.parseInt(input);  // CONVRT INTO PARSE : STRING TO INTERGER
        l1.add(I1);

       }
      }

       catch(Exception e)
       {
         l1.add(input);  // AT LAST THIS IS ALREADY A STRING 
       }


    }

























    

    for(Object obj : l1)
    {
      if(obj instanceof Integer)  // AS ABOVE EACH OBJ IS CONVERT INTO RESPECTIVE INT , FLOAT ,DOUBLE , CHAR , SIMPLE TO STORE EACH ONE 
      {
         Inte.add((Integer)obj);
      }
    }

    for(Object obj : l1)
    { 
    if(obj instanceof String)
      {
       str.add((String)obj);
      }
    else if(obj instanceof Double)
    {
      doubl.add((Double)obj);
    }
    else if( obj instanceof Character)
    {
      ch.add((Character)obj);
    }

    }

    System.out.println("interger "+ Inte);
    System.out.println("string "+ str);
    System.out.println("double"+ doubl);
    System.out.println("char"+ ch);
  }



    
}
    
  

  

