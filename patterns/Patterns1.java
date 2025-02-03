package patterns;
public class Patterns1 {
    public static void main(String[] args) {
        int dec = 5;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                if (j == i || i == 3 && j == 3) {
                    System.out.print(i);
                    
                }
                else if (j==dec) {
                    System.out.print(dec);
                    dec--;
                    
                } else {
                    
                }{
                    System.out.print("  ");
                }

            }
            System.out.println();
            
        }
    }

}
