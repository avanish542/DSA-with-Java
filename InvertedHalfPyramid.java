import java.util.*;
public class InvertedHalfPyramid {
    public static void Print_InvertedHalfPyramid(int n ){
        for(int i = n; i>=1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        Print_InvertedHalfPyramid(n);
    }
}