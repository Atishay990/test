import java.io.*;
import java.lang.Math;
import java.math.BigInteger;
class test4
{
    static BigInteger r=new BigInteger("1");
   public static void main(String args[])throws IOException
   {
       InputStreamReader read=new InputStreamReader(System.in);
       BufferedReader in=new BufferedReader(read);
       System.out.println("program started");
       test4.pow(2,1000);
       System.out.println(r);
    }

    static void pow(long n,long p)
   {
 
      if(p<=0)
      {
        return;
      }
       else if(n==0 && p>=1)
       {  
         r=new BigInteger("0");
         return;
       }
       else
        r=r.multiply(BigInteger.valueOf(n));
 
      test4.pow(n,p-1);
   }
}