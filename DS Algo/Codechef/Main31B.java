import java.util.*;
import java.io.*;

public class Main31B
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    String s=sc.next();
    boolean flag=false;
    int k=0;
    int[] a=new int[s.length()];
    for(int i=0;i<s.length();i++)
    {
      if(s.charAt(i)=='@')
      {
        a[k++]=i;
      }
    }
    for(int i=0;i<(k-1);i++)
    {
      if(a[i+1]-a[i]-1>=2)
        continue;
      else
      {
        //out.println("D");
        flag=true;
        break;
      }
    }
    if(a[0]<1||a[k-1]>=s.length()-1)
      flag=true;
    if(!flag)
    {
      String[] sol=new String[k];
      int x=0;
      for(int i=0;i<k;i++)
      {
        if(i==k-1)
          sol[i]=s.substring(x,s.length());
        else
          sol[i]=s.substring(x,a[i]+2);
        x=a[i]+2;
      }
      for(int i=0;i<k;i++)
      {
        if(i==k-1)
          out.print(sol[i]);
        else
          out.print(sol[i]+",");
      }
    }
    else
      out.println("No solution");
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

