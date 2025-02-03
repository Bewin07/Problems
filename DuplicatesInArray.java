import java.util.Scanner;

public class DuplicatesInArray {

    static void duplicate(String str) {
        char[] str1 = str.toCharArray();
        int count = 0;
        for (int i = 0; i < str1.length; i++) {
            for (int j = i+1; j < str1.length; i++) {
                if (str1[i] == str1[j]) {
                    count++;
                }
            }
        }
        if (count > 0) {
            System.out.println("duplicates found");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        duplicate(str);
        
    }
}
