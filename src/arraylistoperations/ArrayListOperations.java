
package arraylistoperations;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListOperations {

    public static void main(String[] args) {
      ArrayList<Integer> list=new ArrayList<>();
      ArrayList<Integer> number1=new ArrayList<>();
      list.add(6);
      list.add(2);
      list.add(3);
      //For Add In Position
      list.add(3,4);
      
      for(int i: list){
          System.out.println(i);
      }
      //Add in Another list
      number1.addAll(list);
      System.out.println("Added All in List"+list);
      
      //number1.equals(list) //boolean return equal or not
      //Update List
      list.set(3,5);
      System.out.println("After Update "+list);
      //Remove Index
      list.remove(3);
      System.out.println("After Remove "+list);
     
      //Remove All
    list.removeAll(list);
    //list.clear() //Same As Remove All
    System.out.println("Remove All"+list);
    //list.isEmpty() //boolean Check Empty or Not 
    //list.contains(2) //boolean Check list contais this number or not
    //list.indexOf(3) //check which index is for this number
    //list.get(3)  //check which number in this index
    
    //Sorting
   Collections.sort(number1);
   System.out.println("Accending Sort "+number1);
   
   Collections.sort(number1,Collections.reverseOrder());
   System.out.println("Decending Sort "+number1);
    }
    
}
