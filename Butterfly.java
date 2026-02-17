// Print the Butterfly Pattern

import java.util.*;
public class Butterfly {
    public static void Print_Butterfly(int n){
        // Star - i
        for (int i = 1; i <= n; i++){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            // Spaces- 2(n - i)
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            // Star- i
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
         // Star - i
        for (int i = n; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            // Spaces- 2(n - i)
            for (int j = 1; j <= 2*(n-i); j++) {
                System.out.print(" ");
            }
            // Star- i
            for (int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Print_Butterfly(5);
    }
}

// Output

// **      **
// ***    ***
// ****  ****
// **********
// **********
// ****  ****
// ***    ***
// **      **
// *        *