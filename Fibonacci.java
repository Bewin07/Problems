import java.io.*;
import java.util.*;

class Fibonacci {

    public static int fib(int n)
    {
        if(n==0)
        {
        return 0;
        }
        else if(n==1)
        {
            return 1;
        }
        else
        {
            return fib(n-1) +fib(n-2);
        }
    }
public static void main(String []args)
{
    int n;
    Scanner sc=new Scanner(System.in);
    System.out.println("enter a number:");
    n=sc.nextInt();
    int result= fib(n);
    System.out.println("result is:" +result);
}
}