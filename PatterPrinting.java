// Solid Rectangle
// import java.util.*;
// public class PatterPrinting {
//     public static void main(String args[]) {
//         int a = 4;
//         int b = 5;
//         for(int i=1; i<=a; i++){
//             for(int j=1; j<=b; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }
//     }
// }

// Solid Rectangle with user input
// import java.util.*;
// public class PatterPrinting{
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         for(int i = 1; i <= a; i++){
//             for(int j = 1; j<=b; j++){
//                 System.out.print("*");
//             }
//             System.out.println();
//         }

//     } 
// }

//  Solid Rectangle by using function
import java.util.*;
public class PatterPrinting {
    public static void Print_Solid(int a, int b){
        for(int i = 1; i<= a; i++){
            for(int j = 1; j<= b; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        Print_Solid(a,b);            
    }
    
}