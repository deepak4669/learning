import java.util.*;
import java.io.*;

class Main370A
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int r1=sc.nextInt();
    int c1=sc.nextInt();
    int r2=sc.nextInt();
    int c2=sc.nextInt();
    int k=0;
    int r=0;
    int b=0;
    if(r1==r2||c1==c2)
      r=1;
    else
      r=2;
    if((r1+c1)%2==0)
    {
      if((r2+c2)%2==0)
      {
        if(Math.abs(r2-r1)==Math.abs(c1-c2))
          b=1;
        else
          b=2;
      }
    }
    else
    {
      if((r2+c2)%2!=0)
      {
        if(Math.abs(r2-r1)==Math.abs(c2-c1))
          b=1;
        else
          b=2;
      }
    }
    int x=Math.abs(r2-r1);
    int y=Math.abs(c2-c1);
    if(x>y)
    {
      if(r2>r1)
      {
         k=y+Math.abs(r2-(r1+y));
      }
      else
        k=y+Math.abs(r2-(r1-y));
    }
        
       
    else 
    {
      if(c2>c1)
        k=x+Math.abs(c2-(c1+x));
      else
        k=x+Math.abs(c2-(c1-x));
    }
    out.println(r+" "+b+" "+k);
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

