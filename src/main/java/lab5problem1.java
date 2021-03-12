//no pomegranates
/**
 *
 * @author tatev
 */
import static java.time.Clock.system;
import java.util.Random;
import java.util.Scanner;
        
public class lab5problem1 {

    
//import package

//import java.util.*;

//import java.util.lang.*;

//import java.io.*;

class Main

{

public void main (String[] args) throws java.lang.Exception

{
   try{
    
        int[] arr1 = {1,5,10,2,4,-3,6};

      int num1=3;

      System.out.println("Numbers greater than "+num1+" in the 1st array are :");

      fun(arr1,num1);

      int[] arr2 = {10, 12, 15, 24};

      int num2 = 12;

      System.out.println("Numbers greater than "+num2+" in the 2nd array are :");

      fun(arr2, num2);

   }catch(Exception ex){

       return;}
}

public void fun(int[] arr,int n)
  {
  for(int i=0; i<arr.length; i++)
  {
      if (arr[i]>n)

          System.out.print(arr[i]+" ");

  }

  System.out.println();

}

}
}