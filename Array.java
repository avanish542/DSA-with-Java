import java.util.*;
public class Array {
    public static void main(String args[]) {
        int marks[] = new int[100];
        Scanner sc = new Scanner(System.in);
        // int physics;
        // physics = sc.nextInt();

        marks[0] = sc.nextInt();
        marks[1] = sc.nextInt();
        marks[2] = sc.nextInt();
        System.out.println("phy:" + marks[0]);
        System.out.println("chem:" + marks[1]);
        System.out.println("math:" + marks[2]);
        System.out.println("Lenght of an Array:" + marks.length);

        marks[2] = 100;
    }
}

// Passing an Array as Arguments ... Call by Reference
// import java.util.*;
// public class Array {
//     public static void Update(int marks[]) {
//         for(int i = 0; i<marks.length; i++) {
//             marks[i] = marks[i] + 1;
//         }
//     }
//     public static void main(String args[]) {
//         int marks[] = {97, 98, 99};
//         Update(marks);

//         // print our marks
//         for(int i = 0; i<marks.length; i++) {
//             System.out.print(marks[i]+ " ");
//         }
//         System.out.println();
//     }
// }