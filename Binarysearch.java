import java.util.*;
public class Binarysearch{
    public static int getbinary(int numbers[], int key){
        int start = 0;
         int end = numbers.length-1;
        while(start <= end){
            int mid = (start+end)/2;
            if(numbers[mid] == key){
                return mid;
            }
            if(numbers[mid] <= key){
                start = mid+1;
            }else{
                end = mid-1;
            }

        }
        return -1;
    }
    public static void main(String args[]){
        int numbers[] = {2,3,5,7,10,13,14,17};
        int key = 10;
        System.out.println("The key is at index:" + getbinary(numbers, key));
    }
}