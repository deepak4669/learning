import java.util.*;
import java.io.*;

class Main469B
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int p=sc.nextInt();
    int q=sc.nextInt();
    int l=sc.nextInt();
    int r=sc.nextInt();
    int[] marked=new int[1000001];
    for(int i=0;i<p;i++)
    {
      int x=sc.nextInt();
      int y=sc.nextInt();
      for(int j=x;j<=y;j++)
        marked[j]++;
    }
    int[] c=new int[q];
    int[] d=new int[q];
    for(int i=0;i<q;i++)
    {
      c[i]=sc.nextInt();
      d[i]=sc.nextInt();
    }
    int cnt=0;
    for(int i=l;i<=r;i++)
    {
      boolean flag=false;
      for(int j=0;j<q;j++)
      {
        for(int k=c[j]+i;k<=(d[j]+i);k++)
        {
          if(marked[k]>0)
          {
            flag=true;
            break;
          }
        }
        if(flag)
          break;
      }
      if(flag)
        cnt++;
    }
    out.println(cnt);
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

