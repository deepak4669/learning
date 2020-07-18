import java.util.*;
import java.io.*;

public class Main14B
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int xo=sc.nextInt();
    int[] a=new int[n];
    int[] b=new int[n];
    int[] marked=new int[1001];
    int ans=-1;
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
      b[i]=sc.nextInt();
      for(int j=Math.min(a[i],b[i]);j<=Math.max(b[i],a[i]);j++)
        marked[j]++;
    }
    int lo=-1;
    int ro=-1;
    for(int i=0;i<=1000;i++)
    {
      if(marked[i]==n)
      {
        lo=i;
        int j;
        for(j=lo;j<=1000;j++)
        {
          if(marked[j]!=n)
            break;
        }
        ro=j-1;
        break;
      }
    }
    if(lo!=-1&&ro!=-1)
    {
      if(lo>=xo)
        ans=lo-xo;
      else if(xo>=lo&&xo>=ro)
        ans=xo-ro;
      else
        ans=0;
      out.println(ans);
    }
    else
      out.println(ans);
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

