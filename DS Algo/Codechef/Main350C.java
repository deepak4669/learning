import java.util.*;
import java.io.*;

public class Main350C
{
  static PrintWriter out=new PrintWriter(System.out);
  static class Point implements Comparable<Point>
  {
    int x;
    int y;
    public Point(int x,int y)
    {
      this.x=x;
      this.y=y;
    }
    public int compareTo(Point that)
    {
      long dist1=this.x*(long)(this.x)+(long)(this.y)*this.y;
      long dist2=that.x*(long)(that.x)+(long)(that.y)*(that.y);
      if(dist1<dist2) return -1;
      else if(dist1>dist2) return +1;
      else return 0;
    }
  }
  
  
  public static void main(String[] args) throws IOException
  {
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int x[]=new int[n];
    int y[]=new int[n];
    int moves=0;
    Point points[]=new Point[n];
    for(int i=0;i<n;i++)
    {
      x[i]=sc.nextInt();
      y[i]=sc.nextInt();
      if(x[i]!=0)
        moves+=2;
      if(y[i]!=0)
        moves+=2;
      moves+=2;
      points[i]=new Point(x[i],y[i]);
      
    }
    out.println(moves);
    Arrays.sort(points);
    for(int i=0;i<n;i++)
    {
      int a=points[i].x;
      int b=points[i].y;
      
      if(a!=0)
      {
        if(a>0)
        {
          out.println(1+" "+a+" "+'R');
          
        }
        if(a<0)
          out.println(1+" "+Math.abs(a)+" "+'L');
      }
      if(b!=0)
      {
        if(b>0)
          out.println(1+" "+b+" "+'U');
        else 
          out.println(1+" "+Math.abs(b)+" "+'D');
      }
      out.println("2");
      if(a!=0)
      {
        if(a>0)
          out.println(1+" "+a+" "+'L');
        else
          out.println(1+" "+Math.abs(a)+" "+'R');
      }
      if(b!=0)
      {
        if(b>0)
          out.println(1+" "+b+" "+'D');
        else
          out.println(1+" "+Math.abs(b)+" "+'U');
      }
      out.println("3");
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

