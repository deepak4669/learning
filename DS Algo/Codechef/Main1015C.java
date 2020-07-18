import java.util.*;
import java.io.*;

public class Main1015C
{
  static PrintWriter out=new PrintWriter(System.out);
  static class set implements Comparable<set>
  {
    int a;
    int b;
    public set(int x,int y)
    {
      this.a=x;
      this.b=y;
    }
    public int compareTo(set that)
    {
      int x=this.a-this.b;
      int y=that.a-that.b;
      if(x<y) return -1;
      else if(x>y) return +1;
      else return 0;
      
    }
  }
      
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int m=sc.nextInt();
    set[] a=new set[n];
    long min=0;
    for(int i=0;i<n;i++)
    {
      int x=sc.nextInt();
      int y=sc.nextInt();
      min+=y;
      a[i]=new set(x,y);
    }
    if(min>m)
    {
      out.println(-1);
    }
    else      
    {
      int cnt=n;
      Arrays.sort(a);
      for(int i=0;i<n;i++)
      {
        if(min-a[i].b+a[i].a<=m)
        {
          min=min-a[i].b+a[i].a;
          cnt--;
        }
       
        
      }
      out.println(cnt);
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

