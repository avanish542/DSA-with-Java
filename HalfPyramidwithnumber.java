// This is the first version of pattern
import java.util.*;
public class HalfPyramidwithnumber{
    public static void Pyramid_withNumber(int n){
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i+1; j++){
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }
    public static void main(String args[]){
        Pyramid_withNumber(5);
    }
}

  
// This is the second version of pattern
// import java.util.*;
// public class HalfPyramidwithnumber{
//     public static void Pyramid_withNumber(int n){
//         for(int i = 1; i<=n; i++){
//             for(int j = 1; j<=n-i; j++){
//                 System.out.print( " ");
//             }
//             for(int j = 1; j<=i; j++){
//                 System.out.print(j );
//             }
//             System.out.println();          
//         }
//     }
//     public static void main(String args[]){
//         Pyramid_withNumber(5);
//     }
// }