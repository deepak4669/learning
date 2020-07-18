import java.util.*;
import java.io.*;

public class Main56B
{
  static PrintWriter out=new PrintWriter(System.out);
  static int[] a;
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    a=new int[n+1];
    
    for(int i=1;i<=n;i++)
    {
      a[i]=sc.nextInt();
    }
   // boolean flag=true;
    int lo=-1;
    int ro=-1;
    for(int i=1;i<=n;i++)
    {
      if(a[i]!=i)
      {
        lo=i;
        break;
      }
    }
    for(int i=n;i>=0;i--)
    {
      if(a[i]!=i)
      {
        ro=i;
        break;
        
      }
    }
    if(lo==-1&&ro==-1)
      out.println("0 0");
    else
    {
      int i=lo;
      int j=ro;
      boolean flag=true;
      while(i<=j)
      {
        if(a[i]==j&&a[j]==i)
        {
          i++;
          j--;
        }
        else
        {
          flag=false;
          break;
        }
      }
      if(!flag)
        out.println(0+" "+0);
      else
        out.println(lo+" "+ro);
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

