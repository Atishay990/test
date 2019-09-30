import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;
class test
{
    public static void main(String args[])throws IOException
    {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList();
        System.out.println("enter n");
        int i,p,k=0,j=0,t=0;
        int n=sc.nextInt();
        for(i=0;i<n;i++)
        {
            arr.add(i);
        }
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
            
        System.out.println(arr);
    }
}
        