import java.util.*;
import java.io.*;

class Main233B
{
  static PrintWriter out=new PrintWriter(System.out);
  static long n;
  
  static long sum(long n)
  {
    long sum=0;
    while(n>0)
    {
      sum+=n%10;
      n/=10;
    }
    return sum;
  }
  static long f(long val,int i)
  {
    
    long value=(val*val)+(val*i)-n;
    return value;
  }
        
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    n=sc.nextLong();
    int i;
    long mid=0;
    boolean flag=false;
    for(i=0;i<=90;i++)
    {
      long hi=1000000000;
      long lo=1;
      boolean k=false;
      while(hi>=lo)
      {
        mid=(lo+hi)/2;
        if(f(mid,i)>0)
          hi=mid-1;
        else if(f(mid,i)<0)
          lo=mid+1;
        else if(f(mid,i)==0) {
          k=true;
          break;
        }
      }
      if(sum(mid)==i&&k)
      {
        //out.println(mid+" "+i+" "+f(mid,i));
        flag=true;
        break;
      }
    }
    if(flag) out.println(mid);
    else out.println(-1);
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

