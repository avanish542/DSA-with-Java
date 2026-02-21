// Find the Smallest  numbers
import java.util.*;
public class Smallestnumber {
    public static int getSmallest (int numbers[]){
        int smallest = Integer.MAX_VALUE;
        for(int i = 0; i < numbers.length; i++){
            if(smallest > numbers[i]){
                smallest = numbers[i];
            }
        }
        return smallest;
    }
    public static void main(String args[]){
        int numbers[] = {2, 4, 1, 6, 7};
        System.out.println("The smallest number is :" +getSmallest(numbers));
    }
}