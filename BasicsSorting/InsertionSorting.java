import java.util.*;
public class InsertionSorting{
    public static void Insertion_Sorting(int arr[]){
        for(int i = 1; i<arr.length; i++){
            int curr = arr[i];
            int prev = i-1;
            while(prev >= 0 && arr[prev]> curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1] = curr;
        }
    }
    public static void PrintInsertion(int arr[]){
        for(int i = 0; i <arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();
    }
    public static void main(String args[]){
        int arr[] = {8,2,1,6,4,5,3};
        Insertion_Sorting(arr);
        PrintInsertion(arr);
    }
}

// output:
// 1 2 3 4 5 6 8 