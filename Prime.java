public class Prime {
    public static void main(String[] args) {
        int n = 2;
        int count=0;
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                count++;
            }

        }
        if (count > 0) {
            System.out.println("its not a prime no.");
        }
        else
        {
            System.out.println("its a prime");
        }
    }

    
}