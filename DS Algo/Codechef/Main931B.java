import java.util.*;
import java.io.*;

public class Main931B
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int a=sc.nextInt();
    int b=sc.nextInt();
    int[] ar=new int[n+1];
    int min=Math.min(a,b);
    int max=Math.max(a,b);
      
    for(int i=1;i<=n;i++)
      ar[i]=i;
    int round=1;
    int c=n;
    boolean flag=false;
    while(c>=2)
    {
      for(int i=1;i<=n;i+=2)
      {
        if(ar[i]<=n&&ar[i+1]<=n)
        {
          if(ar[i]==min&&ar[i+1]==max)
          {
            flag=true;
            break;
          }
          if(ar[i]!=min&&ar[i+1]!=max)
            ar[i]=1000;
          else
          {
            if(ar[i]==a||ar[i]==b)
              ar[i+1]=1000;
            else
              ar[i]=1000;
          }
        }
      }
      c/=2;
      if(flag)
        break;
      Arrays.sort(ar);
      round++;
    }
    if(round==n/2)
      out.println("Final!");
    else
      out.println(round);
    out.flush();
    //out.println(round);
    
      
      
        
        
    
    
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

