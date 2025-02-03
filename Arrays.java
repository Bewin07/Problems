import java.util.Scanner;
/*class array{
    public static void main(String[] args) {
        int student[]=new int[3];
        int count=student.length();
        int i=0;
        for (i=0;i<count;i++)
        {
            System.out.printn(student[i]);
        }

    }
}*/
class ArrayExample
{
    public static void main(String[] args)
    {
        // declares an array of integers
        
        Scanner sc=new Scanner(System.in);
        int[] anArray =new int[10];
        int i=0;
        while(i<10)
        {
            System.out.println(anArray[i]);
        }


        /*// allocates memory for 10 integers
        //anArray = new int[10];

        // initialize first element
        anArray[0] = 100;
        // initialize second element
        anArray[1] = 200;
        // and so forth
        anArray[2] = 300;
        anArray[3] = 400;
        anArray[4] = 500;
        anArray[5] = 600;
        anArray[6] = 700;
        anArray[7] = 800;
        anArray[8] = 900;
        anArray[9] = 1000;*/
        for (int i = 0; i < 10; i++) {
        
      System.out.println("Element at index 0: " + anArray[i]);
    }
        }
        /*System.out.println("Element at index 1: " + anArray[1]);
        System.out.println("Element at index 2: " + anArray[2]);
        System.out.println("Element at index 3: " + anArray[3]);
        System.out.println("Element at index 4: " + anArray[4]);
        System.out.println("Element at index 5: " + anArray[5]);
        System.out.println("Element at index 6: " + anArray[6]);
        System.out.println("Element at index 7: " + anArray[7]);
        System.out.println("Element at index 8: " + anArray[8]);
        System.out.println("Element at index 9: " + anArray[9]);*/
    
}