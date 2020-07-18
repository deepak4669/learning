import java.util.*;
import java.io.*;

public class Main1015D
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    long k=sc.nextLong();
    long s=sc.nextLong();
    if((n-1)*k<s)
      out.println("NO");
    else
    {
      long x=(s/(n-1));
      long pos=1;
      k-=x;
      int y=(int)(s%(n-1));
      if(k>y)
        out.println("NO");
      else
      {
        out.println("YES");
        for(int i=0;i<x;i++)
        {
          if(pos==1)
          {
            pos=n;
            out.print(pos+" ");
          }
          else
          {
            pos=1;
            out.print(pos+" ");
          }
        }
        if(pos==1)
        {
          for(int i=1;i<=k-1;i++)
          {
            out.print((++pos)+" ");
          }
          //y-=(k-1);
          out.print((1+y));
        }
        else 
        {
          for(int i=1;i<=k-1;i++)
          {
            out.print((pos-i)+" ");
          }
          out.print(n-y);
        }
      }
      
    }
        
    out.flush();    
          
        
        
        
        
     
    }
  static class Scanner
  {
    BufferedReader br;
    StringTokenizer tk=new StringTokenizer("");
    public Scanner(InputStream is) 
        {
      br=new BufferedReader(new InputStreamReader(is));
    }
        public int nextInt() throws IOException
        {
          if(tk.hasMoreTokens())
                return Integer.parseInt(tk.nextToken());
          tk=new StringTokenizer(br.readLine());
          return nextInt();
        }
        public long nextLong() throws IOException
        {
            if(tk.hasMoreTokens())
              return Long.parseLong(tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return nextLong();
        }
        public String next() throws IOException
        {
          if(tk.hasMoreTokens())
            return (tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return next();
        }
        public String nextLine() throws IOException
        {
          tk=new StringTokenizer("");
          return br.readLine();
        }
        public double nextDouble() throws IOException
        {
            if(tk.hasMoreTokens())
              return Double.parseDouble(tk.nextToken());
            tk=new StringTokenizer(br.readLine());
            return nextDouble();
        }
        public char nextChar() throws IOException
        {
            if(tk.hasMoreTokens())
              return (tk.nextToken().charAt(0));
            tk=new StringTokenizer(br.readLine());
            return nextChar();
        }
        public int[] nextIntArray(int n) throws IOException
        {
            int a[]=new int[n];
            for(int i=0;i<n;i++)
              a[i]=nextInt();
            return a;
        }
        public long[] nextLongArray(int n) throws IOException
        {
          long a[]=new long[n];
            for(int i=0;i<n;i++)
              a[i]=nextLong();
            return a;
        }
        public int[] nextIntArrayOneBased(int n) throws IOException
        {
          int a[]=new int[n+1];
            for(int i=1;i<=n;i++)
              a[i]=nextInt();
            return a;
        }
        public long[] nextLongArrayOneBased(int n) throws IOException
        {
          long a[]=new long[n+1];
          for(int i=1;i<=n;i++)
                a[i]=nextLong();
          return a;
        }
  }
}

