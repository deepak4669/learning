import java.util.*;
import java.io.*;

public class Main493B
{
  static PrintWriter out=new PrintWriter(System.out);
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] a=new int[n];
    long sec=0;
    long fir=0;
    Vector<Integer> second=new Vector<Integer>();
    Vector<Integer> first=new Vector<Integer>();
    for(int i=0;i<n;i++)
    {
      a[i]=sc.nextInt();
      if(a[i]<0)
      {
        second.add(-a[i]);
        sec+=(-a[i]);
      }
      else 
      {
        first.add(a[i]);
        fir+=a[i];
      }
    }
    if(fir>sec)
      out.println("first");
    else if(sec>fir)
      out.println("second");
    else if(sec==fir)
    {
      boolean flag=false;
      int w=-1;
      Integer[] b=first.toArray(new Integer[first.size()]);
      Integer[] c=second.toArray(new Integer[second.size()]);
      for(int i=0;i<Math.min(b.length,c.length);i++)
      {
        if(b[i]>c[i])
        {
          w=1;
          break;
        }
        else if(b[i]<c[i])
        {
          w=2;
          break;
        }
      }
      if(w==-1)
      {
        
          if(a[n-1]<0)
            out.println("second");
          else
            out.println("first");
        
      }
      else if(w==1)
        out.println("first");
      else
        out.println("second");
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
