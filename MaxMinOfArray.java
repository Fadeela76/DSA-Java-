import java.util.*;

public class MaxMinOfArray{
    public static void main(String args[]){

        //using scanner class for getting size of array
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        

        //empty case
        if(size == 0){
            System.out.println("Array is empty.");
            sc.close();
            return;
        }

        //array creation
        int[] arr = new int[size];
        System.out.println("Enter array elements: ");
        for(int i = 0; i<arr.length ; i++){
            arr[i] = sc.nextInt();
        }

       

        //assigning first element to min and max variables
        int min = arr[0];
        int max = arr[0];

        //finding min and max element
        for(int i = 1; i<arr.length ; i++){
            if(min > arr[i]){
                min = arr[i];
            }

            if(max < arr[i]){
                max = arr[i];
            }
        }

        //printing output
        System.out.println("Minimum element of array: " + min);
        System.out.println("Maximum element of array: " + max);

        //closing scanner class
        sc.close();
    }
}