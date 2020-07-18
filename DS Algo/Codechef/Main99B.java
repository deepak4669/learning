import java.util.*;
import java.io.*;

public class Main99B
{
  static PrintWriter out=new PrintWriter(System.out);
  static class bowl implements Comparable<bowl>
  {
    int a;
    int b;
    public bowl(int a,int b)
    {
      this.a=a;
      this.b=b;
    }
    public int compareTo(bowl that)
    {
      if(this.a<that.a)
         return -1;
      else if(this.a>that.a)
        return +1;
      else
        return 0;
    }
  }
      
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    bowl[] a=new bowl[n];
    for(int i=0;i<n;i++)
      a[i]=new bowl(sc.nextInt(),i+1);
    Arrays.sort(a);
    if(a[0].a==a[n-1].a)
      out.println("Exemplary pages.");
    else
    {
      
      int x=(a[0].a+a[n-1].a)/2;
      
      boolean flag=true;
      if((a[0].a+a[n-1].a)%2!=0)
        flag=false;
      for(int i=1;i<n-1;i++)
      {
        //out.println(n-1);
        if(x!=a[i].a)
        {
          flag=false;
          break;
        }
      }
      if(!flag)
        out.println("Unrecoverable configuration.");
      else
      {
        int v=x-a[0].a;
        int u=a[0].b;
        int w=a[n-1].b;
        out.println(v+" ml. from cup #"+u+" to cup #"+w+".");
      }
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

