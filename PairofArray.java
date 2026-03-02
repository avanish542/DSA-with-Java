// print pairs in any Array by using Function

import java.util.*;
public class PairofArray {
    // Pairs in the Array
    public static void Printpair(int numbers[]){
        for(int i = 0; i<numbers.length; i++){
            int curr = numbers[i];   
            for(int j = i+1; j<numbers.length; j++){
                System.out.print("(" + curr + ","+numbers[j]+ ")");
            }
            System.out.println();
        }
        
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,10,12,14,16};
        Printpair(numbers);
    }
}


// Output:
// (2,4)(2,6)(2,8)(2,10)(2,12)(2,14)(2,16)
// (4,6)(4,8)(4,10)(4,12)(4,14)(4,16)
// (6,8)(6,10)(6,12)(6,14)(6,16)
// (8,10)(8,12)(8,14)(8,16)
// (10,12)(10,14)(10,16)
// (12,14)(12,16)
// (14,16)