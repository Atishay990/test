import java.io.*;
class str2
{
    public static void main(String args[])throws IOException
    {
        InputStreamReader read=new InputStreamReader(System.in);
        BufferedReader in = new BufferedReader(read);
        
        System.out.println("enter the value of n");
        int n=Integer.parseInt(in.readLine());
        
        System.out.println("enter n sings");
        String grid[]=new String[n];
        int i;
        for(i=0;i<n;i++)
        {
            grid[i]=in.readLine();
        }
        
         int j,k,p;
        char t;
    
        for(i=0;i<grid.length;i++)
        {
            char s[]=new char[grid[i].length()];

            for(p=0;p<grid[i].length();p++)
            {
                s[p]=grid[i].charAt(p);
            }

            for(j=0;j<s.length;j++)
            {
                for(k=0;k<s.length-1;k++)
                {
                    if(s[k]>s[k+1])
                    {
                        t=s[k];
                        s[k]=s[k+1];
                        s[k+1]=t;
                    }
                }
            }
        }
        
       for(i=0;i<n;i++)
       {
           System.out.println(grid[i]);
        }
    }
}