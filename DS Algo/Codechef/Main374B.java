import java.util.*;
import java.io.*;


public class Main374B
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int l=-1;
    int r=-1;
    long ans=1;
    for(int i=0;i<s.length()-1;i++)
    {
      int x=Integer.parseInt(s.substring(i,i+1));
      int t=Integer.parseInt(s.substring(i+1,i+2));
      if(x+t==9)
      {
        if(l!=-1&&r!=-1)
        {
          r++;
        }
        else
        {
          l=i;
          r=i+1;
        }
      }
      else
      {
        if(l!=-1&&r!=-1)
        {
          int y=r-l+1;
          if(y%2==0)
          {
           ans*=1;
          }
          else
          {
            ans*=(y/2+1);
          }
          l=-1;
          r=-1;
        }
        else
        {
          continue;
        }
      }
    }
    
    if(l!=-1&&r!=-1)
    {
      int y=r-l+1;
      if(y%2==0)
      {
        ans*=1;
      }
      else
      {
        ans*=(y/2+1);
      }
    }
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

