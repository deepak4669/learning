import java.util.*;
import java.io.*;

public class Main100663J
{
  static PrintWriter out=new PrintWriter(System.out);
  static int gcd(int a,int b)
  {
    if(a==0)
      return b;
    else
      return gcd(b%a,a);
  }
  static int[] gcdex(int a,int b)
  {
    int[] res=new int[3];
    if(b==0)
    {
      res[0]=1;
      res[1]=0;
      res[2]=a;
      return res;
    }
    int[] prev=gcdex(b,a%b);
    res[2]=prev[2];
    res[0]=prev[1];
    res[1]=prev[0]-(a/b)*prev[1];
    return res;
  }
    
      
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    while(true)
    {
      int n=sc.nextInt();
      int m=sc.nextInt();
      int a=sc.nextInt();
      int k=sc.nextInt();
      if(n==0&&m==0&&k==0&&a==0)
        break;
      int g=gcd(a,-m);
      int c=n-(k+a);
      if(c%g==0)
      {
        int[] sol=gcdex(a,-m);
        //out.println(sol[0]+" "+sol[1]+" "+sol[2]);
        //out.println(c/g);
        if(sol[0]>=0&&sol[1]>=0)
        {
          int ans=n+sol[1]*m;
          out.println(ans);
        }
        else
          out.println("Impossible");
      
      }
      else
      {
        out.println("Impossible");
      }
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

