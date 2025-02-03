import java.io.*;
import java.util.*;

public class Factorial {
    public static int fact(int n)
    {
        if(n==0)
        return 0;
        else
        return n+sum(n+1);
    }
public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    System.out.println(fact(n));
}
}
