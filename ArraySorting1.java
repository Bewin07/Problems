import java.util.Scanner;
import java.util.Random;

class ArraySorting1 {
    static void beforeSorting(int[] arr) {
        System.out.println("before sorting");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
    static void afterSorting(int[] arr) {
        //Bubble Sorting Method
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j - 1] > arr[j]) {
                    int temp = arr[j - 1];//swapping
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("After sorting");
        for (int i = 0; i < 5; i++) {
            System.out.print(arr[i] + " ");
        }

    }
    public static void main(String[] args) {
        System.out.println("Arrays");
        int[] arr = new int[5];
        Random rand = new Random();
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            arr[i] = rand.nextInt(5) + 1;
            // arr[i] = sc.nextInt();
        }
        // Arrays obj = new Arrays();
        beforeSorting(arr);
        afterSorting(arr);

        }
    }

