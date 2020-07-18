import java.util.*;
import java.io.*;

class CHQUEENS
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int t=sc.nextInt();
    while(t-->0)
    {
      int n=sc.nextInt();
      int m=sc.nextInt();
      int x=sc.nextInt();
      int y=sc.nextInt();
      long ans=0;
      for(int i=1;i<=n;i++)
      {
        for(int j=1;j<=m;j++)
        {
          if(i==x&&j==y)
            continue;
          boolean flag=false;
          ans+=(n*m)-(n+m-1)-(Math.min(i,j)+Math.min(n-i,m-j)-1)-(Math.min(i-1,m-j)+Math.min(j-1,n-i));
          if(i==x&&j!=y)
          {
            if(j>y)
            {
              ans+=(y-1);
              flag=true;
            }
            else
            {
              ans+=(m-y);
              flag=true;
            }
          }
          else if(j==y&&i!=x)
          {
            if(i>x)
            {
              ans+=(x-1);
              flag=true;
            }
            else
            {
              ans+=(n-x);
              flag=true;
            }
          }
          else if(Math.abs(i-x)==Math.abs(j-y))
          {
            if(x>i&&y>j)
            {
              ans+=Math.min(n-x,m-y);
              flag=true;
            }
            else if(x>i&&y<j)
            {
              ans+=Math.min(n-x,y-1);
              flag=true;
            }
            else if(x<i&&y<j)
            {
              ans+=Math.min(x-1,y-1);
              flag=true;
            }
            else if(x<i&&y>j)
            {
              ans+=Math.min(x-1,m-y);
              flag=true;
            }
          }
          if(!flag)
            ans-=1;
          
        }
      }
      out.println(ans);
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

