import java.util.*;
import java.io.*;

class Main374A
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int f=100000000;
    int n=sc.nextInt();
    int m=sc.nextInt();
    int i=sc.nextInt();
    int j=sc.nextInt();
    int a=sc.nextInt();
    int b=sc.nextInt();
    boolean h=false;
    boolean v=false;
    if((i-1)>=a||(n-i)>=a)
      v=true;
    if(j-i>=b||(m-j)>=b)
      h=true;
    int ans=1000000007;
    int px=1,py=1;
    if(Math.abs(px-i)%a==0&&Math.abs(py-j)%b==0)
    {
      int x=Math.abs(px-i)/a;
      int y=Math.abs(py-j)/b;
      if(x==0&&y==0)
        ans=0;
      else if(Math.abs(x-y)%2==0&&h&&v)
        ans=Math.min(ans,Math.min(x,y));
    }
    px=1;
    py=m;
    if(Math.abs(px-i)%a==0&&Math.abs(py-j)==0)
    {
      int x=Math.abs(px-i)/a;
      int y=Math.abs(py-j)/b;
      if(x==0&&y==0)
        ans=0;
      else if(Math.abs(x-y)%2==0&&h&&v)
        ans=Math.min(ans,Math.min(x,y));
    }
    px=n;
    py=1;
    if(Math.abs(px-i)%a==0 && Math.abs(py-j)%b==0)
    {
      int x=Math.abs(px-i)/a;
      int y=Math.abs(py-j)/b;
      if(x==0 && y==0)
        ans=0;
      else if(Math.abs(x-y)%2==0 && h && v)
        ans=Math.min(ans,Math.max(x,y));
    }
    px=n;
    py=m;
    if(Math.abs(px-i)%a==0 && Math.abs(py-j)%b==0)
    {
      int x=Math.abs(px-i)/a;
      int y=Math.abs(py-j)/b;
      if(x==0 && y==0)
        ans=0;
      else if(Math.abs(x-y)%2==0 && h && v)
        ans=Math.min(ans,Math.max(x,y));
    }
    if(ans==1000000007)
      out.println("Poor Inna and pony!");
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

