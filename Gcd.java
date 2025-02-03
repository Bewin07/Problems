import java.io.*;
import java.util.*;
public class  Gcd {
    public static int gcd(int num1,int num2)
    {
        if(num2!=0)
        return gcd(num2,num1%num2);
        else 
        return num1;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the first number:");
        int a=sc.nextInt();
        System.out.println("enter the second number:");
        int b=sc.nextInt();
        int result = gcd(a, b);
        System.out.println("the resultant gcd is :"+result);


    }
}