public class Substrings {
    public static String Substring(String str, int si, int ei){
        String substr = "";
        for(int i = si; i<ei; i++){
            substr += str.charAt(i);
        }
        return substr;
    }
    public static void main(String args[]){
        String str = "HELLOWORLD";
        System.out.println(Substring(str,0,5));
    }
}

Output:
HELLO