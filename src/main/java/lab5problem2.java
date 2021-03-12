// IF thisdoesntwork
//THEN pleasework

import java.util.Scanner ;
import java.util.Random ;

/**
 *
 * @author tatev
 */
public class lab5problem2 {

    
// highest stuff
public static int getHighest(int[] arr){

int highestValue = arr[0];

for(int i=1;i < arr.length;i++){

if(arr[i] > highestValue){

highestValue = arr[i];

}

}

return highestValue;

}

 

// lowest value

public static int getLowest(int[] arr){

int lowestValue = arr[0];

for(int i=1;i<arr.length;i++){

if(arr[i] < lowestValue){

lowestValue = arr[i];

}

}

return lowestValue;

}

// average value

public static double getAverage(int[] arr){

int sum=0;

for(int i=0;i<arr.length;i++){

sum +=arr[i];

}

double averageValue = (double)sum/arr.length;

return averageValue;

}

 
// total stuff
public static int getTotal(int[] arr){

int total=0;

for(int i=0;i<arr.length;i++){

total +=arr[i];

}

return total;

}

public static void main(String[] args) {



int[] arr = new int[]{12, 45, 98, 33, 54};



int total = getTotal(arr);

System.out.println("Total of given vales in array: "+total);



double average = getAverage(arr);

System.out.println("Average of given vales in array: "+average);



int highest = getHighest(arr);

System.out.println("Highest Value in given array is: "+highest);


int lowest = getLowest(arr);

System.out.println("Lowest Value in given array is: "+lowest);

}

}