import java.util.*;
public class PrintSubarray{
    public static void Print_subarray(int numbers[]){
        int ts = 0;
        for(int i = 0; i <numbers.length; i++){
            int start = i;
            for(int j = i; j<numbers.length; j++){
                int end = j;
                for(int k = start; k <= end; k++){
                    System.out.print(numbers[k]+ " ");
                }
                ts++;
                System.out.println();
            }
           System.out.println(); 
        }
        System.out.println("total Subarray="+ts);
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,12,14,16,18};
        Print_subarray(numbers);
    }
}

// Output
// 2 
// 2 4
// 2 4 6
// 2 4 6 8
// 2 4 6 8 10
// 2 4 6 8 10 12
// 2 4 6 8 10 12 14
// 2 4 6 8 10 12 14 16
// 2 4 6 8 10 12 14 16 18

// 4
// 4 6
// 4 6 8
// 4 6 8 10
// 4 6 8 10 12
// 4 6 8 10 12 14
// 4 6 8 10 12 14 16
// 4 6 8 10 12 14 16 18 

// 6
// 6 8
// 6 8 10
// 6 8 10 12
// 6 8 10 12 14
// 6 8 10 12 14 16
// 6 8 10 12 14 16 18

// 8
// 8 10
// 8 10 12
// 8 10 12 14
// 8 10 12 14 16
// 8 10 12 14 16 18

// 10
// 10 12
// 10 12 14
// 10 12 14 16
// 10 12 14 16 18

// 12 
// 12 14
// 12 14 16
// 12 14 16 18

// 14
// 14 16
// 14 16 18

// 16
// 16 18

// 18

// total Subarray=45