import java.util.*;
public class Reversearray {
    public static void getReverseArray(int numbers[]){
       int start = 0;
       int end = numbers.length-1;
       while(start < end){
          int Temp = numbers[end];
          numbers[end] = numbers[start];
         numbers[start] = Temp;
          start++;
          end--;
        } 
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10, 14};
        getReverseArray(numbers);
        for(int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i] +" ");
        }
        System.out.println();
    }
}