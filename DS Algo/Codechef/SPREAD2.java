import java.util.*;
import java.io.*;

class SPREAD2
{
  static PrintWriter out=new PrintWriter(System.out);
  static long BIT[];
  static long a[];
  static int n;
  
  static void update(int a, int b,long v)
  {
    update(a,v);
    update(b+1,-v);
  }
  static void update(int a, long v)
  {
    for(;a<=n;a+=(a&-a))
      BIT[a]+=v;
  }
  static long query(int b)
  {
    long sum=0;
    for(int i=b;i>0;i-=(i&-i))
      sum+=BIT[i];
    return sum+a[b-1];
  }
  
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    BIT=new long[n+1];
    a=new long[n];
    
    
    int m=sc.nextInt();
    int c=sc.nextInt();
    Arrays.fill(a,c);
    for(int i=0;i<m;i++)
    {
      String s=sc.next();
      if(s.equals("S"))
      {
        int u=sc.nextInt();
        int v=sc.nextInt();
        int k=sc.nextInt();
        update(u,v,k);
      }else
      {
        int p=sc.nextInt();
        out.println(query(p));
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

