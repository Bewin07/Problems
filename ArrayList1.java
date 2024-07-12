import java.util.*;

class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        ArrayList odd = new ArrayList<>();
        ArrayList even = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            arr.add(i);
        }
        for (int j = 1; j <= 10; j++) {

            if (j % 2 == 0) {
                odd.add(j);
            } else {
                even.add(j);
            }
        }

        System.out.println(arr);
        System.out.println(odd);
        System.out.println(even);

    }
}