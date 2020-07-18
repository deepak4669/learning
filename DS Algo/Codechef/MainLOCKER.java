import java.util.*;
import java.io.*;

public class MainLOCKER
{
  static PrintWriter out=new PrintWriter(System.out);
  static long f=1000000007;
  static long binPow(long n,long k,long m)
  {
    if(k==0)
    {
      if(m==1) return 0;
      else return 1;
    }
    long res=1;
    while(k>0)
    {
      if(k%2!=0)
      {
        res=(res*n)%m;
      }
      n=(n*n)%m;
      k/=2;
    }
    return res;
  }
      
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      long n=sc.nextLong();
      long ans=1;
      if(n==1)
        ans=1;
      else if(n==2)
        ans=2;
      else if(n==3)
        ans=3;
      else if(n==4)
        ans=4;
      else if(n%3==0)
      {
        ans=binPow(3,n/3,f);
      }
      else if(n%3==1)
      {
        ans=(binPow(3,n/3-1,f)*4)%f;
      }
      else
      {
        ans=(binPow(3,n/3,f)*2)%f;
      }
      
        
      out.println(ans);
      out.flush();
    }
    
        
    
    
    
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

