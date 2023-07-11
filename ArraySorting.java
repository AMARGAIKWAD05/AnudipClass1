

package aundipclass;

import java.util.Arrays;

public class ArraySorting {
    public static void main(String[] args) {
        int[] arr = {12, 45, 67, 23, 54};
       int temp=0;
       
        for (int i = 0; i < arr.length; i++) {   
            for (int j = i+1; j < arr.length; j++) {   
               if(arr[i] < arr[j]) {  
                   temp = arr[i];  
                   arr[i] = arr[j];  
                   arr[j] = temp;  
               }   
            }   
        } 



        // Print the sorted array and the second maximum number
        for (int j =0; j < arr.length; j++){
          System.out.print(" " + arr[j]);  
        }
        System.out.println();
          
        // Find the second maximum number using indexing
        int secondMax = arr[1];
        System.out.println("Second Maximum Number: " + secondMax);
    }
}

