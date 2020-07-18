import java.util.*;
import java.io.*;
//267630EY
public class Main1203C
{
  static PrintWriter out=new PrintWriter(System.out);
  public static long gcd(long a,long b)
  {
    if(b==0) return a;
    else return gcd(b,a%b);
  }
  
  
  public static void main(String[] args) throws IOException
  {
    
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    Long[] a=new Long[n];
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextLong();
    }
//    Arrays.sort(a);
    long c=0;
    if(n>1)
    {
      c=gcd(a[0],a[1]);
      for(int i=2;i<n;i++)
      {
        c=gcd(c,a[i]);
      }
    }
    else
      c=a[0];
    int count=0;
    for(int i=1;i<=(int)Math.sqrt(c);i++)
    {
      if(c%i==0)
      {
        if(i*i==c)
          count++;
        else
        {
          count+=2;
        }
      }
    }
    out.println(count);
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

