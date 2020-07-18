import java.util.*;
import java.io.*;

class Main416A
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    long lower=-2*(1000000000);
    long upper=2*(1000000000);
    for(int i=0;i<n;i++)
    {
      String s=sc.next();      
      long a=sc.nextLong();
      String ans=sc.next();
      if(ans.equals("N"))
      {
        if(s.equals("<=")&&lower<=(a+1))
          lower=(a+1);
        else if(s.equals(">=")&&upper>=(a-1))
          upper=(a-1);
        else if(s.equals(">")&&upper>=a)
          upper=a;
        else if(s.equals("<")&&lower<=a)
          lower=a;
      }
      else //if(ans,equals("Y"))
      {
        if(s.equals("<=")&&upper>=a)
          upper=a;
        else if(s.equals(">=")&&lower<=a)
          lower=a;
        else if(s.equals("<")&&upper>=(a-1))
          upper=a-1;
        else if(s.equals(">")&&lower<=(a+1))
          lower=a+1;
      }
    }
    if(lower<=upper)
      out.println(lower);
    else
      out.println("Impossible");
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

