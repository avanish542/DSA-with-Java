import java.util.*;
public class BubbleSorting {
    public static void Bubble_Sorting(int arr[]){
        for(int turn = 0; turn<arr.length-1; turn++){
            for(int j = 0; j<arr.length-1-turn; j++){
                if(arr[j]>arr[j+1]){
                    // Swap
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
       
    }
    public static void Printarr(int arr[]){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i]+ " ");
            }
            System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {5,4,1,2,3};
        Bubble_Sorting(arr);
        Printarr(arr);
    }
}



// command to run this
// javaC BasicsSorting/BubbleSorting.java
// java BasicsSorting/BubbleSorting.java

// Output
// 1 2 3 4 5 