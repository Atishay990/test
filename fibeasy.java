import java.io.*;
import java.util.Scanner;
import java.lang.Math;
import java.math.BigInteger;
class fibeasy
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in=new BufferedReader(read);
        Scanner sc=new Scanner(System.in);
        int i;
        BigInteger n=new BigInteger("0");
        double b;
        System.out.println("enter");
        int test=Integer.parseInt(in.readLine());
        //int [] result=new int[test];
        int cv=0;
        BigInteger [] result=new BigInteger[test];
        BigInteger p,r;
        for(i=0;i<test;i++)
        {
             n=sc.nextBigInteger();
             BigInteger ten=new BigInteger("10");
             //int n1=n-1;
             //System.out.println("Fibo is "+fib(n));
             
             BigInteger no;
             no=BigInteger.valueOf(10);
             if(no==n)
             {
                r=new BigInteger(fib(no));
                 cv=r.compareTo(ten);
                if(cv>=0)
                {
                    result[i]=r.remainder(ten);
                }
                else
                {
                    result[i]=r;
                }
             }
             else
             {
                 p= BigInteger.valueOf(Math.pow(2,no));
                 p=BigInteger.valueOf(fib(p-1));
                  cv=p.compareTo(ten);
                 if(cv>=0)
                 {
                     result[i]=p.remainder(ten);
                 }
                 else
                 {
                     result[i]=p;
                 }
             }
        }
        for(i=0;i<test;i++)
        {
            
            
            
            
                System.out.println(result[i]);
            
        }
    }
    static BigInteger fib(BigInteger n)
    {
        if(n<=1)
        return n;
        else
        return fib(n-1)+fib(n-2);
    }
    static BigInteger powerOf2 (BigInteger n)
    {
        if((int)(Math.ceil((Math.log(n) / Math.log(2)))) ==  
                       (int)(Math.floor(((Math.log(n) / Math.log(2))))))
        {
            return n;
        }
        else
        {
            return  (int)(Math.floor((Math.log(n)/Math.log(2))));
        }
    }
}