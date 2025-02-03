public class ZOHOPattern1 {
    public static void main(String[] args) {
        int n = 1;
        for (int i = 1; i <= 5; i++) {
            int inc = 4;
            System.out.println(i);
            for (int j = 1; j <= i; j++) {
                // if (j > 1) {
                //     n += inc;
                //     inc--;
                //     if (inc == 0) {
                //         break;
                //     }
                // }
                System.out.println();
            }
        }
    }
}
