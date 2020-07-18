import java.util.*;
import java.io.*;
//267630EY
public class Main1203A
{
  static PrintWriter out=new PrintWriter(System.out);
  
  static int next(int i,int n)
  {
    if(i==n) return 1;
    else return i+1;
  }
  
  static boolean clockwise(int[] a)
  {
    int start=a[0];
    for(int i=1;i<a.length;i++)
    {
      if(a[i]!=next(start,a.length))
        return false;
      start=next(start,a.length);
    }
    return true;
  }
  static boolean anticlockwise(int[] a)
  {
    int start=a[a.length-1];
    for(int i=a.length-2;i>=0;i--)
    {
      if(a[i]!=next(start,a.length))
        return false;
      start=next(start,a.length);
    }
    return true;
  }

  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int q=sc.nextInt();
    while(q-->0)
    {
      int n=sc.nextInt();
      int[] a=sc.nextIntArray(n);
      if(clockwise(a)||anticlockwise(a))
      {
        out.println("YES");
      }
      else
        out.println("NO");
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

