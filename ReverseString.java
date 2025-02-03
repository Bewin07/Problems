import java.util.*;

public class ReverseString {
    
    public static String reverse(String str) {
        char[] arr = str.toCharArray();
        String str1 = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            str1 += arr[i];
        }
        return str1;    
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(str);
        String str1=reverse(str);
        System.out.println(str1);

        
    }
}
