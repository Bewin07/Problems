public class StarPattern1 {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            //printing spaces
            for (int k = 1; k <= i; k++) {
                System.out.print(" ");

            }
            //printing stars
            for (int j = 5; j >= i; j--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
    }
}
// output
//  * * * * * 
//   * * * *
//    * * *
//     * *
//      *
