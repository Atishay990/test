import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
class codechef
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter test");
        int test=sc.nextInt();
        int i,j,k=0,n,t=0,p=0;
        for(i=0;i<test;i++)
        {
            n = sc.nextInt();
            ArrayList<Integer>arr=new ArrayList();
            for(j=0;j<n;j++)
            {
                if(fib(j)>=10)
                  arr.add(fib(j)%10);
                else
                  arr.add(fib(j));
            }
            if(arr.size()==1)
            { 
               System.out.println(arr.get(0));
               break;
            }
        
            while(arr.size()!=1)
            {
              for(p=0;p<n;p++)
              {
                 if((p+1)%2==0)
                 {
                    t=arr.get(p);
                    arr.set(k,t);
                    k++;
                 }
              }
              for(j=k;j<n;j++)
              {
                  arr.remove(k);
              }
             
              n=k;
              k=0;
              if(arr.size()==1)
              {
                  System.out.println(arr.get(0));
                  break;
              }
              
            }
        }
    }
    static int fib(int no)
    {
        if(no<=1)
        {
            return no;
        }
        return fib(no-1) + fib(no-2);
    }
}
            
        