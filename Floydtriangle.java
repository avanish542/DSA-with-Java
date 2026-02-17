// import java.util.*;
// public class Floydtriangle {
//     public static void PrintFloyd_triangle(int n){
//         int counter = 1;
//         for(int i = 1; i<=n; i++){
//             for( int j = 1; j<=i; j++){
//                 System.out.print(counter + " ");
//                 counter++;
//             }
//             System.out.println();
//         }
//     }
//      public static void main(String args[]) {
//         PrintFloyd_triangle(7);
//     }

// }



// Floyd Triangle with user input
import java.util.*;
public class Floydtriangle {
    public static void Floyd_triangle(int n) {
        int counter = 1;
        for(int i = 1; i <= n; i++){
            for (int j = 1; j<=i; j++){
                System.out.print(counter + " ");
                counter++;
            }
            System.out.println();           
        }       
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Floyd_triangle(n);
    }
}