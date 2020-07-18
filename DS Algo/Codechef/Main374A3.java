import java.util.*;
import java.io.*;

class Main374A3
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    int x=sc.nextInt();
    int y=sc.nextInt();
    int a=sc.nextInt();
    int b=sc.nextInt();
    int f=1000000000;
    int val1=f,val2=f,val3=f,val4=f;
    int ans=0;
    boolean h=false;
    boolean v=false;
    if((x-a)>=1||(x+a)<=n) h=true;
    if((y-b)>=1||(y+b)<=m) v=true;
    boolean flag=false;
    if((x-1)%a==0&&(y-1)%b==0&&((x-1)/a+(y-1)/b)%2==0)
    {
      if(x==1&&y==1)
        val1=0;
      
      else if(h&v)
      {
        val1=Math.max((x-1)/a,(y-1)/b);
      }
    }
    if((n-x)%a==0&&(m-y)%b==0&&((n-x)/a+(m-y)/b)%2==0)
    {
      
      if(x==n&&y==m)
        val2=0;
      
      else if(h&v)
      {
        val2=Math.max((n-x)/a,(m-y)/b);
      }
    }
    if((n-x)%a==0&&(y-1)%b==0&&((n-x)/a+(y-1)/b)%2==0)
    {
      if(x==n&&y==1)
        val3=0;
      else if(h&v)
      {
        val3=Math.max((n-x)/a,(y-1)/b);
      }
    }
    if((x-1)%a==0&&(m-y)%b==0&&((x-1)/a+(m-y)/b)%2==0)
    {
      if(x==1&&m==y)
        val4=0;
      else if(h&v)
      {
        val4=Math.max((x-1)/a,(m-y)/b);
      }
    }
    ans=Math.min(val1,Math.min(val2,Math.min(val3,val4)));
    if(ans==f)
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

