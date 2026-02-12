// import java.util.*;
// public class Function {
//     public static int Calculatesum(int a, int b) {
//         int sum = a+b;
//        return sum;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int sum = Calculatesum(a, b);
//         System.out.println("The sum of the two numbers is :" + sum);
//     }
// }

// Product of two numbers using function
// import java.util.*;
// public class Function {
//     public static int CalProduct(int a, int b) {
//         int Product = a*b;
//         return Product;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         int Product = CalProduct(a, b);
//         System.out.println("The Product of two numbers is :" + Product);
//     }
// }

// Product of two numbers using function without return type
// import java.util.*;
// public class Function {
//     public static int CalProduct(int a, int b) {
//         int Product = a*b;
//         System.out.println("The Product of two numbers is :" + Product);
//         return Product;
//     }
//     public static void main(String args[]) {
//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         int b = sc.nextInt();
//         CalProduct(a, b);
       
//     }
// }


// Factorial of a number Using Function
import java.util.*;
public class Function {
    public static int CalFactorial(int n) {
        int fac = 1;
        for(int i= 1; i<= n; i++) {
            fac = fac*i;
        }
        return fac;
    }
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int fac = CalFactorial(n);
        System.out.println("The factorial of n number is:" + fac);
    }
}



