import java.util.*;
import java.io.*;

class ARRGRAPH
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      int[] a=new int[n];
      
      for(int i=0;i<n;i++)
      {
        a[i]=sc.nextInt();
        
      }
      int cnt=0;
      for(int i=0;i<n;i++)
      {
        for(int j=i+1;j<n;j++)
        {
          if(gcd(a[i],a[j])==1)
            cnt++;
          if(cnt>=n-1) break;
        }
      }
      if(cnt>=(n-1))
      {
        out.println(0);
        for(int i=0;i<n;i++)
        {
          if(i==n-1)
            out.println(a[i]);
          else
            out.print(a[i]+" ");
        }
      }
      else
      {
        out.println(1);
        int count=0;
        int p=0;
        for(int i=0;i<n;i++)
        {
          if(a[i]==47)
            count++;
          else
            p=i;
        }
        
        if(count==n)
        {
          a[0]=43;
          for(int i=0;i<n;i++)
            
          {
            if(i==n-1)
              out.println(a[i]);
            else
              out.print(a[i]+" ");
          }
        }
        else
        {
          a[p]=47;
          for(int i=0;i<n;i++)
          {
            if(i==n-1)
              out.println(a[i]);
            else
              out.print(a[i]+" ");
          }
        }
          
          
        
      }
      //out.println();
          
      
    }
    out.flush();
          
        
        
    
  }
  public static int gcd(int a, int b)
  {
    if(b==0) return a;
    else
      return gcd(b,a%b);
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

