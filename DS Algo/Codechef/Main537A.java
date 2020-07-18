import java.util.*;
import java.io.*;

class Main537A
{
  static PrintWriter out=new PrintWriter(System.out);
  public static long GCD(long a,long b)
  {
    if(b==0) return a;
    else
      return GCD(b,a%b);
  }
  public static long LCM(long a, long b)
  {
    return (a/GCD(a,b))*b;
  }
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    long n=sc.nextLong();
    long[] a=new long[(int)n];
    long prev=sc.nextLong();
    long curr=0;
    long lcm=0;
    a[0]=prev;
    //long mult=prev;
    for(int i=1;i<n;i++)
    {
      curr=sc.nextLong();
      a[i]=curr;
      lcm=LCM(curr,prev);
      prev=lcm;
      //mult*=curr;
    }
    //out.println(gcd);
    //mult/=gcd;
    //out.println(mult);
    boolean flag=false;
    for(int i=0;i<n;i++)
    {
      long j=lcm/a[i];
      while(j%2==0)
      {
        j/=2;
      }
      while(j%3==0)
      {
        j/=3;
      }
      if(j>1)
      {
        flag=true;
        break;
      }
    }
    if(flag)
      out.println("NO");
    else
      out.println("YES");
      
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

