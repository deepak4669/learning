import java.util.Scanner;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.io.*;

public class ARMY
{
  static class FastReader
    {
        BufferedReader br;
        StringTokenizer st;
 
        public FastReader()
        {
            br = new BufferedReader(new
                     InputStreamReader(System.in));
        }
 
        String next()
        {
            while (st == null || !st.hasMoreElements())
            {
                try
                {
                    st = new StringTokenizer(br.readLine());
                }
                catch (IOException  e)
                {
                    e.printStackTrace();
                }
            }
            return st.nextToken();
        }
 
        int nextInt()
        {
            return Integer.parseInt(next());
        }
 
        long nextLong()
        {
            return Long.parseLong(next());
        }
 
        double nextDouble()
        {
            return Double.parseDouble(next());
        }
 
        String nextLine()
        {
            String str = "";
            try
            {
                str = br.readLine();
            }
            catch (IOException e)
            {
                e.printStackTrace();
            }
            return str;
        }
    }
  public static void main(String[] args)throws IOException
  {
    try{
    Scanner s=new Scanner(System.in);
    FastReader sc=new FastReader();
    int t=sc.nextInt();
    String[] res=new String[t];
    //s.nextLine();
    for(int k=0;k<t;k++)
    {
      //s.nextLine();
      int ng=sc.nextInt();
      int nm=sc.nextInt();
      int[] ag=new int[ng];
      int[] am=new int[nm];
      for(int i=0;i<ng;i++)
        ag[i]=sc.nextInt();
      for(int i=0;i<nm;i++)
        am[i]=sc.nextInt();
      int a=biggest(ag);
      int b=biggest(am);
      if(a>b) res[k]="Godzilla";
      else if(a<b) res[k]="MechaGodzilla";
      else res[k]="Godzilla";
      
      
    }
    for(int i=0;i<t;i++)
      System.out.println(res[i]);
    }catch(Exception e){
      return;
    }
  }
  public static int biggest(int[] a)
  {
    int max=a[0];
    for(int i=0;i<a.length;i++)
    {
      if(max<a[i]) max=a[i];
    }
    return max;
  }
}
                     
     