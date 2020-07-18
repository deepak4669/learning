import java.util.*;
import java.io.*;

public class Main1099C
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    int k=sc.nextInt();
    int sn=0;
    int c=0;
    for(int i=0;i<s.length();i++)
    {
      if(s.charAt(i)=='?')
        c++;
      else if(s.charAt(i)=='*')
        sn++;
    }
    if(k==(s.length()-c-sn))
    {
      for(int i=0;i<s.length();i++)
      {
        if(s.charAt(i)=='?'||s.charAt(i)=='*')
          continue;
        else
          out.print(s.charAt(i));
      }
    }
    else if(k<s.length()-2*c-2*sn)
    {
      out.println("Impossible");
    }
    else if(k>s.length()-c-sn)
    {
      if(sn==0)
        out.println("Impossible");
      else
      {
        int x=s.indexOf("*");
        int y=k-(s.length()-c-sn);
        for(int i=0;i<s.length();i++)
        {
          if(i==x-1)
          {
            for(int j=1;j<=y+1;j++)
              out.print(s.charAt(i));
          }
          else if(s.charAt(i)=='?'||s.charAt(i)=='*')
            continue;
          else
            out.print(s.charAt(i));
        }
      }
    }
    else
    {
      int y=s.length()-c-sn-k;
      for(int i=0;i<s.length()-1;i++)
      {
        if(y>0)
        {
          if(s.charAt(i+1)=='?'||s.charAt(i+1)=='*')
          {
            y--;
            continue;
          }
          else if(s.charAt(i)=='?'||s.charAt(i)=='*')
            continue;
          else
            out.print(s.charAt(i));
        }
        else
        {
          if(s.charAt(i)=='?'||s.charAt(i)=='*')
            continue;
          else
            out.print(s.charAt(i));
        }
      }
      if(s.charAt(s.length()-1)!='*'&&s.charAt(s.length()-1)!='?')
        out.print(s.charAt(s.length()-1));
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

