
import java.util.*;
import java.lang.*;
import java.io.*;
import java.util.Scanner;
import java.lang.Math;
/* Name of the class has to be "Main" only if the class is public. */
class test2
{
	public static void main (String[] args) throws java.lang.Exception
	{
	    
	    try{
	        System.out.println("enter test");
	    Scanner sc=new Scanner(System.in);
	    int i,j,k;
	    int f;
	    int test=sc.nextInt();
	    int [] result=new int[test];
	    for(i=0;i<test;i++)
	    {
	        int n=sc.nextInt();
	        n=n-1;
	        if(n%2==0)
	        {
	            f=fib(n-1);
	        }
	        else
	        {
	            f=fib(n);
	         }
	        if(f>=10)
	         f=f%10;
	         
	        result[i]=f;
	        
	    }
	    for(i=0;i<test;i++)
	    {
	        System.out.println(result[i]);
	    }
	    }
	    catch(Exception e)
	    {
	        return;
	    }
	    }
		
	static int fib(int no)
	{
	    if(no<=1)
	     return no;
	    else
	     return fib(no-1)+fib(no-2);
	}
}
