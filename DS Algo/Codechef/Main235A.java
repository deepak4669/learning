import java.util.*;
import java.io.*;

class Main235A
{
  static PrintWriter out=new PrintWriter(System.out);
  static long lcm(long i,long j,long k)
  {
    long res=(i/gcd(i,j))*j;
    res=(res/gcd(res,k))*k;
    return res;
  }
  static long gcd(long a,long b)
  {
    if(b==0) return a;
    else return gcd(b,a%b);
  }
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n==1)
      out.println(1);
    else if(n==2)
      out.println(2);
    else if(n==4)
      out.println(12);
    else
    {
      if(n%2!=0)
        out.println((long)n*(n-1)*(n-2));
      else
      {
        long ans=0;
        for(long i=n-50;i<=n;i++)
        {
          for(long j=n-50;j<=n;j++)
          {
            for(long k=n-50;k<=n;k++)
            {
              if(i==0||j==0||k==0||i<0||j<0||k<0) continue;
              long val=lcm(i,j,k);
              if(val>ans)
              {
                //out.println(i+" "+j+" "+k);
                            
                ans=val;
              }
            }
          }
        }
        out.println(ans);
        
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

