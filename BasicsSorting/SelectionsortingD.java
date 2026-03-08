// This code is for the descending order of output
import java.util.*;
public class SelectionsortingD {
    public static void Selection_sort(int arr[]){
        for(int i = 0; i<arr.length-1; i++){
            int minPos = i;
            for(int j = i+1; j<arr.length; j++){
                if(arr[minPos]<arr[j]){
                    minPos = j;
                }
            }
            int temp = arr[minPos];
            arr[minPos] = arr[i];
            arr[i] = temp;
        }
    }
    public static void Printselection(int arr[]){
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {6,5,3,1,2,4};
        Selection_sort(arr);
        Printselection(arr);
    }
}

// Output
// 6 5 4 3 2 1 

// Changes only in * line
// In place of >
// We use this <