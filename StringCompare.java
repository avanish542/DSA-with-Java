import java.util.*;
public class StringCompare{
    public static void main(String args[]){
        String s1 = "Tony";
        String s2 = "Tony";
        String s3 = new String("Tony");
        if(s1 == s2){
            System.out.println("Strings  s1 and s2 are equal");
        }else{
            System.out.println("Strings are not equal");
        }
        //  Not use this to compare s1 and s3
        // if(s1 == s3){
        //     System.out.println("Strings  s1 and s2 are equal");
        // }else{
        //     System.out.println("Strings are not equal");
        // }
        // Use this to compare s1 and s3
        if(s1.equals(s3)){
            System.out.println("String s1 and S3 are equals");
        }
    }
}

// Output:
// Strings  s1 and s2 are equal
// String s1 and S3 are equals