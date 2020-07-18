import java.util.*;
import java.io.*;

class PRDRG
{
  static PrintWriter out=new PrintWriter(System.out);
  static long[] num=new long[26];
  static long[] den=new long[26];
  static long gcd(long a,long b)
  {
    if(b==0) return a;
    else return gcd(b,a%b);
  }
  static void ans()
  {
    num[1]=1;
    den[1]=2;
    num[2]=1;
    den[2]=4;
    for(int i=3;i<=25;i++)
    {
      if(i%2==0)
      {
        num[i]=(long)Math.pow(2,i)*num[i-1]-den[i-1];
        den[i]=(long)Math.pow(2,i)*den[i-1];
        long x=gcd(num[i],den[i]);
        num[i]=num[i]/x;
        den[i]=den[i]/x;
      }
      else
      {
        num[i]=(int)Math.pow(2,i)*(num[i-2])-den[i-2];
        den[i]=(int)Math.pow(2,i)*den[i-2];
        long x=gcd(num[i],den[i]);
        num[i]=num[i]/x;
        den[i]=den[i]/x;
      }
    }
  }
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    ans();
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      out.print(num[n]+" "+den[n]+" ");
        
      //out.print("1 "+(int)Math.pow(2,n)+" ");
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

