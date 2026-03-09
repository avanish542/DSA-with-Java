import java.util.*;
public class CountingSort{
    public static void Counting_sort(int arr[]){
        int largest = Integer.MIN_VALUE;
        for(int i = 0; i < arr.length; i++){
            largest = Math.max(largest, arr[i]);
        }
        int count[] = new int[largest+1];
        for(int i = 0; i<arr.length; i++){
            count[arr[i]]++;

        }
        // Sorting 
        int j = 0;
        for(int i =0; i<count.length; i++){
            while(count[i]> 0){
                arr[j] = i;
                j++;
                count[i]--;
            }
        }
    }
    public static void printCount(int arr[]){
        for(int i =0; i<arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {5,1,4,1,6,2,1,2,4,6};
        Counting_sort(arr);
        printCount(arr);
    }
}

// Output:
// 1 1 1 2 2 4 4 5 6 6 