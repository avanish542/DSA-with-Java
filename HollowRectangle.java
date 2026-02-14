// Hollow rectangle 
// public class HollowRectangle {
//     public static void main(String args[]){
//         int a = 4;
//         int b= 5;
//         for(int i = 1; i <= a; i++){
//             for(int j= 1; j <= b; j++){
//                 if(i == 1 || j == 1|| i == a|| j == b){
//                     System.out.print("*");
//                 } else {
//                     System.out.print(" ");
//                 }               
//             }
//              System.out.println();
//         }
//     }
// }

// Hollow Rectangle with user input
// import java.util.*;
// public class HollowRectangle {
//     public static void main(String args[]){
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         for( int i = 1; i <= a; i++){
//             for(int j = 1; j <= b; j++){
//                 if(i == 1|| j == 1|| i == a|| j == b){
//                     System.out.print("*");
//                 }else{
//                    System.out.print(" ");
//                 }               
//             }
//             System.out.println();            
//         }
//     }
// }

// Hollow Rectangle using Function 
import java.util.*;
public class HollowRectangle {
    public static void Print_HollowRectangle(int a, int b) {
        for(int i = 1; i <= a; i++){
            for(int j = 1; j <= b; j++){
                if(i == 1||j == 1|| i == a|| j == b ){
                    System.out.print("*");
                }else {
                   System.out.print(" ");
                }               
            }
            System.out.println();
        }
    }
     public static void main(String args[]) {
            Scanner sc = new Scanner(System.in);
            int a = sc.nextInt();
            int b = sc.nextInt();
            Print_HollowRectangle(a, b);
        }
}