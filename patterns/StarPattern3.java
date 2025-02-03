package Patterns;
public class StarPattern3 {
    public static void main(String[] args) {
        int num = 1;
        for (int i = 4; i >=1; i--) {
            for (int j = 1; j <= i; j++) {
                if (num > 9) {
                    break;
                }
                else {
                    System.out.print(num + " ");
                    num++;
                }
            }
            System.out.println();
        }
    }
}
// output
// 1 2 3 4 
// 5 6 7
// 8 9